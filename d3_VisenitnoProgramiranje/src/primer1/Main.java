package primer1;

public class Main {

	public static void main(String[] args) {

		// Prilikom pokretanja java programa jedna programska nit odmah pocinje da se
		// izvrsava
		// To je glavna ili inicijalna nit. Ona prva nastaje i poslednja se zavrsava,
		// ima i ulogu i da ocisti sve za ostalim nitima, nesto kao garbage collector

		// Upravljanje glavnom niti radi se preko objekta tipa Thread i to pozivom
		// metode
		// currentThread() klase Thread

		Thread t = Thread.currentThread();

		System.out.println("Trenutna nit: " + t);

		// [ime niti, prioritet, ime grupe kojoj pripada nit]
		// podrazumevano ime glavne niti je "main". Njen prioritet je 5 po defaultu.
		// (treci parametar) main je ime grupe niti kojoj ta nit pripada
		// grupa niti je struktura podataka koja upravlja stanjem kolekcije niti kao
		// celinom.

		// getName() vraca ime niti
		System.out.println("Naziv niti: " + Thread.currentThread().getName());

		// getPriority() vraca prioritet niti
		System.out.println("Prioritet niti je: " + Thread.currentThread().getPriority());

	}
}
