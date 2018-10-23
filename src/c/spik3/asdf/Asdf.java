package c.spik3.asdf;

import static java.lang.System.out;
import java.util.Scanner;

public class Asdf {

	public static void main(String[] args) {
		out.println((int)(Math.random()));
		out.println(Math.pow(2,3));
		out.println(34 % 7);
		out.println(3 + 4 * 2 > 2 * 9);
		int number = 4;
		out.println(3 * number);
		out.println(4 * number);
		int x = 943;
		out.println(x/100);
		out.println(x % 100);
		out.println(x + "is" + ((x % 2 == 0) ? "even" : "odd"));
		int y = -1;
		y++;
		out.println(y);

	}

}
