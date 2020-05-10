package TP9_1;

public class Category {
    public static Category PHONE = new Category("Phone");
    public static Category PRINTER = new Category("Printer");

    private String name;
    
    public Category(String name) {
	this.name = name;
    }

    public String getName() {
	return this.name;
    }
}