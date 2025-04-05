package Oops;

public class Employee implements Taxable{
      int empId;
     String name;
     double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void calcTax() {
        double yearlySalary = salary * 12;
        double tax = yearlySalary * incomeTax;
        System.out.println("Income Tax for "+ name +"(Yearly Salary:" + yearlySalary +"): ₹" +tax);

    }
}

