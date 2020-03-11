package edu.citadel.csci603.proxy;

import java.util.List;

public class MySqlDataAccessLayer implements DataAccessLayer {

    @Override
    public Employee getEmployeeById(String id) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setFirstName("John");
        employee.setLastName("Smith");
        employee.setPhoneNumber("123-456-7890");
        employee.setAddress("123 Cool Way");
        return employee;
    }

    @Override
    public Employee getEmployeeByName(String name) {
        Employee employee = new Employee();
        employee.setId("1234");
        employee.setFirstName("John");
        employee.setLastName(name);
        employee.setPhoneNumber("123-456-7890");
        employee.setAddress("123 Cool Way");
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return List.of(new Employee());
    }
}
