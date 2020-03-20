package com.example.week6;

import org.springframework.context.ApplicationEvent;

public class UserUpdate extends ApplicationEvent {

    private Employee employee;

    public UserUpdate(Object source, Employee employee) {
        super(source);
        this.employee = employee;
    }

    public Employee getUser() {
        return employee;
    }
}
