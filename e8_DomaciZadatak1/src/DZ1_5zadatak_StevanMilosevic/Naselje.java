package DZ1_5zadatak_StevanMilosevic;

public class Naselje extends TeritorijalnaJedinica {
	String naziv;
	char vrsta;
	private int brStanovnika;

	Naselje(String naziv, int brStanovnika) {
		this.naziv = naziv;
		this.vrsta = 'N';
		this.brStanovnika = brStanovnika;
	}

	public String getNaziv() {
		return naziv;
	}

	public char getVrsta() {
		return vrsta;
	}

	public int getBrStanovnika() {
		return this.brStanovnika;
	}
}
