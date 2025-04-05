package Oops;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Employee ID:  ");
        int empId= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee Name:  ");
        String name = sc.nextLine();
        System.out.println("Enter Monthly Salary:  ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(empId,name,salary);
        emp.calcTax();

        System.out.println("Enter Product ID:  ");
        int pid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Price:  ");
        double price = sc.nextDouble();
        System.out.println("Enter the Quantity:  ");
        int quantity = sc.nextInt();

        Product product = new Product(pid,price,quantity);
        product.calcTax();
        sc.close();
    }
}
