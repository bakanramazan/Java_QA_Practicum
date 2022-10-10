package com.ramazanbakan;

import java.util.Arrays;

/**
 * Employee
 *
 *
 */
public class Employee {
    private final String name;
    private final double salary;
    private final double[] workHours;
    private final int hireYear;

    /**
     * Employee(name, salary, workHours[], hireYear)
     *
     * @param name ?
     * @param salary ?
     * @param workHours ?
     * @param hireYear ?
     */
    public Employee(String name, double salary, double[] workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    /**
     *
     *
     * @return
     */
    public double tax() {
        return salary <= 1000 ? 0 : (salary + bonus()) * 0.03;
    }

    /**
     *
     *
     * @return
     */
    public double bonus() {
        double totalBonusValue = 0;
        for (int i = 0; i < workHours.length; i++) {
            if (workHours[i] > 40) {
                totalBonusValue += (workHours[i] - 40) * 30;
            }
        }
        return totalBonusValue;
    }

    /**
     *
     *
     * @return
     */
    public double raiseSalary() {
        int currentYear = 2021;
        int totalWorkYear = currentYear - hireYear;
        if (totalWorkYear < 10) {
            return salary * 0.05 + bonus() - tax();
        } else if (totalWorkYear < 20) {
            return salary * 0.1 + bonus() - tax();
        } else {
            return salary * 0.15 + bonus() - tax();
        }
    }


    /***
     * bu sınıfın özelliklerini döndüren method.
     *
     * name, salary, work hours, hire year, tax, bonus, raise salary, gross salary, net salary
     */
    @Override
    public String toString() {
        return  "Name : " + this.name + "\n" +
                "Salary : " + this.salary + "\n" +
                "Work Hours : " + Arrays.toString(this.workHours) + "\n" +
                "Hire Year : " + this.hireYear + "\n" +
                "Tax : " + this.tax() + "\n" +
                "Bonus : " + this.bonus() + "\n" +
                "Raise Salary : " + this.raiseSalary() + "\n" +
                "Gross Salary : " + (this.salary + this.bonus()) + "\n" +
                "Net Salary : " + (this.salary + this.bonus() - this.tax()) + "\n";
    }
}
