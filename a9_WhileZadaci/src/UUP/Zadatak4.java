package UUP;

// Napisati program za ispisivanje neparnih brojeva od 1 do zadatog broja n.

import java.util.Scanner;

public class Zadatak4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite vrednost za n: ");
		int n = input.nextInt();
		int i = 1;

		if (n % 2 == 0)
			System.out.println("Uneli ste paran broj!");

		while (i <= n) {
			if (i % 2 != 0)
				System.out.print(i + " ");
			i++;
		}
		input.close();
	}
}
