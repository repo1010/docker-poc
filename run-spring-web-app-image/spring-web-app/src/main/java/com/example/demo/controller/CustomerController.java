package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	private List<Customer> customers = Arrays.asList(new Customer("c1", "Vishal Kumar", "Mumbai", 30),
			new Customer("c2", "Rakesh Roshan", "Chennai", 40), new Customer("c3", "Devesh Anand", "Bihar", 20));

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("home", new Customer());
		return "index";
	}

	@RequestMapping(value = "/{custid}", method = RequestMethod.GET)
	public String getCustomerInfo(@PathVariable String custid, Model model) {

		Customer matchedCustomer = customers.stream().filter(c -> c.getId().equals(custid)).findAny().get();
		model.addAttribute("customers", matchedCustomer);

		return "customer";
	}
}
