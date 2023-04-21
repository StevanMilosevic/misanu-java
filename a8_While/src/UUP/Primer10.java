package UUP;

import java.util.Scanner;

public class Primer10 {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednost za n: ");
		int n = ulaz.nextInt();
		int i = 1;
		double suma = 0;
		
		while (i <= n) {
			suma += 1.0 / (2.0 * i);
			i++;
		}
		System.out.println(suma);
		ulaz.close();
	}
}
