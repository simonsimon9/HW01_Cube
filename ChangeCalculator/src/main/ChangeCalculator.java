package main;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Program prompts for and reads double value 
 * representing a monetary amount.
 * Then it determines the fewest number of each bill and
 * coin needed to represent that amount, starting with
 * the highest. 
 * 
 * @author simon
 *
 */
public class ChangeCalculator {
	private double[] denominations;
	private String[] denominationsMessages;
	
	/**
	 * Class constructor
	 */
	public ChangeCalculator() {
		denominations = new double[] {20, 10,5, 1, .25,.1,.05,.01};
		denominationsMessages = new String[] {
				" twenty dollar bills",
				" ten dollar bills",
				" five dollar bills",
				" one dollar bills",
				" quarters",
				" dimes",
				" nickels",
				" pennies"
		};
	}
	/**
	 * Calculates the fewest number of each bill and
	 * coin needed to represent the amount, starting with 
	 * highest
	 * 
	 * First determines how many bills or coin divides 
	 * the amount by the denomination resulting in the number of bills.
	 * Afterwards perform modulus on the amount by the 
	 * denomination for the remainder result. 
	 * 
	 * 
	 * @param   amount  the monetary value of the currency
	 * 
	 */
	public void returnChange(double amount) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(amount));
		
		for(int i = 0; i<denominations.length; i++) {
			if(amount < .05) {
				System.out.println((int)Math.ceil(amount/denominations[i]) + denominationsMessages[i]);
			}
			else if(amount >= denominations[i]) {
				double fewestChange = amount/denominations[i];
				System.out.println((int)fewestChange +denominationsMessages[i]);
			}else {
				System.out.println(0 + denominationsMessages[i]);
			}
			amount = amount % denominations[i];
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChangeCalculator program = new ChangeCalculator();
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter amount: ");
		double amount = userInput.nextDouble();
		program.returnChange(amount);
		
		userInput.close();
	}
	
	
	
}
