package com.hillel.patterns.openclosed;

public class AccountantSalaryOption implements SalaryOption {

    @Override
    public boolean correctOption(EmployeeType employeeType) {
        return employeeType == EmployeeType.ACCOUNTANT;
    }

    @Override
    public int calculate(int salary) {
        return salary * 10;
    }
}
