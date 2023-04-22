package paket8;

public class Fajnali {
	// throw se koristi za bacanje izuzetka u telu metode
	// throws se koristi u zaglavlju metode da naznaci tipove izuzetaka koje baca
	// metoda
	static void procA() {
		try {
			System.out.println("Unutar procA");
			throw new RuntimeException("demo"); // MI bacamo izuzetak!
		} finally { // finally blok se izvrsava bez obzira da li je ili nije doslo do izuzetka
			System.out.println("finally od procA");
		}
	}

	static void procB() {
		try {
			System.out.println("ProcB");
			return;
		} finally {
			System.out.println("procB's finally");
		}
	}

	static void procC() {
		try {
			System.out.println("Inside procC");
		} finally {
			System.out.println("procC's finally");
		}
	}
}
