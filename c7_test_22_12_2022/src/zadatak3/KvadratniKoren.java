package zadatak3;

public class KvadratniKoren {
	private double broj;

	public void racunanje(double broj) {
		try {
			if (broj > 0) {
				System.out.println("Provera broja: " + broj);
				System.out.println("Kvadratni koren broja " + broj + " iznosi " + Math.sqrt(broj));
			} else if (broj < 0)
				throw new Izuzetak("Kvadratni koren broja " + broj + " se ne moze izracunati");

		} catch (Izuzetak e) {
			System.out.println(e);
		}
	}
}
