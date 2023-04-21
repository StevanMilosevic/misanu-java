package UUP;

// Napisati program za ispis sume recipročnih vrednosti prvih n prirodnih brojeva
// (harmonijski niz: 1 + 1/2 + 1/3 +...+ 1/n).
// WHILE petlja

import java.util.Scanner;

public class Zadatak3w {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite vrednost za n: ");
		int n = input.nextInt();
		int i = 1;
		double suma = 0;
		while (i <= n) {
			suma += (double) 1 / i;
			i++;
		}
		System.out.println(suma);
		input.close();
	}
}
