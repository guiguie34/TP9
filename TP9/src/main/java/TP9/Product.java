package TP9;

import java.io.Serializable;

public class Product implements Serializable,Comparable<Product> { //JavaBean class !

	
	private String name;
	private int weight;
	
	public Product() { //no args
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}


	@Override
	public int compareTo(Product o) {
		
		return this.getWeight()-o.getWeight();
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", weight=" + weight + "]";
	}

}
