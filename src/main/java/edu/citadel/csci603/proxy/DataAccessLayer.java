package edu.citadel.csci603.proxy;

import java.util.List;

public interface DataAccessLayer {
    Employee getEmployeeById(String id);
    Employee getEmployeeByName(String name);
    List<Employee> getAllEmployees();
}
