package com.hillel.patterns.openclosed;

import java.util.List;

public class SalaryService {

    private SalaryCalculator salaryCalculator;

    public SalaryService(SalaryCalculator salaryCalculator) {
        this.salaryCalculator = salaryCalculator;
    }

    public int countSalary(List<Employee> emloyees) {
        int totalSalary = 0;

        for (Employee employee : emloyees) {
            totalSalary += salaryCalculator.calculate(employee);
        }

        return totalSalary;
    }
}
