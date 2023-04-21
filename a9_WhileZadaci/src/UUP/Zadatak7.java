package UUP;

// Napisati program za ispisivanje sume brojeva u intervalu od 1 do zadatog broja n čija je cifra jedinica 8.

import java.util.Scanner;

public class Zadatak7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite vrednost za n: ");
		int n = input.nextInt();
		int suma = 0; // predstavlja neutral prilikom sabiranja
		int i = 1;

		while (i <= n) {
			if (i % 10 == 8)
				suma += i;
			i++;
		}
		System.out.println(suma);
		input.close();
	}
}
