package zadatak2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite bilo koji trocifreni broj: ");
		int broj = input.nextInt();
		int s, d, j, cifra, proizvod, suma, kontra = 0;

		cifra = broj;

		while (broj > 0) {
			int br = broj % 10;
			kontra = kontra * 10 + br;
			broj = broj / 10;
		}

		s = cifra / 100;
		d = (cifra / 10) % 10;
		j = cifra % 10;

		proizvod = s * d * j;
		suma = s * s + d * d + j * j;

		System.out.println("Proizvod cifara broja " + cifra + " je: " + proizvod);
		System.out.println("Suma kubova cifara broja " + cifra + " je: " + suma);
		System.out.println(cifra + " ispisan u obrnutom redosledu = " + kontra);

		input.close();
	}
}
