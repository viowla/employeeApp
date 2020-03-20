package com.example.week6;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Commission extends Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double fixedSalary;
    private double hourRate;
    private int hoursWorked;
    private float commRate;

    public Commission(String name, double fixedSalary, double hourRate, int hoursWorked, float commRate, EmployeeType emplType) {
        super(name, fixedSalary, hourRate, hoursWorked, commRate, emplType);
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getFixedSalary() {
        return super.getFixedSalary();
    }

    @Override
    public void setFixedSalary(double fixedSalary) {
        super.setFixedSalary(fixedSalary);
    }

    @Override
    public double getHourRate() {
        return super.getHourRate();
    }

    @Override
    public void setHourRate(double hourRate) {
        super.setHourRate(hourRate);
    }

    @Override
    public int getHoursWorked() {
        return super.getHoursWorked();
    }

    @Override
    public void setHoursWorked(int hoursWorked) {
        super.setHoursWorked(hoursWorked);
    }

    @Override
    public float getCommRate() {
        return super.getCommRate();
    }

    @Override
    public void setCommRate(float commRate) {
        super.setCommRate(commRate);
    }
}
