package zadatak6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		double P = 1;

		System.out.print("Unesite vrednost za n: ");
		int n = input.nextInt();

		for (int i = 2; i <= n + 1; i++) {
			P *= 1.0 - 1.0 / i;
		}
		System.out.println("Proizvod je " + df.format(P));
		input.close();
	}
}
