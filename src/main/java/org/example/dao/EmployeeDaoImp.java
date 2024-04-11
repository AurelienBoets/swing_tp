package org.example.dao;

import org.example.entity.Employee;

public class EmployeeDaoImp implements BaseDao<Employee> {
    @Override
    public Class<Employee> getEntityClass() {
        return Employee.class;
    }
}
