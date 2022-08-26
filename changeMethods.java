package keatingLeastChange;

import java.util.Random;

public class changeMethods {
	static int number = 0;
	static int halfDollarCount = 0;
	static int quarterCount = 0;
	static int dimeCount = 0;
	static int nickelCount = 0;
	static int pennyCount = 0;
	final int halfDollar = 50;
	final int quarter = 25;
	final int dime = 10;
	final int nickel = 5;
	final int penny = 1;
	
	public static int getRandom() {
		Random result = new Random();
		int upperbound = 99;
		int rand = result.nextInt(upperbound);
		System.out.println("Total change = " + rand);
		return rand;

	} //End of getRandom
	
	public static int halfDollarCountMethod(int number, int halfDollar) {
		while(number - halfDollar >= 0) {
			if(number > halfDollar) {
				halfDollarCount += 1;
				number -= halfDollar;
			}
			System.out.println("Half dollar ..... " + halfDollarCount);
		}
		return number;
	} //End of halfDollarCountMethod
	
	public static int quarterCountMethod(int quarter, int number) {
		while(number - quarter >= 0) {
			if(number > quarter) {
				quarterCount += 1;
				number -= quarter;
			}
		}
		if(quarterCount > 1) {
			System.out.println("Quarters ..... " + quarterCount);
		
		}
		else if(quarterCount == 1){
			System.out.println("Quarter ..... " + quarterCount);
		}
		return number;
	} //End of quarterCountMethod
	
	public static int dimeCountMethod(int dime, int number) {
		while(number - dime >= 0) {
			if(number > dime) {
				dimeCount += 1;
				number -= dime;
			}
		}
		if(dimeCount > 1) {
			System.out.println("dimes ..... " + dimeCount);
		
		}
		else if(dimeCount == 1){
			System.out.println("dime ..... " + dimeCount);
		}
		return number;
	} //End of dimeCountMethod
	
	public static int nickelCountMethod(int nickel, int number) {
		while(number - nickel >= 0) {
			if(number > nickel) {
				nickelCount += 1;
				number -= nickel;
			}
		}
		if(nickelCount > 1) {
			System.out.println("nickels ..... " + nickelCount);
		
		}
		else if(nickelCount == 1){
			System.out.println("nickel ..... " + nickelCount);
		}
		return number;
	} //End of nickelCountMethod
	
	public static int pennyCountMethod(int penny, int number) {
		pennyCount = number;
		if(pennyCount > 1) {
			System.out.println("Pennies ..... " + pennyCount);
		
		}
		else if(pennyCount == 1){
			System.out.println("Penny ..... " + pennyCount);
		}
		return number;
	} //End of pennyCountMethod

}
