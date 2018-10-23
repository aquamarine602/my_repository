package c.spik3.asdf;

import java.util.Scanner;
import static java.lang.System.out;

/**
 * @author Chloe
 * 10/22/18
 * high fives and Georgia
 */

public class High_five {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		out.println("Enter an integer!");
		int user_in = input.nextInt();
		
		if (user_in % 5 == 0) {
			out.print("Hifive ");
		}
		
		if (user_in % 2 == 0 || user_in % 3 == 0) {
			out.print("Georgia");
		}

	}

}
