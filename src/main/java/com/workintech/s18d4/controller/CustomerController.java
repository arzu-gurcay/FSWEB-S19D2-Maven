package com.workintech.s18d4.controller;

import com.workintech.s18d4.entity.Customer;
import com.workintech.s18d4.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
    final CustomerService customerService;

    @GetMapping
public List<Customer> findAll(){
    return customerService.findAll();
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable long id){
        return customerService.find(id);
    }

    @PostMapping
    public Customer save(Customer customer){
        return customerService.save(customer);
    }
}
