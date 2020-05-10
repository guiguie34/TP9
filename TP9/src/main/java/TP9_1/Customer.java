package TP9_1;

public class Customer {
    public static Customer JACK = new Customer("Jack");
    public static Customer JILL = new Customer("Jill");

    private String name;
    
    public Customer(final String name) {
	this.name = name;
    }
    public void reply(final String message) {
	System.out.println(this.name+": "+message);
    }
}