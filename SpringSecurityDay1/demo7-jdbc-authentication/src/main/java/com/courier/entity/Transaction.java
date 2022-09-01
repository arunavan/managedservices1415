package com.courier.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false, length = 20)
	private String sender;

	@Column(name = "sender_address", nullable = false, length = 25)
	private String senderAddress;

	@Column(name = "sender_city", nullable = false, length = 20)
	private String senderCity;

	@Column(nullable = false, length = 20)
	private String receiver;

	@Column(name = "receiver_address", nullable = false, length = 25)
	private String receiverAddress;

	@Column(name = "receiver_city", nullable = false, length = 20)
	private String receiverCity;

	@Column(nullable = false, length = 10, columnDefinition = "varchar(10) default 'Pending'")
	private String status;

	private LocalDate date = LocalDate.now();

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getSenderAddress() {
		return senderAddress;
	}

	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}

	public String getSenderCity() {
		return senderCity;
	}

	public void setSenderCity(String senderCity) {
		this.senderCity = senderCity;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getReceiverAddress() {
		return receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverCity() {
		return receiverCity;
	}

	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", sender=" + sender
				+ ", senderAddress=" + senderAddress + ", senderCity="
				+ senderCity + ", receiver=" + receiver + ", receiverAddress="
				+ receiverAddress + ", receiverCity=" + receiverCity
				+ ", status=" + status + "]";
	}

}
