package LinijskaStruktura;

import java.util.Scanner;

/* program za pretvaranje galona u litre. 
 * Napomena: 1 galon = 4,54 l. */

public class Galon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Pretvorite galone u litre, koliko galona pretvarate? ");
		
		double g = input.nextDouble();
		System.out.println("Zapremina u litrima je: " + (g * 4.54) + " litara");
		input.close();
		
	}

}
