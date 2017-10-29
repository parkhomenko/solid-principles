package com.hillel.patterns.openclosed;

public class DirectorSalaryOption implements SalaryOption {

    @Override
    public boolean correctOption(EmployeeType employeeType) {
        return employeeType == EmployeeType.DIRECTOR;
    }

    @Override
    public int calculate(int salary) {
        return salary * 5;
    }
}
