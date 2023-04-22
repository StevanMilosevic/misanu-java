package zadatak5;

// Апстрактно возило има задату сопствену тежину. Може да се дохвати назив врсте возила,
// да се одреди тежина возила и да се возило упише у излазни ток.
// Пише се назив врсте возила и сопствена тежина возила.

abstract class Vozilo {
	private double tezina;

	Vozilo(double tezina) {
		this.tezina = tezina;
	}

	public double getTezina() {
		return this.tezina;
	}

	public abstract String getNaziv();

	public String opis() {
		return "Naziv vrste vozila: " + getNaziv() + "\nTezina: " + getTezina();
	}
}