package com.example.week6;

public class Commission implements Employee {
    private int id;
    private String name;
    private int sales;
    private int hourseWorked;


    public void setHourlyWorked(int hourseWorked) {
        this.hourseWorked = hourseWorked;
    }

    public int getHourlyWorked() {
        return hourseWorked;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSalary(int salary) {

    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getSales() {
        return sales;
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
        return 0;
    }

    @Override
    public int getHourly() {
        return hourseWorked;
    }
}
