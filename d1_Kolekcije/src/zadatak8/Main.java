package zadatak8;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		String[] imena = { "Mika", "Zika", "Fica" };

		List<String> listaImena = new LinkedList<String>();

		for (String ime : imena)
			listaImena.add(ime);
		System.out.println("Prva lista: " + listaImena);

		String[] imena1 = { "Ana", "Lena", "Hana", "Una" };
		List<String> listaImena1 = new LinkedList<String>();
		for (String ime : imena1)
			listaImena1.add(ime);
		System.out.println("Druga lista: " + listaImena1);

		listaImena.addAll(listaImena1);

		System.out.println("Nova lista: " + listaImena);

		listaImena.subList(0, 2).clear();
		System.out.println("Lista nakon brisanja elemenata sa indeksima 0 i 1: " + listaImena);

		// subList(indexFrom, indexTo)
		// indexFrom - pocevsi od zadatog indeksa, racunajuci i njega
		// indexTo - do zadatog indeksa, NE ukljucujuci i njega

	}

}
