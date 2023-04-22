package stevan;

public class Poruka {

	private String message;

	// deklarisanjem privatnih podataka vrsi se ENKAPSULACIJA - skrivanje podataka
	// Sprecava se promena vrednosti promenljive iz koda van zadate klase

	// podatak = atribut = osobina klase
	// objekti imaju svoje atribute
	// atributi se predstavljaju preko promenljivih u deklaraciji klase
	// deklarisu se unutar klase van svih metoda

	// metoda setMessage postavlja poruku
	public void setMessage(String msg) { // metoda je public da bi moglo da se pristupi podacima
		// void znaci da ne vraca rezultat, kao parametar ima promneljivu istog tipa
		message = msg; // postavlja vrednost promenljivoj message
	}

	// metoda getMessage() vraca poruku
	public String getMessage() { // nema parametara, vraca odgovarajuci tip podataka
		return message;
	}

	/*
	 * parametri i argumenti metoda promenljiva deklarisana u zaglavlju metode
	 * nazivamo parametrom Argument se prosledjuje metodi prilikom pozivanja metode
	 * !!! Prilikom poziva, parametri dobijaju vrednost argumenta metode !!!
	 */
}
