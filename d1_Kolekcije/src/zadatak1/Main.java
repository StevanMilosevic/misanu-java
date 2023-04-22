package zadatak1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] brojevi = new int[5]; // staticki definisani elementi niza

		for (int i = 0; i < brojevi.length; i++) {
			System.out.print("Unesite broj: ");
			brojevi[i] = input.nextInt();

			if ((i + 1) == brojevi.length)
				System.out.println("Niz je napunjen!");
		}

		System.out.println("Elementi niza su: ");
		for (int i = 0; i < brojevi.length; i++) {
			System.out.print(brojevi[i] + " ");
		}
	}
}