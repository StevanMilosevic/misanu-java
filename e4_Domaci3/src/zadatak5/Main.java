package zadatak5;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		// a) kreiranje dinamickog niza
		// b) dodavanje 10 imena

		List<String> kolekcija = new LinkedList<>();
		kolekcija.add("Avaks");
		kolekcija.add("Hibrid");
		kolekcija.add("Braca");
		kolekcija.add("Zivac");
		kolekcija.add("Gangula");
		kolekcija.add("Sumpor");
		kolekcija.add("Cile");
		kolekcija.add("Burgija");
		kolekcija.add("Banja Luka");
		kolekcija.add("Sreten Zujkic");

		// c) ispis sadrzaja niza preko ListIteratora
		ListIterator<String> iter = kolekcija.listIterator();

		while (iter.hasNext())
			System.out.print(iter.next() + " ");

		System.out.println(); // ubaceno zbog preglednosti u konzoli

		// d) dodavanje novog elementa na poziciji 5
		// e) stampanje elemenata
		kolekcija.set(4, "Iris");
		while (iter.hasPrevious())
			System.out.print(iter.previous() + " ");

		System.out.println(); // ubaceno zbog preglednosti u konzoli

		// f) brisanje jednog elementa
		// g) stampanje niza
		kolekcija.remove(8);
		/*
		 * posto smo promenili broj elemenata u kolekciji moramo ponovo da postavimo
		 * iterator ili da ispisemo elemente uz pomoc unapredjene for petlje
		 */

		for (String s : kolekcija)
			System.out.print(s + " ");
	}
}
