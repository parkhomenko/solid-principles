package com.hillel.patterns.openclosed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalaryCalculator {

    private List<SalaryOption> salaryOptions;

    public SalaryCalculator() {
        salaryOptions = new ArrayList<>(
                Arrays.asList(
                        new InitiateSalaryOption(),
                        new WorkerSalaryOption(),
                        new DirectorSalaryOption(),
                        new AccountantSalaryOption()
                )
        );
    }

    public int calculate(Employee employee) {
        for (SalaryOption salaryOption : salaryOptions) {
            if (salaryOption.correctOption(employee.getEmployeeType())) {
                return salaryOption.calculate(employee.getSalary());
            }
        }

        throw new IllegalArgumentException();
    }
}
