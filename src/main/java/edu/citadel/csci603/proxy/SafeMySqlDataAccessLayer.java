package edu.citadel.csci603.proxy;

import java.util.List;

public class SafeMySqlDataAccessLayer implements DataAccessLayer {

    private MySqlDataAccessLayer mySqlDataAccessLayer;
    private boolean isLocked;

    public SafeMySqlDataAccessLayer() {
        mySqlDataAccessLayer = new MySqlDataAccessLayer();
    }

    @Override
    public Employee getEmployeeById(String id) {
        waitForResourceToBeAvailable();
        return mySqlDataAccessLayer.getEmployeeById(id);
    }

    @Override
    public Employee getEmployeeByName(String name) {
        waitForResourceToBeAvailable();
        return mySqlDataAccessLayer.getEmployeeByName(name);
    }

    @Override
    public List<Employee> getAllEmployees() {
        waitForResourceToBeAvailable();
        return mySqlDataAccessLayer.getAllEmployees();
    }

    public void waitForResourceToBeAvailable() {
        while (isLocked) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Waiting...");
            }
        }
    }
}
