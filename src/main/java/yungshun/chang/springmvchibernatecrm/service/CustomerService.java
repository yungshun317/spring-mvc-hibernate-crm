package yungshun.chang.springmvchibernatecrm.service;

import yungshun.chang.springmvchibernatecrm.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer customer);
}
