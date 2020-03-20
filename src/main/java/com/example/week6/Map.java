/*
package com.example.week6;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Map implements RowMapper<Salaried> {

    @Override
    public Salaried mapRow(ResultSet resultSet, int i) throws SQLException {
        Salaried employee = new Salaried();
        employee.setId(resultSet.getInt(1));
        employee.setName(resultSet.getString(2));
        employee.setSalary(resultSet.getInt(3));


        return employee;
    }
}
*/
