package com.hillel.patterns.openclosed;

public class WorkerSalaryOption implements SalaryOption {

    @Override
    public boolean correctOption(EmployeeType employeeType) {
        return employeeType == EmployeeType.WORKER;
    }

    @Override
    public int calculate(int salary) {
        return salary + 500;
    }
}
