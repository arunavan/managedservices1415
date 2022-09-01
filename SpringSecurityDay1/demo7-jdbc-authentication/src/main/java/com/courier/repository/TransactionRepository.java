package com.courier.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.courier.entity.Transaction;

public interface TransactionRepository extends
		JpaRepository<Transaction, Integer> {

	@Query("select t from Transaction t where "
			+ "t.senderCity=?1 and  t.receiverCity=?2 and t.status='Pending' ")
	List<Transaction> findTransactions(
			@Param(value = "senderCity") String source,
			@Param(value = "recieverCity") String destination);

}
