package DZ1_4zadatak_StevanMilosevic;

// Apstraktna namirnica je energent koji ima ime (niska znakova) i jedinstven, automatski generisan celobrojan
// identifikator, koji mogu da se dohvate. Tekstualni opis je ime_namirnice[id].

abstract class Namirnica {
	private String ime;
	private int identifikator;

	Namirnica() {
	}

	abstract String getIme();

	abstract int getIdentifikator();

	abstract void opis();

}