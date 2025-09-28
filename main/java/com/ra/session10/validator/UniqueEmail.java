package com.ra.session10.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;
//day la lop dinh nghia cach thuc kiem tra du lieu
@Documented
@Constraint(validatedBy = UniqueEmailValidator.class)
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueEmail {
    String message() default"Email da ton tai";
    Class<?>[]groups() default {};
    Class<? extends Payload>[]payload() default {};
}
