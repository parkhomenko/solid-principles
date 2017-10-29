package com.hillel.patterns.openclosed;

public class Employee {

    private String name;
    private EmployeeType employeeType;
    private int salary;

    public Employee(String name, EmployeeType employeeType, int salary) {
        this.name = name;
        this.employeeType = employeeType;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
