package zadatak1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite broj: ");

		int pogodak = (int) (Math.random() * 10), brojac = 1;

		while (true) {
			int pokusaj = input.nextInt();
			// System.out.println("Tacan broj: " + pogodak); // kontrola, IZBRISATI !!!

			if (pokusaj == pogodak) {
				System.out.println(pokusaj + " je tacan broj! Pogodili ste iz " + brojac + " pokusaja");
				brojac++;
				break;
			} else if (pokusaj > pogodak) {
				System.out.println("Trazeni broj je manji od unetog broja...");
				brojac++;
			} else if (pokusaj < pogodak) {
				System.out.println("Trazeni broj je veci od unetog broja...");
				brojac++;
			}
		}
		input.close();

	}
}
