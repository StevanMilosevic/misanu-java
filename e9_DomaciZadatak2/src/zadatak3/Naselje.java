package zadatak3;

public class Naselje {
	Ulica[] naselje;

	Naselje(int kapacitet) {
		naselje = new Ulica[(kapacitet + 1)];
	}

	public void dodajUlicu(int broj, Ulica u) {
		if (naselje[broj] != null) {
			System.out.println("Ulica vec postoji pod tim rednim brojem!");
		} else {
			naselje[broj] = u;
		}

	}

	public String ispisiNaselje() {
		String poruka = "";
		int brojac = 1;
		for (int i = 1; i < naselje.length; i++) {
			for (int j = 1; j < naselje[i].ulica.length; j++) {
				if (naselje[i] != null && naselje[i].ulica[j] != null) {
					poruka += brojac + ". " + naselje[i].ulica[j].toString() + "\n";
					brojac++;
				}
			}
		}
		return poruka;
	}
}
