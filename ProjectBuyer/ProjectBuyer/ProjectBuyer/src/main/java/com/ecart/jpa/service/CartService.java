package com.ecart.jpa.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.ecart.jpa.entity.Buyer;
import com.ecart.jpa.entity.Cart;
import com.ecart.jpa.entity.Items;
import com.ecart.jpa.entity.PurchaseHistory;
import com.ecart.jpa.entity.Transactions;
import com.ecart.jpa.exception.ResourceNotFoundException;
import com.ecart.jpa.repository.BuyerRepository;
import com.ecart.jpa.repository.CartRepository;
import com.ecart.jpa.repository.ItemRepository;
import com.ecart.jpa.repository.PurchaseRepository;
import com.ecart.jpa.repository.TransactionRepository;

@Service
public class CartService {

	@Autowired
	private CartRepository cartRepository;

	@Autowired
	private BuyerRepository buyerRepository;
	
	@Autowired
	private PurchaseRepository purchaseRepository;
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	@Autowired
	private ItemRepository itemRepository;

	/*public Cart addCartItem(@PathVariable (value = "buyerId") Long buyerId,
			@PathVariable (value = "itemId") Long itemId,
			@Valid @RequestBody Cart cart) {
		Optional<Buyer> buyer=buyerRepository.findById(buyerId);
		Buyer buyer1=buyer.get();
		//return buyer.cartRepository.save(cart);
		//return buyerRepo.findById(buyerId,itemId);
		return null;
	}*/
	public Cart addCartItem( Long buyerId, Cart cart) {
		return buyerRepository.findById(buyerId).map(buyer -> {
			cart.setBuyer(buyer);
			return cartRepository.save(cart);
		}).orElseThrow(() -> new ResourceNotFoundException("BuyerId " + buyerId + " not found"));
	}

	public Cart updateCartItem(Long buyerId, Long cartId, @Valid Cart cartRequest) {
		if(!buyerRepository.existsById(buyerId)) {
			throw new ResourceNotFoundException("BuyerId " + buyerId + " not found");
		}
		return cartRepository.findById(cartId).map(cart -> {
			cart.setItemId(cartRequest.getItemId());
			cart.setQuantity(cartRequest.getQuantity());
			return cartRepository.save(cart);
		}).orElseThrow(() -> new ResourceNotFoundException("CartId " + cartId + "not found"));
	}
	public String deleteCartItemById(Long cartId) {
		cartRepository.deleteById(cartId);
		return "Item with cartId "+cartId+" is deleted.";
	}
	
	public void emptyCart(Long buyerId) {
		//Optional<Buyer> buyerInfo = buyerRepository.findById(buyerId);
		cartRepository.emptyCart(buyerId);
	}
	
	public String checkoutCart(Long buyerId) {
		Double totalAmount = 0.00;
		Transactions transaction = null;
		PurchaseHistory purchaseHistory = null;
		Items cartItem = null;
		//Integer iter = 0;
		List<Cart> getAllCart = cartRepository.getAllCartItems(buyerId);
		for(Cart cart : getAllCart) {
			Optional<Items> item = itemRepository.findAllById(cart.getItemId());
			totalAmount += item.get().getPrice();
		}
		Optional<Buyer> buyer  = buyerRepository.findById(buyerId);
		transaction = new Transactions();
		transaction.setBuyerId(buyer.get());
		transaction.setTotalAmount(totalAmount);
		transaction.setTransactionType("Debited");
		transaction.setRemarks("PaymentDone");

		transactionRepository.save(transaction);


		for(Cart cart : getAllCart) {
			//System.out.println(iter++);
			purchaseHistory = new PurchaseHistory();
			purchaseHistory.setTransactions(transaction);
			purchaseHistory.setItemId(cart.getItemId());
			purchaseHistory.setBuyer(buyer.get());
			purchaseHistory.setRemarks("purchased");
			purchaseHistory.setNumberOfItems(cart.getQuantity());

			purchaseRepository.save(purchaseHistory);

			cartItem = new Items();
			Optional<Items> newitem = itemRepository.findById(cart.getItemId());
			cartItem = newitem.get();
			Long quantity = cartItem.getStockNumber();
			cartItem.setStockNumber(quantity-cart.getQuantity());

			itemRepository.save(cartItem);

		}

		cartRepository.emptyCart(buyerId);

		return "Successful";
	}
}

