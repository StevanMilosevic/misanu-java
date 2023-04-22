package predavanje2;

// Napisati program kojim se transponuju elementi pravougaone matrice.

import java.util.Scanner;

public class Zadatak10 {
	public static void stampaj(int red, int kolona, int[][] matrica) {
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void transponuj(int red, int kolona, int[][] matrica) {
		for (int i = 0; i < kolona; i++) {
			for (int j = 0; j < red; j++) {
				System.out.print(matrica[j][i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Koliko redova ima matrica: ");
		int red = input.nextInt();
		System.out.print("Koliko kolona ima matrica: ");
		int kolona = input.nextInt();
		int[][] matrica = new int[red][kolona];
		System.out.print("Unesite elemente niza: \n");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("matrica[" + i + ", " + j + "] = ");
				matrica[i][j] = input.nextInt();
			}
		}
		System.out.println("Matrica izgleda: ");
		stampaj(red, kolona, matrica);
		System.out.println("Nakon transponovanja matrica izgleda ovako: ");
		transponuj(red, kolona, matrica);
		input.close();
	}
}