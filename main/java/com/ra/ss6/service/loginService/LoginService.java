package com.ra.ss6.service.loginService;

import com.ra.ss6.model.entity.Customer;

import java.util.List;

public interface LoginService {
    List<Customer> getAll();
    Customer getByName(String name);
}
