package com.ecart.jpa.controller;

import com.ecart.jpa.entity.Buyer;
import com.ecart.jpa.service.BuyerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class BuyerController {

    @Autowired
    private BuyerService buyerService;

    @GetMapping("/buyer")
    public Page<Buyer> getAllPosts(Pageable pageable) {
        return buyerService.findAll(pageable);
    }

    @PostMapping("/buyers")
    public Buyer createBuyer(@Valid @RequestBody Buyer post) {
        return buyerService.save(post);
    }

    @PutMapping("/buyers/{buyerId}")
    public Buyer updateBuyer(@PathVariable Buyer buyerId, @Valid @RequestBody Buyer postRequest) {
        return buyerService.updateById(buyerId);
    }
}
