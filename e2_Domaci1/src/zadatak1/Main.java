package zadatak1;

// ZADATAK 1: Napisati Lambda izraz koji ispituje da li je broj negativan.

public class Main {
	public static void main(String[] args) {
		Ispitivanje is = n -> n < 0;

		if (is.test(2))
			System.out.println("Broj je negativan");
		else
			System.out.println("Broj je pozitivan");

		if (is.test(-2))
			System.out.println("Broj je negativan");
		else
			System.out.println("Broj je pozitivan");
	}
}
