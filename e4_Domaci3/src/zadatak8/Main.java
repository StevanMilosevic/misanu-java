package zadatak8;

import java.util.Scanner;

//Koristeći rekurzivan postupak izračunati sumu svih cifara unetog broja.

public class Main {

	static int rekurzija(int broj) {
		if (broj == 0)
			return 0;
		return (broj % 10 + rekurzija(broj / 10));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite broj: ");
		int broj = input.nextInt();

		System.out.println("Suma cifara unetog broja je: " + rekurzija(broj));
		input.close();
	}
}