package primer4;

public class Main {

	public static void main(String[] args) {

		/*
		 * sva nabrajanja imaju dve unapred definisane metode values() -> vraca niz koji
		 * sadrzi listu konstanti definisanih u nabrajanju valueOf() -> vraca konstantu
		 * iz nabrajanja cija vrednost odgovara znakovnom nizu prosledjenom u argumentu
		 */

		Boja b;
		System.out.println("Boje: ");
		Boja nizBoja[] = Boja.values();

		for (Boja c : nizBoja)
			System.out.print(c + " ");

		Boja c1 = Boja.valueOf("Zuta"); // vraca vrednost iz nabrajanja koja
		// odgovara imenu konstante

		System.out.println("\nBoja: " + c1);

	}
}
