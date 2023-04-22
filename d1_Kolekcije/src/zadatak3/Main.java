package zadatak3;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		// interfejs <T> ime = new ArrayList<T>();
		// T predsavlja tip promenljive

		List<Integer> kolekcijaAL = new ArrayList<Integer>();
		TreeSet<String> kolekcijaSet = new TreeSet<String>();

		// add
		kolekcijaAL.add(5);
		kolekcijaAL.add(4);
		kolekcijaAL.add(9);
		kolekcijaAL.add(7);
		kolekcijaAL.add(12);

		System.out.println(kolekcijaAL);

		// razlika u odnosu na niz je?
		// - ovde nismo unapred zadali broj clanova niza, ovde je ta vrednost dinamicka
		// zaklucak: koristite ArrayList kada ne znate unapred velicinu niza

		kolekcijaSet.add("Bolivija");
		kolekcijaSet.add("Meksiko");
		kolekcijaSet.add("Srbija");
		kolekcijaSet.add("Nemacka");
		kolekcijaSet.add("Juzna Korea");
		kolekcijaSet.add("Indonezija");
		kolekcijaSet.add("Fidzi");
		kolekcijaSet.add("Austrija");

		System.out.println(kolekcijaSet);

	}

}
