package zadatak5;

// ZADATAK 5 - Kreirati program za unos vrednosti sa konzole,
// smeštanje u kolekciji LinkedList ispisavanje smeštenih vrednosti.

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<String> lista = new LinkedList<String>();
		System.out.println("Unosite automobile u listu, za prekid unosa upisite STOP: ");

		while (true) {
			System.out.print("Unesite auto: ");
			String auto = input.nextLine();

			if (auto.toUpperCase(Locale.ROOT).equals("STOP"))
				break;
			lista.add(auto);
		}
		input.close();
		ListIterator<String> iter = lista.listIterator(lista.size());
		System.out.println(lista);

		while (iter.hasPrevious())
			System.out.println(iter.previous());

	}
}
