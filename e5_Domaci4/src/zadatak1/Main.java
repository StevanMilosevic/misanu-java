package zadatak1;

import java.util.Scanner;

// Napisati program koji pretvara binarni u dekadni broj.

public class Main {
	/*
	 * pretvaranje binarnog u dekadni: cifra1 * 10^(n-1) + cifra2 * 10^(n-2) + ....
	 * + cifraN * 10^0 gde je n ukupan broj cifri u binarnom broju
	 */

	public static int konverter(long binarniBroj) {
		int dekadniBroj = 0, brojac = 0;
		long ostatak;

		while (binarniBroj != 0) {
			ostatak = binarniBroj % 10;
			dekadniBroj += ostatak * Math.pow(2, brojac);
			brojac++;
			binarniBroj /= 10;
		}
		return dekadniBroj;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite neki binarni broj: ");
		long broj = input.nextLong();
		input.close();

		System.out.println(broj + " = " + konverter(broj));

	}
}
