package LinijskaStruktura;

import java.util.Scanner;

/* program za pretvaranje temperature iz skale Celzijusa u skalu Farenhajta.
 */

public class Farenhajt {
	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		
		System.out.print("Upisite koliko stepeni ima na Celzijusovoj skali: ");
		double tc = input.nextDouble();
		double tf = tc * 1.8 + 32;
		
		System.out.println("Temperatura na Farenhajtovoj skali iznosi: " + tf);
		input.close();	
	}
}