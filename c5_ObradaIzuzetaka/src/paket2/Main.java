package paket2;

public class Main {
	public static void main(String[] args) {
		int d, a;
		try { // u TRY bloku se stavljaju naredbe koje mogu dati izuzetak
			// kao i one naredbe koje se nece izvrsiti ako dodje do izuzetka
			d = 0;
			a = 10 / d;
			System.out.println("Ova poruka nece biti odstampana!");
		} catch (ArithmeticException e) {
			System.out.println("Deljenje nulom. ");
		}
		System.out.println("Program nastavlja sa izvrsenjem");

		// HIJERARHIJA IZUZETAKA:

		// svi izuzeci izvedeni su iz klase Throwable
		// Throwable ima dva direktna naslednika(potomka) i to su klase Error i
		// Exception

		// Klasa Error opisuje fatalne greske (greske na koje ne mozemo uticati)
		// Za greske tog tipa nije potrebno navoditi try/catch blokove

		// Klasa Exception jeste klasa iz koje se izvode (ona ima svoje naslednike)
		// klase koje
		// pripadaju neproverenim tipovima izuzetaka

		// Exception -> {RuntimeException, IOException}
		// RuntimeException -> {IndexOutOfBoundsException, ArithmeticException}
	}
}
