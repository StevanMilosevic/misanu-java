package stevan;

import java.util.Scanner;

public class Zadatak10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, y = 0;
		
		System.out.println("Unesite vrednost za n: ");
		int n = input.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Unesite vrednost za a: ");
			a = input.nextDouble();
			if(a > 0)
				y = Math.sqrt(a);
			if(a <= 0)
				y = a * a;
			System.out.println("Za unetu vrednost a = " + a + " dobija se y = " + y);
			
			}
		input.close();
		
	}
}
