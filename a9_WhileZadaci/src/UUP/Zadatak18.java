package UUP;

import java.util.Scanner;

public class Zadatak18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		double s = 0; // predstavlja neutral prilikom sabiranja
		System.out.print("Unesite vrednost za n: ");
		n = input.nextInt();
		int i = 1;
		while (i <= n) {
			s += i / Math.pow((2 * i - 1), 2);
			i++;
		}
		System.out.println("Suma je: " + s);
		input.close();

	}
}
