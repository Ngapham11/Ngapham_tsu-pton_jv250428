package com.ra.ss6.model.dao;

import com.ra.ss6.model.entity.Customer;
import com.ra.ss6.util.ConnectionDB;
import org.springframework.stereotype.Repository;
import com.ra.ss6.model.entity.Role;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
@Repository
public class CustomerDaoImp implements CustomerDao{
    @Override
    public List<Customer> getAll() {
        Connection connection=null;
        CallableStatement callableStatement=null;
        List<Customer>customers=new ArrayList<>();
        try {connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call get_all()}");
            ResultSet resultSet=callableStatement.executeQuery();

            while (resultSet.next()){
                Customer customer =new Customer();
               customer.setId(resultSet.getInt("id"));
                customer.setUsername(resultSet.getString("name"));
                customer.setPhone(resultSet.getString("phone"));
                customer.setAddress(resultSet.getString("address"));
                customer.setGender(resultSet.getString("gender"));
                customer.setEmail(resultSet.getString("email"));
                customer.setRole(Role.valueOf(resultSet.getString("role")));
                customers.add(customer);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            assert connection != null;
            ConnectionDB.closeConnection(connection);
        }return customers;
    }

    @Override
    public Customer getByName(String name) {
        Connection connection=null;
        CallableStatement callableStatement=null;
        Customer customer=new Customer();

        try {connection= ConnectionDB.openConnection();
            callableStatement=connection.prepareCall("{call get_by_name(?)}");
            callableStatement.setString(1,name);
            ResultSet resultSet=callableStatement.executeQuery();
            if (resultSet.next()){
                customer.setId(resultSet.getInt("id"));
                customer.setUsername(resultSet.getString("name"));
                customer.setPhone(resultSet.getString("phone"));
                customer.setAddress(resultSet.getString("address"));
                customer.setGender(resultSet.getString("gender"));
                customer.setEmail(resultSet.getString("email"));
                customer.setRole(Role.valueOf(resultSet.getString("role")));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            assert connection != null;
            ConnectionDB.closeConnection(connection);
        }return customer;
    }
}
