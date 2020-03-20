/*
package com.example.week6;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Service {
    private DAO salaryDao;


    @Autowired
    public Service(DAO salaryDao){
        this.salaryDao = salaryDao;
    }

    public void updateEmployeeSalary(int id){
        salaryDao.updateSalary(id);
    }

    public void showAllEmployees(){
        List<Salaried> employees = salaryDao.getAll();
        System.out.println();
        System.out.println("Employees list: ");
        for (Salaried employee: employees) {
            System.out.println(employee.toString());
        }
        System.out.println();
    }
}
*/
