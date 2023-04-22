package DZ1_3zadatak_StevanMilosevic;

public class Polica {
	int kapacitet;
	int nosivost;
	private Niz<Predmet> polica;

	Polica(int kapacitet, int nosivost) {
		this.kapacitet = kapacitet;
		this.nosivost = nosivost;
		polica = new Niz<>(kapacitet);
	}

	// stavljanje predmeta na zadato mesto
	public void staviPredmet(int indeks, Predmet p) {
		polica.set(indeks, p);
	}

	// uzimanje predmeta sa zadatom mesta na polici (predmet se uklanja sa police)
	public void sklanjanjePredmeta(int indeks) {
		polica.set(indeks, null);
	}

	// pristup predmetu na zadatom mestu na polici (predmet ostaje na polici)
	public void pristupPredmetu(int indeks) {
		Predmet predmet = polica.get(indeks);
		System.out.println("Predmet: " + predmet.naziv + " je tezak: " + predmet.tezina);
	}

	// ispitivanje da li je neko mesto na polici prazno
	public void daLiJePrazno(int indeks) {
		if (polica.get(indeks) == null)
			System.out.println("Mesto na polici je prazno");
		else
			System.out.println("Mesto na polici je zauzeto");
	}

	// dohvatanje podataka o stanju police (kapacitet, broj popunjenih mesta,
	// nosivost, ukupan teret na polici I Koliko tereta može još da se doda)
	public void stanjePolice() {
		System.out.println("Kapacitet police: " + this.kapacitet);
		System.out.println("Broj popunjenih mesta: " + this.brojPopunjenihMesta());
		System.out.println("Nosivost police je: " + this.nosivost);
		System.out.println("Ukupan teret na polici je: " + this.ukupanTeret());
		System.out.println("Na policu moze da se doda jos: " + (nosivost - this.ukupanTeret()));
	}

	public int brojPopunjenihMesta() {
		int brojac = 0;
		for (int i = 0; i < kapacitet; i++) {
			if (polica.get(i) != null)
				brojac++;
		}
		return brojac;
	}

	public int ukupanTeret() {
		int zbir = 0;
		for (int i = 0; i < kapacitet; i++) {
			if (polica.get(i) != null)
				zbir += polica.get(i).tezina;
		}
		return zbir;
	}

}
