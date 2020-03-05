package com.ecart.jpa.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ecart.jpa.entity.Buyer;
import com.ecart.jpa.entity.Cart;
import com.ecart.jpa.repository.BuyerRepository;

@Service
public class BuyerService {

	@Autowired
	private BuyerRepository buyerRepository;


	public Page<Buyer> findAll(Pageable pageable) {

		return buyerRepository.findAll(pageable);
	}

	public Buyer save(@Valid Buyer buyer) {

		return buyerRepository.save(buyer);
	}

	public Buyer updateById(Buyer buyerId) {
		Optional<Buyer> buyer1 = buyerRepository.findById(buyerId.getId());
		Buyer b=null;
		if(buyer1.isPresent()) {
			b = buyer1.get();
			b.setUserName(buyerId.getUserName());
			b.setPassword(buyerId.getPassword());
			b.setEmail(buyerId.getEmail());
			b.setMobileNumber(buyerId.getMobileNumber());
			b = buyerRepository.save(b);
		}
		return b;
	}

	public Optional<Buyer> findById(Long buyerId) {
		
		return buyerRepository.findById(buyerId);
	}

}
