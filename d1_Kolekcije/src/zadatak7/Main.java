package zadatak7;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> ll = new LinkedList<String>();

		// dodavanje elemenata u povezanoj listi
		ll.add("A"); // 0
		ll.add("B"); // 1
		ll.add(2, "C"); // 2

		System.out.println("Elementi povezane liste su: " + ll);

		// brisanje elementa iz povezane liste
		// moze da se brise preko indeksa ili preko vrednosti
		ll.remove("B");
		ll.remove(0);
		System.out.println("Povezana lista nakon brisanja elemenata: " + ll);

		ll.add("D");
		ll.add("E");
		ll.add("F");
		// unutar interfejsa List, indeksiranje ide od 0, ne moze se indeksirati
		// stringovnim tipom
		System.out.println("Elementi povezane liste su: " + ll);

		// contains() - trazenje elementa u povezanoj listi
		boolean sadrzi = ll.contains("E");
		if (sadrzi) {
			System.out.println("Lista sadrzi element E");
		} else
			System.out.println("Lista NE sadrzi element E");

		// pristupanje (uzimanje) vrednosti elementa iz povezane liste
		Object element = ll.get(3);
		System.out.println("Zatrazen element je: " + element);

		// set() - postavljanje elemenata u povezanoj listi
		ll.set(1, "Z");
		System.out.println("Povezana lista nakon promene izgleda ovako: " + ll);
		ll.add(1, "G");
		System.out.println("Povezana lista nakon promene izgleda ovako: " + ll);

	}

}
