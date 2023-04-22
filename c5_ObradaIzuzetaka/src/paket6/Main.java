package paket6;

public class Main {
	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 10 / a;
		} catch (ArithmeticException e) {
			System.out.println("Izuzetak");
		} /*
			 * catch(ArithmeticException e){ System.out.println(); }
			 */
		// ukoliko postoji vise catch blokova ciji tip parametra odgovara tipu
		// bacenog izuzetka, izvrsava se samo prvi takav blok
		// greska je navesti dva catch bloka sa istim tipom parametra
	}
}
