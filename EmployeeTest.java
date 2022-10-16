package com.ramazanbakan;

/**
 * Employee Test
 *
 * This class is used to test the Employee class and show the results.
 * 
 */
public class EmployeeTest {
    /**
     * The main method is used to fill and run the employee fields.
     * 
     * @param args
     */
    public static void main(String[] args) {
        String name="Ramazan Kartal";
        double salary=1500;
        double[] workHours= new double[] {41, 40, 40, 40};
        int hireYear=2002;
        Employee employee=new Employee(name, salary,workHours,hireYear);
        System.out.println(employee);
    }
}
