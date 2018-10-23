package c.spik3.asdf;

import java.util.Scanner;
import static java.lang.System.out;

/**
 * @author Chloe
 * 10/22/18
 * chinese currency exchange
 */

public class RMB_exchange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// asks for the exchange rate
		out.println("Enter the exchange rate from USD to RMB:");
		double rate = input.nextDouble();
		out.println();
		
		// declares variables
		double amt = 0;
		double conversion = 0;
		int zero_or_1 = 3;
		
		// while the user has an invalid input
		while (zero_or_1 != 0 && zero_or_1 != 1) {
		
		// asks user what they are converting
		out.println("Enter 0 to convert USD to RMB, enter 1 to convert RMB to USD:");
		zero_or_1 = input.nextInt();
		out.println();
		
		// if they want to convert usd to rmb
		if (zero_or_1 == 0) {
			out.println("Enter amount in USD:");
			amt = input.nextDouble();
			conversion = amt * rate;
			out.println();
			
			out.print("$");
			out.printf("%.2f", amt);
			out.print(" is ");
			out.printf("%.2f", conversion);
			out.println(" Yuan.");
			
		} else if (zero_or_1 == 1) {	// else they want to convert rmb to usd
			out.println("Enter amount in RMB:");
			amt = input.nextDouble();
			conversion = amt / rate;
			out.println();
			
			out.printf("%.2f", amt);
			out.print(" Yuan is $");
			out.printf("%.2f", conversion);
			out.println(".");
			
		} else if (zero_or_1 != 0
				&& zero_or_1 != 1) {	// else their input was invalid
			out.println("Invalid answer!\n");
		}
		
		}
		

	}

}
