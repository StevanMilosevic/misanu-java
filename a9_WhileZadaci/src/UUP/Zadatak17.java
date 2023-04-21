package UUP;

import java.util.Scanner;

public class Zadatak17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k, n, i = 0;
		double s = 0; // neutral prilikom sabiranja
		System.out.print("Unesite vrednost za k: ");
		k = input.nextInt();
		System.out.print("Unesite vrednost za n: ");
		n = input.nextInt();

		while (i <= n) {
			s += (i + 1) / (double) (k + i);
			i++;
		}
		System.out.println("Suma je " + s);
		input.close();
	}
}
