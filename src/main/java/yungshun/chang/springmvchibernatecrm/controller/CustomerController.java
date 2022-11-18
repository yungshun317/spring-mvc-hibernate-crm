package yungshun.chang.springmvchibernatecrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import yungshun.chang.springmvchibernatecrm.dao.CustomerDAO;
import yungshun.chang.springmvchibernatecrm.entity.Customer;
import yungshun.chang.springmvchibernatecrm.service.CustomerService;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    // Inject the customer service
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/list")
    public String listCustomers(Model model) {

        // Get customers from the DAO
        List<Customer> customers = customerService.getCustomers();

        // Add customers to the model
        model.addAttribute("customers", customers);

        return "list-customers";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {

        // Create model attribute to bind form data
        Customer customer = new Customer();

        model.addAttribute("customer", customer);

        return "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {

        // Save customer using service
        customerService.saveCustomer(customer);

        return "redirect:/customer/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("customerId") int id, Model model) {

        // Get customer from service
        Customer customer = customerService.getCustomer(id);

        // Set customer as a model attribute to pre-populate the form
        model.addAttribute("customer", customer);

        // Send over to our form
        return "customer-form";
    }
}
