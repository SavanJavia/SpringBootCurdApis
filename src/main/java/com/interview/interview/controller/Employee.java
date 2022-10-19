package com.interview.interview.controller;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class Employee {
     Employee(String param1, String param2) {
        System.out.println(">>>>>>>>>>>>>>>>>"+2);
    }

     Employee(String param1) {
        System.out.println(">>>>>>>>>>>>>>>>>"+1);
    }

   /* BeanInstantiationException: Failed to instantiate [com.interview.interview.controller.Employee]:
    No default constructor found;
     nested exception is java.lang.NoSuchMethodException: com.interview.interview.controller.Employee.<init>()*/

    /**
     * IT'S MANDATORY FOR
     * @Autowired
     * Employee emp;
     */
     Employee() {
        System.out.println(">>>>>>>>>>>>>>>>>");
    }

    String display(){
        System.out.println(">>>>>>>>>>>>>>>>>WELCOME");

        return "DISPLAY";
    }
}
