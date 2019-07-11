package com.howtodoinjava.demo2;
 
import com.technicalkeeda.app.*;

public class Employee {
    private long employeeId;
    private String firstName;
    private String lastName;

    public Employee(long employeeId, String firstName, String lastName) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    
 
    public long getEmployeeId() {
        return employeeId;
    }
 
    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    @Override
    public String toString() {
        StringBuilder employee = new StringBuilder();
        employee.append("Employee Id :- " + this.employeeId + "\n");
        employee.append("First Name :- " + this.firstName + "\n");
        employee.append("Last Name :- " + this.lastName + "\n");
 
        return employee.toString();
    }
 
}