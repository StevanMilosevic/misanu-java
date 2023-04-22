package zadatak2;

import java.util.*;

// Napisati program koji iz zadatog niza briše duplikate. 1232145657 -> 1234567

public class Main {
	public static void main(String[] args) {
		// niz iz koga treba izbaciti duplikate
		int[] niz = { 1, 6, 7, 1, 5, 2, 3, 5, 6, 4, 9, 0, 8, 4 };
		System.out.println("Originalni niz: ");
		for (int i : niz)
			System.out.print(i + ", ");

		/*
		 * najbrze resenje, Set interfejs ne dozvoljava dupliranje elemenata,
		 * LinkedHashSet upisuje elemente po redosledu ulaska u listu
		 */

		Set<Integer> kolekcija1 = new LinkedHashSet<>();

		for (int i : niz)
			kolekcija1.add(i);

		System.out.println("\nLinkedHashSet: ");
		System.out.println(kolekcija1);

		/* resenje pomocu ArrayList i contains() metode */

		List<Integer> kolekcija2 = new ArrayList<>();

		for (int i = 0; i < niz.length; i++) {
			if (!kolekcija2.contains(niz[i]))
				kolekcija2.add(niz[i]);
		}
		System.out.println("ArrayList/contains(): \n" + kolekcija2);
	}
}