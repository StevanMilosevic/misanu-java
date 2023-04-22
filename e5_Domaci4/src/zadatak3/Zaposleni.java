package zadatak3;

/*  Zaposlen je osoba za koju se dodatno zna naziv firme i naziv odeljenja u kome radi. */

public class Zaposleni extends Osoba {
	String firma;
	int odeljenje;

	Zaposleni(String ime, String datumRodjenja, String adresa, String firma, int odeljenje) {
		super(ime, datumRodjenja, adresa);
		this.firma = firma;
		this.odeljenje = odeljenje;
	}

	public String toString() {
		return super.toString() + "\nFirma: " + firma + "\nOdeljenje: " + odeljenje;
	}
}
