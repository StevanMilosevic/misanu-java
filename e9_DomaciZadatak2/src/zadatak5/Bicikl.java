package zadatak5;

// Bicikl je vozilo 

public class Bicikl extends Vozilo {
	double tezina;
	String naziv;

	Bicikl(String naziv, double tezina) {
		super(tezina);
		this.naziv = naziv;
	}

	public double getTezina() {
		return this.tezina;
	}

	public String getNaziv() {
		return this.naziv;
	}
}