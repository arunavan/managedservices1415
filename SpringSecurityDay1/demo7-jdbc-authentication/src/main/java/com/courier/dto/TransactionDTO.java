package com.courier.dto;

import java.time.LocalDate;

import com.courier.entity.Transaction;

public class TransactionDTO {

	private int id;

	private String sender;

	private String senderAddress;

	private String senderCity;

	private String receiver;

	private String receiverAddress;

	private String receiverCity;

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

	public static Transaction dtoToEntityConvertor(TransactionDTO transactionDTO) {

		Transaction transaction = new Transaction();

		transaction.setId(transactionDTO.getId());
		transaction.setSender(transactionDTO.getSender());
		transaction.setSenderAddress(transactionDTO.getSenderAddress());
		transaction.setSenderCity(transactionDTO.getSenderCity());
		transaction.setReceiver(transactionDTO.getReceiver());
		transaction.setReceiverAddress(transactionDTO.getReceiverAddress());
		transaction.setReceiverCity(transactionDTO.getReceiverCity());
		transaction.setStatus(transactionDTO.getStatus());
		transaction.setDate(transactionDTO.getDate());

		return transaction;
	}

	public static TransactionDTO entityToDTOConvertor(Transaction transaction) {

		TransactionDTO transactionDTO = new TransactionDTO();

		transactionDTO.setId(transaction.getId());
		transactionDTO.setSender(transaction.getSender());
		transactionDTO.setSenderAddress(transaction.getSenderAddress());
		transactionDTO.setSenderCity(transaction.getSenderCity());
		transactionDTO.setReceiver(transaction.getReceiver());
		transactionDTO.setReceiverAddress(transaction.getReceiverAddress());
		transactionDTO.setReceiverCity(transaction.getReceiverCity());
		transactionDTO.setStatus(transaction.getStatus());
		transactionDTO.setDate(transaction.getDate());

		return transactionDTO;
	}
}
