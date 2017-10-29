package com.hillel.patterns.openclosed;

public class InitiateSalaryOption implements SalaryOption {

    @Override
    public boolean correctOption(EmployeeType employeeType) {
        return employeeType == EmployeeType.INITIATE;
    }

    @Override
    public int calculate(int salary) {
        return (int) (salary * 1.1);
    }
}
