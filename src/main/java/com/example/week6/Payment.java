package com.example.week6;

public class Payment {
    private Employee employee;

    public void calculateSalary(){
        if (employee instanceof Salaried){
            System.out.println("Total payment is: "+employee.getFixedSalary() + employee.getFixedSalary() * 0.10);
        }
    }


    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}

