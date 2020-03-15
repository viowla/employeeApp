package com.example.week6;

public class Hourly implements Employee {
    private int id;

    private String name;
    private int salary;
    private int hourWorked;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void setHourlyWorked(int hourWorked) {

    }


    @Override
    public void setSales(int sales) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSalary() {
        return salary;
    }


    @Override
    public int getHourly() {
        return salary;
    }
}
