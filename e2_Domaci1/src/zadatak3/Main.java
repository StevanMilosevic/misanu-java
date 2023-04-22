package zadatak3;

// ZADATAK 3 - Napisati Lambda izraz koji ispisuje nasumično izabran broj.
// Koristiti funkciju Math.random() za dobijanje nasumicnog broja.

import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");

		/*
		 * Posto Math.random() vraca double vrednosti od 0.0 do 1.0, dobijenu vrednost
		 * mnozim sa 10
		 */
		NasumicniBroj nb = () -> Math.random() * 10;

		System.out.println(df.format(nb.rand()));
		System.out.println(df.format(nb.rand()));
	}
}
