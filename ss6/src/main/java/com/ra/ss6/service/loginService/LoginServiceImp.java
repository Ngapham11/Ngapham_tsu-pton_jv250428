package com.ra.ss6.service.loginService;

import com.ra.ss6.model.dao.CustomerDao;
import com.ra.ss6.model.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LoginServiceImp implements LoginService{
    @Autowired
    private CustomerDao customerDao;
    @Override
    public List<Customer> getAll() {
        List<Customer>customers=customerDao.getAll();
        return customers;
    }

    @Override
    public Customer getByName(String name) {
        return customerDao.getByName(name);
    }
}
