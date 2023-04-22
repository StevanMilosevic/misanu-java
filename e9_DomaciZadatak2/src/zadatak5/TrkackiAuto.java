package zadatak5;

// Тркачки ауто је возило којe садржи генерисан низ вожњи. Ствара се с празним низом капацитета 10 вожњи.
// Може да се започне нова вожња капацитетa 100 етапа, да се последње започетој вожњи дода нова етапа,
// да се одреди вожња са највећом средњом брзином. У излазни ток се пише и дужина вожње са највећом средњом брзином

public class TrkackiAuto extends Vozilo {
	private Voznja[] voznje;
	int kapacitet;

	TrkackiAuto(double tezina) {
		super(tezina);
		voznje = new Voznja[10];
		this.kapacitet = 0;
	}

	public String getNaziv() {
		return "Trkacki auto";
	}

	public void dodajVoznju(Voznja obj) {
		int brojac = 0;

		for (int i = 0; i < voznje.length; i++) {
			if (voznje[i] != null)
				brojac++;
		}
		// ovde ispitujemo da li je niz pun
		if (brojac >= voznje.length) {
			System.out.println("Niz sa voznjama je pun!");
		} else
			voznje[brojac] = obj;
	}

	// odredjivanje voznje sa najvecom srednjom brzinom
	public double srednjaBrzina() {
		int indeks = 0;
		double kontrolna = voznje[0].srednjaBrzina();

		for (int i = 1; i < voznje.length; i++) {
			if (voznje[i] != null) {
				double brzina = voznje[i].srednjaBrzina();
				if (brzina > kontrolna) {
					kontrolna = brzina;
					indeks = i;
				}
			}
		}
		return voznje[indeks].srednjaBrzina();
	}

	@Override
	public String opis() {
		return super.opis() + "\nDuzina voznje sa najvecom srednjom brzinom je: " + this.srednjaBrzina();
	}
}
