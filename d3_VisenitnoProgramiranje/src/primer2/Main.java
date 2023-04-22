package primer2;

// pokretanje nove niti 

// Novu nit pokrecemo tako sto napravimo instancu objekta tipa Thread
// to se moze uraditi na dva nacina
// 1. nacin: implementacija interfejsa Runnable
// 2 nacin: prosirivanjem klase Thread

// U main klasi :
// Nakon kreiranja klase koja implementira interfejs runnable, potrebno je napraviti
// instancu objekta tipa Thread

public class Main {

	public static void main(String[] args) {

		A a = new A();

		// oblik konstruktora:
		// Thread(Runnable objekatNit, String imeNiti)
		// objekatNit je instanca klase koja implementira interfejs Runnable
		// Ona definise mesto gde zapocinje nit
		// imeNiti - predstavlja ime nove niti, koju mi zadajemo

		Thread t1 = new Thread(a, "Nit1");
		Thread t2 = new Thread(a, "Nit2");
		Thread t3 = new Thread(a, "Nit3");

		t1.start();// poziva start() poziva metodu run()
		t2.start();
		t3.start();

		// System.out.println(Runtime.getRuntime().availableProcessors());
		// da vidimo koliko procesora imamo na raspolaganju

	}

}
