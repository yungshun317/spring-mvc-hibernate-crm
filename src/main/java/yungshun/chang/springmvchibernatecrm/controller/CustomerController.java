package yungshun.chang.springmvchibernatecrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import yungshun.chang.springmvchibernatecrm.dao.CustomerDAO;
import yungshun.chang.springmvchibernatecrm.entity.Customer;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    // Inject the customer DAO
    @Autowired
    private CustomerDAO customerDAO;

    @RequestMapping("/list")
    public String listCustomers(Model model) {

        // Get customers from the DAO
        List<Customer> customers = customerDAO.getCustomers();

        // Add customers to the model
        model.addAttribute("customers", customers);

        return "list-customers";
    }
}
