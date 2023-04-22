package zadatak4;

public class Main {

	public static void main(String[] args) {

		A<Integer> intObjekat = new A<Integer>(100);

		intObjekat.prikaziTip();
		int vrednostIntObjekta = intObjekat.getOb();
		System.out.println("Vrednost: " + vrednostIntObjekta);

		A<String> strObjekat = new A<String>("proba");
		strObjekat.prikaziTip();
		String str = strObjekat.getOb();
		System.out.println("Vrednost: " + str);

		// ZAKLUCAK:
		// T je zamena za stvarni tip koji ce biti zadat u trenutku kreiranja objekta
		// klase A

	}

}
