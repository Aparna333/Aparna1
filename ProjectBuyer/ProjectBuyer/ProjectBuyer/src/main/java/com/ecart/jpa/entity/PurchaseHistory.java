package com.ecart.jpa.entity;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "purchaseHistory")
public class PurchaseHistory extends AuditModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pur_id")
	private Long purchaseId;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "buyerId", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
	@JsonIdentityReference(alwaysAsId=true)
	@JsonProperty("buyerId")
	private Buyer buyer;

	private Long sellerId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "transaction_history_fk")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Transactions transactions;

	private Long itemId;

	@Column(name="no_items")
	@NotNull
	private int numberOfItems;

	@NotNull
	private String remarks;
	
	public PurchaseHistory() {
		// TODO Auto-generated constructor stub
	}
	
	public PurchaseHistory(Long purchaseId, Buyer buyer, Long sellerId, Transactions transactions, Long itemId,
			@NotNull int numberOfItems, @NotNull String remarks) {
		super();
		this.purchaseId = purchaseId;
		this.buyer = buyer;
		this.sellerId = sellerId;
		this.transactions = transactions;
		this.itemId = itemId;
		this.numberOfItems = numberOfItems;
		this.remarks = remarks;
	}

	public Long getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(Long purchaseId) {
		this.purchaseId = purchaseId;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public Transactions getTransactions() {
		return transactions;
	}

	public void setTransactions(Transactions transactions) {
		this.transactions = transactions;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public int getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "PurchaseHistory [purchaseId=" + purchaseId + ", buyer=" + buyer + ", sellerId=" + sellerId
				+ ", transactions=" + transactions + ", itemId=" + itemId + ", numberOfItems=" + numberOfItems
				+ ", remarks=" + remarks + "]";
	}


}
