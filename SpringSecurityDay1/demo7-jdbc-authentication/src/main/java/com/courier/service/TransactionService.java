package com.courier.service;

import java.util.List;

import com.courier.dto.TransactionDTO;

public interface TransactionService {
	public TransactionDTO addTransaction(TransactionDTO t);

	public List<TransactionDTO> getTransactions(String source,
			String destination);
}
