package TP9;


import java.util.Scanner;

import TP9_1.*;
import TP9_2.*;
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		Product p4=new Product();
		Product p5=new Product();
		Product p6=new Product();
		Product p7=new Product();
		Product p8=new Product();
		Product p9=new Product();
		
		p1.setName("Produit 1");
		p1.setWeight(10);
		
		p2.setName("Produit 2");
		p2.setWeight(24);
		
		p3.setName("Produit 3");
		p3.setWeight(19);
		
		p4.setName("Produit 4");
		p4.setWeight(6);
		
		p5.setName("Produit 5");
		p5.setWeight(21);
		
		p6.setName("Produit 6");
		p6.setWeight(20);
		
		p7.setName("Produit 7");
		p7.setWeight(10);
		
		p8.setName("Produit 8");
		p8.setWeight(30);
		
		p9.setName("Produit 9");
		p9.setWeight(8);
		
		Shipment ship=new Shipment();
		ship.add(p1);
		ship.add(p2);
		ship.add(p3);
		ship.add(p4);
		ship.add(p5);
		ship.add(p6);
		ship.add(p7);
		ship.add(p8);
		ship.add(p9);
		
		ship.prepare();
		
		System.out.println(ship.getSubList1());
		System.out.println(ship.getSubList2());
		
		System.out.println("\nPart Queue");
		
		HelpDesk desk = new HelpDesk();
	    desk.enquire(Customer.JACK,Category.PHONE);
	    desk.enquire(Customer.JACK,Category.PRINTER);    
	    desk.enquire(Customer.JILL,Category.PRINTER);
	    desk.enquire(Customer.JILL,Category.PHONE);
	    desk.processGeneralEnquiry();
	    desk.processPrinterEnquiry();
	    desk.processAllEnquiries();
	    
	    System.out.println("\nPart Calcultate:");
	    SimpleCalculator calcul = new SimpleCalculator();
	    
	    Scanner sc = new Scanner(System.in); 
		System.out.println("Insert your operation (with only + or -) AND insert a space between all characters. You can start with a negative number"); 
        String operation= sc.nextLine();
	    String operation1 = "4 + 6 - 3 + 1 * 4"; //error case
	    try {
			System.out.println("Result= "+calcul.calculate(operation));
			System.out.println("And the error case: ");
			System.out.println("Resultat= "+calcul.calculate(operation1));
		} catch (NotAOperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSpaceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
