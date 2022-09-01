package com.courier.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courier.dto.TransactionDTO;
import com.courier.entity.Transaction;
import com.courier.repository.TransactionRepository;

@Service(value = "transactionService")
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionRepository repository;

	@Override
	public TransactionDTO addTransaction(TransactionDTO transactionDTO) {
		Transaction transaction = TransactionDTO
				.dtoToEntityConvertor(transactionDTO);
		transaction = repository.saveAndFlush(transaction);
		return TransactionDTO.entityToDTOConvertor(transaction);
	}

	@Override
	public List<TransactionDTO> getTransactions(String source,
			String destination) {
		List<Transaction> transactions = repository.findTransactions(source,
				destination);

		List<TransactionDTO> transactionsDTO = new ArrayList<>();

		for (Transaction transaction : transactions) {

			transactionsDTO.add(TransactionDTO
					.entityToDTOConvertor(transaction));
		}

		return transactionsDTO;

	}

}
