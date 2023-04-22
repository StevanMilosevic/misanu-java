package zadatak3;

/* Podatke o osobi čine ime, datum rođenja i adresa stanovanja. */

public class Osoba {
	String ime, datumRodjenja, adresa;

	Osoba(String ime, String datumRodjenja, String adresa) {
		this.ime = ime;
		this.datumRodjenja = datumRodjenja;
		this.adresa = adresa;
	}

	public String toString() {
		return "Ime: " + ime + "\nDatum rodjenja: " + datumRodjenja + "\nAdresa: " + adresa;
	}
}
