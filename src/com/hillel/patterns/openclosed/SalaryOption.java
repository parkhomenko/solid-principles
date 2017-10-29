package com.hillel.patterns.openclosed;

public interface SalaryOption {

    boolean correctOption(EmployeeType employeeType);

    int calculate(int salary);

}
