package com.ecart.jpa.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.ecart.jpa.entity.Cart;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
	@Transactional
	@Modifying
	@Query(value = "DELETE FROM cart_item WHERE cart_item.buyer_id_fk = :buyerId"
			,nativeQuery = true)
	public void emptyCart(@Param("buyerId")Long buyerId);
	
	@Query(value = "SELECT * FROM cart_item cart WHERE cart.buyer_id_fk = :buyerId"
			,nativeQuery = true)
	public List<Cart> getAllCartItems(@Param("buyerId")Long buyerId);
		
	
	ResponseEntity<?> findAllById(Long buyerId, Long cartId);
}
