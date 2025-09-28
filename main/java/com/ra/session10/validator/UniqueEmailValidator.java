package com.ra.session10.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
// day la lop trien khai
public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail,String> {
//co 2 tham so
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}
