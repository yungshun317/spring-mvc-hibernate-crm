package yungshun.chang.springmvchibernatecrm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import yungshun.chang.springmvchibernatecrm.entity.Customer;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    // Inject the session factory
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers() {

        // Get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // Create a query
        Query<Customer> query = currentSession.createQuery("from Customer", Customer.class);

        // Execute query and get result list
        List<Customer> customers = query.getResultList();

        // Return the results
        return customers;
    }

    @Override
    public void saveCustomer(Customer customer) {

        // Get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // Save the customer
        currentSession.saveOrUpdate(customer);
    }

    @Override
    public Customer getCustomer(int id) {

        // Get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // Retrieve/Read from database using the primary key
        Customer customer = currentSession.get(Customer.class, id);

        return customer;
    }

    @Override
    public void deleteCustomer(int id) {

        // Get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // Delete object with primary key
        Query query = currentSession.createQuery("delete from Customer where id=:customerId");
        query.setParameter("customerId", id);
        query.executeUpdate();
    }
}
