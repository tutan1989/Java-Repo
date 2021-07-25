package com.itc.restcontroller;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.itc.bean.CustomerBean;

@RestController
public class CustomerController {

	
@RequestMapping(produces = MediaType.APPLICATION_JSON, 
method = RequestMethod.GET,value = "/details")
@ResponseBody
	public CustomerBean customerDetails() {
		// we have to inject DAO object here
	CustomerBean customer=new CustomerBean();
		//customer.setId(1);
		//customer.setName("aditya");
		//customer.setAddress("bangalore");
		
		
		return customer;
	}
}
