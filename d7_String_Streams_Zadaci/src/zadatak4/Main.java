package zadatak4;

import java.util.Scanner;

// Ispitati da li je broj palindrom.

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj");
		int broj = input.nextInt();

		int proba = broj;
		int cifra = 0, palindrom = 0;
		while (proba != 0) {
			cifra = proba % 10;
			palindrom = palindrom * 10 + cifra;
			proba /= 10;
		}
		if (broj == palindrom)
			System.out.println(broj + " - " + palindrom);
		else
			System.out.println(palindrom);
	}
}
