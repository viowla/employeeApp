/*
package com.example.week6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {
    private Service salariedService;

    @Autowired
    public Controller(Service salariedService){
        this.salariedService = salariedService;
    }


    public void showMenu(){
        System.out.println("Welcome!");
        System.out.println("Select an option:");
        System.out.println("1) list all employees");
        System.out.println("2) update employees");
    }

    public void showAllEmployees(){
        salariedService.showAllEmployees();
    }

    public void updateEmployee(int id){
        salariedService.updateEmployeeSalary(id);
    }
}
*/
