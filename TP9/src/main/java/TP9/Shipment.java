package TP9;

import java.util.*;

public class Shipment {
	
	private static final int LIGHT_VAN_MAX_HEIGHT=20;
	private final List<Product> products = new ArrayList<>();
	private List<Product> subList1;
	private List<Product> subList2;
	
	

	public Shipment() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Add a product to the list
	 * @param p Product to add
	 */
	public void add(Product p) {
		products.add(p);
	}
	
	public void replace(Product old,Product p) {
		final int index=products.indexOf(old);
		products.set(index,p);
	}
	
	public void prepare() {
		Collections.sort(products);
		int indice=0;
		for(int i=0;i<products.size();i++) {
			if(products.get(i).getWeight()<LIGHT_VAN_MAX_HEIGHT) {
				indice++;
			}
		}
		subList1=products.subList(0,indice);
		subList2=products.subList(indice,products.size());
		
	}
	
	public Iterator<Product> iterator(){
		return products.iterator();
	}

	public List<Product> getProducts() {
		return products;
	}

	public List<Product> getSubList1() {
		return subList1;
	}

	public List<Product> getSubList2() {
		return subList2;
	}

}
