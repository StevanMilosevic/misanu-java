package zadatak2;

// ZADATAK 2 - Lambda izrazom izracunati faktorijel broja.

public class Main {
	public static void main(String[] args) {
		Racunanje faktorijel = (n) -> {
			int rezultat = 1;
			for (int i = 1; i <= n; i++)
				rezultat *= i;
			return rezultat;
		};

		System.out.println("Faktorijel broja 3 je: " + faktorijel.fakt(3));
		System.out.println("Faktorijel broja 4 je: " + faktorijel.fakt(4));
		System.out.println("Faktorijel broja 5 je: " + faktorijel.fakt(5));
	}
}
