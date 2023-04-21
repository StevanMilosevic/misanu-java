package UUP;

// Napisati program kojim se izračunava vrednost sume
// S = 2/k + 2/(k+1) + 2/(k+2) +...+ 2/(k+n)
//za unete vrednosti k i n, uz pomoc while i do-while petlje

import java.util.Scanner;

public class Zadatak12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite vrednost za n: ");
		int n = input.nextInt();
		System.out.print("Unesite vrednost za k: ");
		int k = input.nextInt();
		double S = 0; // prestavlja neutral prilikom sabiranja
		int i = 0;

		while (i <= n) {
			S += (double) 2 / (k + i);
			i++;
		}
		/*
		 * do{ S += (double)2 / (k + i); i++; } while(i <= n);
		 */
		System.out.println("Zbir je: " + S);
		input.close();
	}
}
