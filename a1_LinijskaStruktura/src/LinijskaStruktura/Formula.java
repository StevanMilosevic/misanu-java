package LinijskaStruktura;

import java.util.Scanner;

public class Formula {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite vrednost za a: ");
		double a = input.nextDouble();
		
		System.out.print("Unesite vrednost za b: ");
		double b = input.nextDouble();
		
		input.close();
		
		System.out.println("y = " + (1 - Math.min(a, b)) / (1 + Math.max(a, b)));     

	}

}
