package yungshun.chang.springmvchibernatecrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yungshun.chang.springmvchibernatecrm.dao.CustomerDAO;
import yungshun.chang.springmvchibernatecrm.entity.Customer;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    // Inject customer DAO
    @Autowired
    private CustomerDAO customerDAO;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return customerDAO.getCustomers();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer customer) {
        customerDAO.saveCustomer(customer);
    }

    @Override
    @Transactional
    public Customer getCustomer(int id) {
        return customerDAO.getCustomer(id);
    }
}
