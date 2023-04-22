package zadatak3;

/*  Đak je osoba za koju se dodatno znaju naziv škole i razred koji pohađa. */

public class Djak extends Osoba {
	String nazivSkole;
	int razred;

	Djak(String ime, String datumRodjenja, String adresa, String nazivSkole, int razred) {
		super(ime, datumRodjenja, adresa);
		this.nazivSkole = nazivSkole;
		this.razred = razred;
	}

	public String toString() {
		return super.toString() + "\nNaziv skole: " + nazivSkole + "\nRazred: " + razred;
	}

}
