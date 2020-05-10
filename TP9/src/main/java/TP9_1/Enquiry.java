package TP9_1;

public class Enquiry {
    private Customer customer;
    private Category category;
    public Enquiry(Customer customer, Category category) {
	this.customer = customer;
	this.category = category;
    }
    public Customer getCustomer() {
	return this.customer;
    }

    public Category getCategory() {
	return this.category;
    }
}
