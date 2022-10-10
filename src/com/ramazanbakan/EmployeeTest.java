package bakan.com;

public class EmployeeTest {
    public static void main(String[] args) {
        String name="Ramazan Kartal";
        double salary=1500;
        double[] workHours= new double[] {41, 40, 40, 40};
        int hireYear=2002;
        Employee employee=new Employee(name, salary,workHours,hireYear);
        System.out.println(employee);
    }
}
