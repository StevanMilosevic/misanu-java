package zadatak2;

/* 
• Napisati main klasu koja sa glavnog ulaza pročita podatke o određenom broju predmeta i posle toga
  na glavnom izlazu ispiše podatke o predmetima čije su težine iznad proseka. */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite S za SFERU ili K za KVADAR ");
		char slovo = input.next().charAt(0);

		if (slovo == 'S') {
			System.out.print("Za koliko sfera racunamo? ");
			int n = input.nextInt();
			Sfera[] nizSfera = new Sfera[n];
			double[] nizProsek = new double[n];

			for (int i = 0; i < n; i++) {
				System.out.print("Unesite specifucnu tezinu " + (i + 1) + ". Sfere ");
				double specTezina = input.nextDouble();
				System.out.print("Unesite poluprecnik " + (i + 1) + ". Sfere ");
				double poluprecnik = input.nextDouble();

				nizSfera[i] = new Sfera(specTezina, slovo, poluprecnik);
				nizProsek[i] = nizSfera[i].tezina(specTezina, poluprecnik);
			}
			double suma = 0;
			double prosek = 1;

			for (int i = 0; i < n; i++) {
				suma += nizProsek[i];
			}
			prosek = suma / (double) n;
			System.out.println("Prosecna tezina svih sfera = " + prosek);

			for (int i = 0; i < n; i++) {
				if (nizProsek[i] > prosek) {
					System.out.println("Tezina " + (i + 1) + ". sfere je veca od prosecne tezine svih sfera");
				}
			}
		}
		if (slovo == 'K') {
			System.out.print("Za koliko kvadara racunamo? ");
			int m = input.nextInt();
			Kvadar[] nizKvadara = new Kvadar[m];
			double[] nizProsek = new double[m];

			for (int i = 0; i < m; i++) {
				System.out.println("Duzine ivica " + (i + 1) + ". Kvadra  ");
				System.out.print("a = ");
				double a = input.nextDouble();
				System.out.print("b = ");
				double b = input.nextDouble();
				System.out.print("c = ");
				double c = input.nextDouble();
				System.out.print("Unesite specificnu tezinu " + (i + 1) + ". kvadra  ");
				double specTezina = input.nextDouble();
				nizKvadara[i] = new Kvadar(specTezina, slovo, a, b, c);
				nizKvadara[i].opis();
				nizProsek[i] = nizKvadara[i].tezina(specTezina, a, b, c);
			}
			double suma = 0;
			double prosek = 1;

			for (int i = 0; i < m; i++) {
				suma += nizProsek[i];
			}
			prosek = suma / (double) m;
			System.out.println("Prosecna tezina svih kvadara = " + prosek);

			for (int i = 0; i < m; i++) {
				if (nizProsek[i] > prosek) {
					System.out.println("Tezina " + (i + 1) + ". kvadra je veca od prosecne tezine svih kvadara  ");
				}
			}
		}
		if (slovo != 'K' && slovo != 'S') {
			System.out.println("Pogresan unos");
		}
	}
}