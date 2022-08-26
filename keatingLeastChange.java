// Written by Kevin Keating
// Date written: 9/2/2021
// Purpose: To generate a number and calculate the least amount
// of change needed to add it all together

package keatingLeastChange;

import java.util.Random;

public class keatingLeastChange {
	
	static int number = 0;
	final static int halfDollar = 50;
	final static int quarter = 25;
	final static int dime = 10;
	final static int nickel = 5;
	final static int penny = 1;

	public static void main(String[] args) {
		//Gets a random number
		number = changeMethods.getRandom();
		
		//Counts half dollars
		number = changeMethods.halfDollarCountMethod(number, halfDollar);
		
		//Counts quarters
		number = changeMethods.quarterCountMethod(quarter, number);
		
		//Counts dimes
		number = changeMethods.dimeCountMethod(dime, number);
		
		//Counts nickels
		number = changeMethods.nickelCountMethod(nickel, number);
		
		//Counts pennies
		number = changeMethods.pennyCountMethod(penny, number);
		
	} //End of main
	

	

}
