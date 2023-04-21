package kontrolni;

//Написати програм који пребројава цифре унетог броја 

import java.io.*;

public class Zadatak1 {
	public static void main(String[] args) throws Exception {
		// inicijalizacija i ucitavanje promenljivih
		int broj, cifra, brojac = 0;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Unesite broj: ");
		broj = Integer.parseInt(input.readLine());

		// obrada podataka
		if (broj > 0) {
			while (broj != 0) {
				cifra = broj % 10;
				if (cifra >= 0)
					brojac++;
				broj /= 10;
			}
		} else
			System.out.println("Samo pozitivni brojevi mogu da se upisu");
		// stampanje rezultata
		if (brojac > 0)
			System.out.println("Ukupan broj cifara je: " + brojac);

	}
}