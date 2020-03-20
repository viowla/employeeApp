/*
package com.example.week6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class DAO implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher eventPublisher;
    private JdbcTemplate jdbcTemplate;

    private final String GET_ALL_EMPLOYEES = "SELECT * FROM Employee";
    private final String GET_EMPLOYEE_BY_ID = "SELECT * FROM Employee WHERE id =";
    private final String UPDATE_EMPLOYEES_SALARY = "UPDATE Employee SET salary =";
    private final String DELETE_EMPLOYEE = "DELETE FROM Employee WHERE id =";
    private final String CHANGE_EMPLOYEE_NAME = "UPDATE Employee SET name = ";


    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
this.eventPublisher=applicationEventPublisher;
    }

    @Autowired
    public DAO(Database database) {
        this.jdbcTemplate = new JdbcTemplate(database.getDataSource());
    }

    public void create(Salaried user) {
        this.eventPublisher.publishEvent(new UserCreate(this, user));
    }

    public List<Salaried> getAll() {
        return jdbcTemplate.query(GET_ALL_EMPLOYEES, new Map());
    }

    public void updateSalary(int id) {
        this.eventPublisher.publishEvent(new UserUpdate(this, getUserById(id).get(0)));
        jdbcTemplate.execute(UPDATE_EMPLOYEES_SALARY+"salary + (salary * 0.10) WHERE id ="+id);
    }

    public List<Salaried> getUserById(int id) {
        return jdbcTemplate.query(GET_EMPLOYEE_BY_ID+id, new Map());
    }
}
*/
