package com.itc.dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.itc.bean.CustomerBean;




@Repository
public class CustomerDAO {

	// Dummy database. Initialize with some dummy values.
	private static List<CustomerBean> customers;
	{
		customers = new ArrayList();
		customers.add(new CustomerBean(101, "John", "Doe", "djohn@gmail.com", "121-232-3435"));
		customers.add(new CustomerBean(201, "Russ", "Smith", "sruss@gmail.com", "343-545-2345"));
		customers.add(new CustomerBean(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
		customers.add(new CustomerBean(System.currentTimeMillis(), "Viral", "Patel", "vpatel@gmail.com", "356-758-8736"));
	}

	/**
	 * Returns list of customers from dummy database.
	 * 
	 * @return list of customers
	 */
	public List list() {
		return customers;
	}

	/**
	 * Return customer object for given id from dummy database. If customer is
	 * not found for id, returns null.
	 * 
	 * @param id
	 *            customer id
	 * @return customer object for given id
	 */
	public CustomerBean get(Long id) {

		for (CustomerBean c : customers) {
			if (c.getId().equals(id)) {
				return c;
			}
		}
		return null;
	}

	/**
	 * Create new customer in dummy database. Updates the id and insert new
	 * customer in list.
	 * 
	 * @param customer
	 *            Customer object
	 * @return customer object with updated id
	 */
	public CustomerBean create(CustomerBean customer) {
		customer.setId(System.currentTimeMillis());
		customers.add(customer);
		return customer;
	}

	/**
	 * Delete the customer object from dummy database. If customer not found for
	 * given id, returns null.
	 * 
	 * @param id
	 *            the customer id
	 * @return id of deleted customer object
	 */
	public Long delete(Long id) {

		for (CustomerBean c : customers) {
			if (c.getId().equals(id)) {
				customers.remove(c);
				return id;
			}
		}

		return null;
	}

	/**
	 * Update the customer object for given id in dummy database. If customer
	 * not exists, returns null
	 * 
	 * @param id
	 * @param customer
	 * @return customer object with id
	 */
	public CustomerBean update(Long id, CustomerBean customer) {

		for (CustomerBean c : customers) {
			if (c.getId().equals(id)) {
				customer.setId(c.getId());
				customers.remove(c);
				customers.add(customer);
				return customer;
			}
		}

		return null;
	}

	public void insert(CustomerBean customer) {
		customers.add(customer);
		
	}

}