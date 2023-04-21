package kontrolni;

//Написати програм који испитује и исписује највећу цифру унетог броја (35 поена)

import java.util.Scanner;

public class Zadatak3 {
	public static void main(String[] args) {
		// 1 deo algoritma - inicijalizacija i ucitavanje promenljivih
		int broj, cifra, max = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite broj: ");
		broj = input.nextInt();

		// 2 deo algoritma - obrada podataka
		if (broj < 0)
			broj = -broj; // zastita od upisivanja negativnog broja

		while (broj != 0) {
			cifra = broj % 10;
			if (cifra > max)
				max = cifra;
			broj /= 10;
		}
		// 3 deo algoritma - stampanje rezultata

		if (max > 0)
			System.out.println("Najveca cifra je: " + max);
		else
			System.out.println("Uneli ste nulu");
		input.close();
	}
}
