package com.kism3t.employeecrudexample.exception;

import com.kism3t.employeecrudexample.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {
    public ResourceNotFoundException(String s) {
    }
}
