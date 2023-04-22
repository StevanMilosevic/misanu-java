package zadatak3;

import java.io.*;

/* Podatke o osobi čine ime, datum rođenja i adresa stanovanja. 
 * Đak je osoba za koju se dodatno znaju naziv škole i razred koji pohađa. 
 * Zaposlen je osoba za koju se dodatno zna naziv firme i naziv odeljenja u kome radi. 
 * Napisati klase koje omogućavaju unificiranu obradu podataka o nabrojanim kategorijama osoba. 
 * Predvideti unošenje podataka u objekte čitanjem s glavnom ulaza i sastavljanjem tekstualnog opisa 
 * objekata. 
 * Napisati main klasu za ispitivanje navedenih klasa. */

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Upisite da li je osoba djak ili zaposlen u skoli: ");
		String osoba = input.readLine();
		if (osoba.equalsIgnoreCase("Djak") || osoba.equalsIgnoreCase("Zaposlen")) {

			// zajednicki upisi za djaka i zaposlenog iz klase Osoba
			System.out.println("Unesite ime ");
			String ime = input.readLine();
			System.out.println("Unesite Datum Rodjenja ");
			String datumRodjenja = input.readLine();
			System.out.println("Unesite Adresu Stanovanja");
			String adresaStanovanja = input.readLine();

			// zavisno od toga da li je Djak ili Zaposlen
			if (osoba.equalsIgnoreCase("Djak")) {
				System.out.println("Unesite Naziv Skole");
				String nazivSkole = input.readLine();
				System.out.println("Unesite razred");
				int razred = Integer.parseInt(input.readLine());

				Djak djak = new Djak(ime, datumRodjenja, adresaStanovanja, nazivSkole, razred);

				System.out.println(djak.toString());
			} else if (osoba.equalsIgnoreCase("Zaposlen")) {
				System.out.println("Unesite Naziv Firme");
				String firma = input.readLine();
				System.out.println("Unesite Odeljenje Rada ");
				int odeljenje = Integer.parseInt(input.readLine());

				Zaposleni z = new Zaposleni(ime, datumRodjenja, adresaStanovanja, firma, odeljenje);

				System.out.println(z.toString());
			}
		} else {
			System.out.println("Greska prilikom unosa podataka!");
			Main.main(args);
		}
	}
}
