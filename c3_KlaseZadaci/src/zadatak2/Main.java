package zadatak2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Osoba osoba = new Osoba();
		System.out.print("Unesite ime: ");
		osoba.ime = input.nextLine();

		System.out.print("Unesite datum rodjenja: ");
		osoba.datum = input.nextLine();

		System.out.print("Unesite adresu stanovanja: ");
		osoba.adresa = input.nextLine();

		System.out.println(osoba.ispisi());
		input.close();

	}

}
