package DZ1_4zadatak_StevanMilosevic;

// Piće je namirnica koje se zadaje količinom u litrima (realan broj) i energetskom vrednošću jednog litra izraženoj
// u kJ (realan broj). Može da se dohvati količina. Tekstualni opis je ime_pića[id](količina,energetska_vrednost).

public class Pice extends Namirnica {
	String ime;
	int identifikator;
	double kolicina;
	double energVrednost;

	Pice(String ime, double k, double e) {
		this.ime = ime;
		this.identifikator = 2;
		this.kolicina = k;
		this.energVrednost = k * e;
	}

	public String getIme() {
		return ime;
	}

	public int getIdentifikator() {
		return identifikator;
	}

	public double getKolicina() {
		return this.kolicina;
	}

	public void opis() {
		System.out.println(
				this.getIme() + "[" + this.getIdentifikator() + "] (" + this.kolicina + "," + this.energVrednost + ")");
	}
}
