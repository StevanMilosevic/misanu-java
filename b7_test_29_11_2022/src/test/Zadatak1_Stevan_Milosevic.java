package test;

import java.util.Scanner;

public class Zadatak1_Stevan_Milosevic {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Upisite koliko elemenata ima niz X: ");
		int n = input.nextInt();
		int[] x = new int[n];
		int suma = 0;

		// upis clanova niza x i sabiranje sume
		System.out.println("Upisite clanove niza X: ");
		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = input.nextInt();
			if (x[i] % 10 == 8)
				suma += x[i];
		}
		// Stampanje rezultata
		System.out.println("Suma je: " + suma);
		input.close();
	}
}