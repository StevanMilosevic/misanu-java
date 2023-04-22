package stevan;

public class ObjekatKlasePrimer {

	public static void main(String[] args) {
		// nazivKlase nazivObjekta = new nazivKlase();
		A objekat = new A(); // kreiranje novog objekta(instance) klase A
		// svaki obj predstavlja instancu odredjene klase, kreiran tokom izvrsavanja
		// i sastavljen od odredjenog broja podataka

		// metode klase se pozivaju pomocu operatora . (tacka) operator pristupa
		// nazivObjekta.nazivMetode();
		objekat.prikaziPoruku();

	}
}
