package Oops;

public class Product implements Taxable{
    public int pid;
    public double price;
    public int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void calcTax() {
        double tax = price * salesTax;
        System.out.println("Sales Tax on Product Id"+ pid +"( Unit Price ₹"+ price +"): ₹"+ tax);

    }
}
