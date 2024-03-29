package springdemo.service;

import java.util.List;

import springdemo.entity.Customer;

public interface CustomerService 
{
	Customer getCustomers = null;

	public List<Customer> getCustomers(int theSortField);
	
	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
	public List<Customer> searchCustomers(String theSearchName);
}
