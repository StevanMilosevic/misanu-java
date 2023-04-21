package UUP;

import java.util.Scanner;

// Napisati program kojim se izračunava vrednost izraza za uneto k
// 𝑃 = 𝑘 * (𝑘+1) *...* (2𝑘−1) * 2𝑘.
public class Zadatak16 {
	public static void main(String[] args) {
		int k, i;
		double p = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite vrednost za k: ");
		k = input.nextInt();
		i = k;
		while (i <= (2 * k)) {
			p *= i++;
		}
		System.out.println("Proizvod je: " + p);
		input.close();
	}
}
