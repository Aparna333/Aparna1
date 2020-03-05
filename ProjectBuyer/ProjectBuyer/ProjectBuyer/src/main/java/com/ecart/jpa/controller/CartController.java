package com.ecart.jpa.controller;

import com.ecart.jpa.entity.Buyer;
import com.ecart.jpa.entity.Cart;
import com.ecart.jpa.service.BuyerService;
import com.ecart.jpa.service.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import javax.validation.Valid;

@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    @Autowired
    private BuyerService buyerService;

    @PostMapping("/buyers/{buyerId}/cart")
    public Optional<Buyer> addCartItem(@PathVariable (value = "buyerId") Long buyerId,
                                 @Valid @RequestBody Cart cart) {
        return buyerService.findById(buyerId);       
    }

    @PutMapping("/buyers/{buyerId}/cart/{cartId}")
    public Cart updateCartItem(@PathVariable (value = "buyerId") Long buyerId,
                                 @PathVariable (value = "cartId") Long cartId,
                                 @Valid @RequestBody Cart cart) {
        return cartService.updateCartItem(buyerId,cartId,cart);
    }
    @DeleteMapping(value = "/{cartitem}/deletecartitembyid")
	public String deleteCartItem(@PathVariable("cartitem") Long cartId) {
		return cartService.deleteCartItemById(cartId);
	}
	
	@DeleteMapping(value = "/{buyerId}/deleteall")
	public void emptyCart(@PathVariable("buyerId") Long buyerId) {
		cartService.emptyCart(buyerId);
	}
	@PostMapping(value = "/{buyerId}/checkout")
	public String checkoutCart(@PathVariable("buyerId") Long buyerId) {
		return cartService.checkoutCart(buyerId);
	}
    
}
