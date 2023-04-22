package zadatak1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		double a, b, c, f, g, zbir, razlika;

		System.out.print("Unesite vrednost za a: ");
		a = input.nextDouble();

		System.out.print("Unesite vrednost za b: ");
		b = input.nextDouble();

		System.out.print("Unesite vrednost za c: ");
		c = input.nextDouble();
		input.close();

		f = (a - b) / (c + (a / (c + (b / (c - b)))));
		g = (a + b + Math.sin(a)) * Math.cos(c);

		zbir = f + g;
		razlika = f - g;
		System.out.println("Zbir vrednosti funkcija f i g je: " + df.format(zbir));
		System.out.println("Razlika vrednosti funkcija f i g je: " + df.format(razlika));
	}
}
