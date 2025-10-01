package com.ra.session10.validator;

import com.ra.session10.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
// day la lop trien khai
public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail,String> {
//co 2 tham so
    @Autowired
    private CustomerService customerService;
    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        return email!=null && customerService.checkEmailExited(email);
    }
}
