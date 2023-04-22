package zadatak2;

/* Napisati sledeće klase:
• Predmet ima specifičnu težinu i jednoslovnu oznaku vrste predmeta.
  Predvideti inicijalizaciju zadatim vrednostima parametara (podrazumevano 1),
  dohvatanje oznake vrste predmeta, izračunavanje zapremine, izračunavanje težine, čitanje predmeta sa glavnog ulaza
  i sastavljanja tekstualnog opisa predmeta. */

public class Predmet {
	protected double specTezina;
	protected char vrstaPredmeta;
	protected double masa;
	final double GRAVITACIJA = 9.81;

	public Predmet() {
		specTezina = 1;
		vrstaPredmeta = 'P';
	}

	public Predmet(double specTezina, char vrstaPredmeta) {
		this.specTezina = specTezina;
		this.vrstaPredmeta = vrstaPredmeta;
	}

	// dohvatanje oznake vrste predmeta
	public char getVrstaPredmeta() {
		return vrstaPredmeta;
	}

	public String opis() {
		return "Predmet ima oznaku: " + this.vrstaPredmeta + "\nSpecificna tezina mu je: " + this.specTezina;
	}
}
