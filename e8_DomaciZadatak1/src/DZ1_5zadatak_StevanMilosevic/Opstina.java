package DZ1_5zadatak_StevanMilosevic;

public class Opstina extends Oblast {
	String naziv;
	char vrsta;
	double povrsina;
	int brojNaselja;

	private Niz<Naselje> naselja;

	Opstina(String naziv, double povrsina, int brojNaselja) {
		this.naziv = naziv;
		this.vrsta = 'O';
		this.povrsina = povrsina;
		this.brojNaselja = brojNaselja;
		naselja = new Niz<>(brojNaselja);
	}

	public String getNaziv() {
		return naziv;
	}

	public char getVrsta() {
		return vrsta;
	}

	public double getPovrsina() {
		return this.povrsina;
	}

	public void postaviNaselje(int i, Naselje n) {
		naselja.set(i, n);
	}

	public int getBrStanovnika() {
		int zbir = 0;
		for (int i = 0; i < this.brojNaselja; i++) {
			zbir += naselja.get(i).getBrStanovnika();
		}
		return zbir;
	}
}
