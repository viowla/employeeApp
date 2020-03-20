package com.example.week6;

import com.sun.xml.internal.bind.v2.runtime.Name;
import org.springframework.data.repository.CrudRepository;
import  com.example.week6.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    boolean findAllByName(String name);
}
