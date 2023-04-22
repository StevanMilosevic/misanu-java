package zadatak4;

import java.util.ArrayList;

// Низ материјалних тачака се ствара празан задатог почетног капацитета (подразумевано 5),
// после чега се тачке додају једнa по једнa на крај низа. Aко се низ препуни, капацитет му се повећа за 5.
// Може да се дохвати број тачака у низу, да се дохвати тачка у низу која највише привлачи задату
// тачку и да се низ испише на главном излазу.

public class Niz {
	private ArrayList<Tacka> niz;

	Niz() {
		niz = new ArrayList<>();
	}

	// Може да се дохвати број тачака у низу
	public int brojTacaka() {
		return niz.size();
	}

	// тачке додају једнa по једнa на крај низа.
	public void dodajTacku(Tacka t) {
		niz.add(t);
	}

	// дохвати тачка у низу која највише привлачи задату тачку
	public Tacka najvecePrivlacenje(Tacka t) {
		double privlacenje, provera;
		privlacenje = t.F(niz.get(0)); // ispitujemo konkretnu tacku sa prvom tackom u nizu
		int indeks = 0;

		for (int i = 1; i < niz.size(); i++) {
			provera = t.F(niz.get(i)); // proveravamo sa sledocom tackom u nizu
			if (provera > privlacenje) {
				privlacenje = provera;
				indeks = i;
			}
		}
		return niz.get(indeks);
	}

	// ispis tacke
	public void ispis() {
		int brojac = 1;
		for (Tacka t : niz) {
			System.out.print(brojac + ". ");
			t.opis();
			brojac++;
		}
	}
}
