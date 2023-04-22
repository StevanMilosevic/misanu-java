package zadatak5;

// Тркачки ауто је возило којe садржи генерисан низ вожњи. Ствара се с празним низом капацитета 10 вожњи.
// Може да се започне нова вожња капацитетa 100 етапа, да се последње започетој вожњи дода нова етапа,
// да се одреди вожња са највећом средњом брзином. У излазни ток се пише и дужина вожње са највећом средњом брзином

public class Voznja {
	private Etapa[] niz;
	int kapacitet;

	Voznja() {
		niz = new Etapa[10];
	}

	Voznja(int kapacitet) {
		niz = new Etapa[kapacitet];
		this.kapacitet = kapacitet;
	}

	public void dodajEtapu(Etapa e) {
		int brojac = 0;

		for (int i = 0; i < niz.length; i++) {
			if (niz[i] != null)
				brojac++;
		}
		// ovde ispitujemo da li je niz pun
		if (brojac >= niz.length) {
			System.out.println("Niz sa etapama je pun!");
		} else
			niz[brojac] = e;
	}

	// srednja brzina je: predjena duzina / vreme
	public double srednjaBrzina() {
		double duzina = 0, vreme = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] != null) {
				duzina += niz[i].getDuzina();
				vreme += niz[i].getVreme();
			}
		}
		return duzina / vreme;
	}

}
