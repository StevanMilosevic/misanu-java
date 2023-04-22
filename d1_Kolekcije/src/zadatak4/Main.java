package zadatak4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> kolekcija = new ArrayList<String>();

		// size() - vraca broj elemenata smestenih u kolekciji ArrayList
		System.out.println("Pocetna duzina: " + kolekcija.size());

		// add() - dodaje element na kraj kolekcije
		kolekcija.add("Prvi");
		kolekcija.add("Drugi");
		kolekcija.add("Treci");
		kolekcija.add("Cetvrti");

		// prolazak kroz kolekciju
		for (String s : kolekcija)
			System.out.printf("%s ", s);

		System.out.println("\nTrenutna duzina: " + kolekcija.size());

		// provera da li se neki zadati element nalazi unutar kolekcije
		// postoji ugradjena funkcija contains() -> vraca TRUE ako kolekcija sadrzi
		// trazeni element
		// odnosno vraca FALSE ukoliko kolekcija ne sadrzi trazeni element

		boolean sadrzi = kolekcija.contains("Treci"); // true ili false
		// .contains() ispituje sve sto je ostavljeno unutar() pa tako "Prvi" i "Prvi "
		// nisu isti!!!

		if (sadrzi) {
			System.out.println("Trazeni element se nalazi u zadatoj kolekciji");
		} else {
			System.out.println("Trazeni element se ne nalazi u zadatoj kolekciji");
		}

		// get() - vraca element sa zadatim indeksom
		String element = kolekcija.get(2);
		System.out.println("Element sa indeksom 2 u kolekciji je: " + element);

		// indexOf() - vraca indeks prve pojave zadatog elementa kolekcije
		// vratice -1 ukoliko trazeni element ne postoji

		int pozicija = kolekcija.indexOf("Drugi");
		System.out.println("Element Drugi je na poziciji: " + pozicija);

		// toArray() - sluzi za prebacivanje elemenata u niz
		String[] nizString = new String[kolekcija.size()];
		kolekcija.toArray(nizString);
		for (String s : nizString)
			System.out.printf("%s ", s);

		// remove() - brise prvu pojavu zadate vrednosti
		System.out.println("\nKolekcija nakon uklanjanja elementa Treci: ");

		kolekcija.remove("Treci");
		for (String s : kolekcija)
			System.out.printf("%s ", s);

		// clear() - brise sve elemente iz zadate kolekcije
		kolekcija.clear();
		System.out.println("\nVelicina kolekcije nakon brisanja: " + kolekcija.size());

	}
}
