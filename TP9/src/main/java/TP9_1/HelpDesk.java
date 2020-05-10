package TP9_1;

import java.util.*;
public class HelpDesk {
  private final Queue<Enquiry> enquiries = new ArrayDeque<>();
  public void enquire(final Customer customer, final Category category) {
    enquiries.offer(new Enquiry(customer,category));
  }
  public void processAllEnquiries() {
    Enquiry enquiry;
    while( (enquiry = enquiries.poll()) != null) {
	enquiry.getCustomer().reply("Have you tried to turning your "+enquiry.getCategory().getName()+" off and on again?");
    }
  }
  
  public void processPrinterEnquiry() {
	  final Enquiry enquiry= enquiries.peek();
	  if(enquiry !=null && enquiry.getCategory() == Category.PRINTER) {
		  enquiries.remove();
		  enquiry.getCustomer().reply("Is it out of paper");
	  }
	  else {
		  System.out.println("No work to do, let's have some coffee!");
	  }
  }
  
  public void processGeneralEnquiry() {
	  final Enquiry enquiry= enquiries.peek();
	  if(enquiry !=null && enquiry.getCategory() != Category.PRINTER) {
		  enquiries.remove();
		  enquiry.getCustomer().reply("Have you tried to turning it off and on again ?");
	  }
	  else {
		  System.out.println("No work to do, let's have some coffee!");
	  }
  }
}
