package com.courier.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping(value = "/")
	public String showIndexPage() {

		return "index";
	}

	@GetMapping(value = "index")
	public String showHomePage() {

		return "index";
	}

	@GetMapping(value = "logout")
	public String showLogOut() {

		return "login";
	}

	@GetMapping(value = "login")
	public String showIndex() {

		return "login";
	}

	@GetMapping(value = "accessDenied")
	public String showAccessDenied() {

		return "accessDenied";
	}

}
