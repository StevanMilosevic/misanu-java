package paket5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	// throws koristi se u zaglavlju metode
	// da naznaci tip/tipove izuzetaka koje ta metoda moze da izbaci
	public static int kolicnik(int imenilac, int brojilac) throws ArithmeticException {
		return imenilac / brojilac;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Unesite imenilac razlomka: ");
			int imenilac = input.nextInt();
			System.out.print("Unesite brojilac razlomka: ");
			int brojilac = input.nextInt();
			int rezultat = kolicnik(imenilac, brojilac);
			System.out.println("Rezultat: " + rezultat);
		} catch (ArithmeticException e) {
			System.out.println("Izuzetak: " + e);
		} catch (InputMismatchException e) {
			System.out.println("Unesite celobrojne vrednosti.");
		}

	}
}