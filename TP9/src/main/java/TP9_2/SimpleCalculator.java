package TP9_2;

import java.util.*;

public class SimpleCalculator {

	private final Queue<String> operation = new ArrayDeque<>();
	
	public SimpleCalculator() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param op operation store into a String
	 * @return The result of the procedured operation
	 * @throws NotAOperationException Throws this exception if the operators if different of + or -
	 * @throws NoSpaceException Throws this exception is the space convention is not respected
	 */
	public int calculate(String op) throws NotAOperationException,NoSpaceException{
		int resultat=0;
		for (int i = 0; i < op.length(); i++){ //checks the space
			char chara = op.charAt(i);
			if(chara != ' ' && i%2 !=0) {
				throw new NoSpaceException("Error, a space is required");
			}
		}
		if( op.charAt(0)== '-') { //checks if the first number is negative
			try {
				String[] opp = op.split(" ");
				String operande="-";
				for(int i=0;i<opp.length;i++) {
					operation.offer(opp[i]);
				}
				for(int i=0;i<opp.length;i++) {
					if(i%2!=0) {
						if(operande.equals("+")) { //makes the operation if possible or go to the catch
							resultat=resultat+Integer.parseInt(opp[i]);
						}
						else if(operande.equals("-")) {
							resultat=resultat-Integer.parseInt(opp[i]);
						}
					}
					else {
						if(opp[i].equals("+")) { //checks if the operation is valid
							operande="+";
						}
						else if(opp[i].equals("-")) {
							operande="-";
						}
						else {
							throw new NotAOperationException("Error not an authorized operation (+ or -) ");
						}
					}
				}
			}
			catch (NumberFormatException e)
			{
				System.err.println("Not a number");
			}
			
		}
		else { //same as top but in the case where the first number is positive
			try {
				String[] opp = op.split(" ");
				String operande="+";
				for(int i=0;i<opp.length;i++) {
					operation.offer(opp[i]);
				}
				for(int i=0;i<opp.length;i++) {
					if(i%2==0) {
						if(operande.equals("+")) {
							resultat=resultat+Integer.parseInt(opp[i]);
						}
						else if(operande.equals("-")) {
							resultat=resultat-Integer.parseInt(opp[i]);
						}
					}
					else {
						if(opp[i].equals("+")) {
							operande="+";
						}
						else if(opp[i].equals("-")) {
							operande="-";
						}
						else {
							throw new NotAOperationException("Error not an authorized operation (+ or -) ");
						}
					}
				}
			}
			catch (NumberFormatException e)
			{
				System.err.println("Not a number");
			}
		}
		return resultat;
	}

}
