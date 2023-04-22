package predavanje2;

import java.util.Scanner;

public class Zadatak9 {
	public static void stampaj(int n, int[][] niz) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void zamena(int n, int[][] niz) {
		for (int i = 0; i < n; i++) {
			int tmp = niz[i][i];
			niz[i][i] = niz[i][n - i - 1];
			niz[i][n - i - 1] = tmp;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Dimenzija matrice: ");
		int n = input.nextInt();
		int[][] niz = new int[n][n];
		System.out.print("Unesite elemente niza: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("niz[" + i + ", " + j + "] = ");
				niz[i][j] = input.nextInt();
			}
		}
		stampaj(n, niz);
		System.out.println("Nakon transformacije matrica izgleda: ");
		zamena(n, niz);
		stampaj(n, niz);
		input.close();
	}
}