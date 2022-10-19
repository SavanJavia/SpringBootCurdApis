package com.interview.interview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class College {
        @Autowired
        Employee emp;

         /*College(Employee emp) {
            System.out.println(">>>>>>>>>>>>>>>>>"+emp.display());
            this.emp = emp;
        }*/
}

