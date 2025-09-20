package com.ra.ss6.model.dao;

import com.ra.ss6.model.entity.Customer;

import java.util.List;

public interface CustomerDao {
    List<Customer> getAll();
    Customer getByName(String name);

}
