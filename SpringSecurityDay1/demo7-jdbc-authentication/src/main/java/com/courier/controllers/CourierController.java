package com.courier.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.courier.dto.TransactionDTO;
import com.courier.service.TransactionService;

@Controller
public class CourierController {
	@Autowired
	TransactionService service;

	@GetMapping(value = "transactions.htm")
	public String transaction(ModelMap map) {

		TransactionDTO trans = new TransactionDTO();
		map.addAttribute("transaction", trans);
		return "sendcourier";
	}

	@PostMapping(value = "transactions.htm")
	public String addCourier(@ModelAttribute TransactionDTO transactionDTO,
			HttpServletRequest request) {
		transactionDTO.setStatus("Pending");
		transactionDTO = service.addTransaction(transactionDTO);
		request.setAttribute("transaction", transactionDTO);

		return "sendsuccess";
	}
}
