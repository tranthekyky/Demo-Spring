package com.waggy.demospring.controller;


import com.waggy.demospring.model.Customer;
import com.waggy.demospring.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ControllerCustomer {

    @Autowired
    private CustomerServiceImpl customerService;

    @GetMapping("/customers")
    public void showListCustomers(HttpServletRequest request) {
        List<Customer> list = customerService.findAll() ;
        request.setAttribute("list", list);
        request.getRequestDispatcher("index.jsp");
    }
}
