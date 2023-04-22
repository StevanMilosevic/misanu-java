package zadatak6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		String[] imena = { "Mika", "Zika", "Ana", "Lana", "Hana", "Una" };

		List<String> listaImena = new ArrayList<String>();

		for (String ime : imena) {
			listaImena.add(ime);
		}

		String[] imenaZaBrisanje = { "Mika", "Lana", "Hana" };
		List<String> listaImenaZaBrisanje = new ArrayList<String>();
		for (String ime : imenaZaBrisanje)
			listaImenaZaBrisanje.add(ime);

		// kreiranje iteratora kolekcije i stampanje liste pomocu iteratora
		Iterator<String> iter = listaImena.iterator();
		System.out.println("Stampanje elemenata pomocu iteratora: ");
		while (iter.hasNext())
			System.out.print(iter.next() + " ");

		// brisanje elemenata liste imena koja se nalaze u listi koja se zove
		// listaImenaZaBrisanje
		iter = listaImena.iterator();
		while (iter.hasNext()) {
			if (listaImenaZaBrisanje.contains(iter.next())) {
				iter.remove();
				// utvrdjujemo da li lista imena za brisanje sadrzi elemente na koju ukazuje
				// iterator
				// ako je odgovor true, brisemo elemente
			}
		}

		System.out.println("\nLista nakon brisanja: ");
		for (int i = 0; i < listaImena.size(); i++)
			System.out.print(listaImena.get(i) + " ");

		// DOMACI ZADATAK
		// Napraviti ArrayList sa nekim drugim tipom podataka i provuci sve kroz ove
		// funkcije
		// sto smo radili sad

	}
}
