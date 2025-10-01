package com.ra.session10.service;

import com.ra.session10.entity.Customer;
import com.ra.session10.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
    public Customer findById(long id){
        return customerRepository.findById(id);
    }
    public boolean save(Customer customer){
        return customerRepository.save(customer);
    }
    public boolean delete(Customer customer){
        return customerRepository.delete(customer);
    }
    public boolean checkEmailExited(String email){
        return customerRepository.checkEmailExisted(email);
    }
    public boolean checkNameExited(String name){
        return customerRepository.checkUserName(name);
    }
 public List<Customer> getCustomerWithPagination(int page,int size){
        return customerRepository.getCustomerWithPagination(page,size);
 }
 public int countCustomer(){
      return   customerRepository.findAll().size();
 }
}
