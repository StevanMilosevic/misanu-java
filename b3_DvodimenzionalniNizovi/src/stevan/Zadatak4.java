package stevan;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Broj redova: ");
		int red = input.nextInt();

		System.out.print("Broj kolona: ");
		int kolona = input.nextInt();

		int a[][] = new int[red][kolona];
		int b[][] = new int[red][kolona];
		int c[][] = new int[red][kolona];
		int d[][] = new int[red][kolona];
		int e[][] = new int[red][kolona];
		int f[][] = new int[red][kolona];
		int g[][] = new int[red][kolona];

		System.out.println("Unesite elemente prvog niza: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + ", " + j + "] = ");
				a[i][j] = input.nextInt();
			}
		}
		System.out.println("Unesite elemente drugog niza: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("b[" + i + ", " + j + "] = ");
				b[i][j] = input.nextInt();
			}
		}
		System.out.println("elementi dvodimenzionalnog niza a su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("elementi dvodimenzionalnog niza b su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("Zbir elemenata nizova a i b je: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				d[i][j] = a[i][j] - b[i][j];
			}
		}
		System.out.println("Razlika elemenata nizova a i b: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				e[i][j] = a[i][j] * b[i][j];
			}
		}
		System.out.println("Proizvod elemenata nizova a i b: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(e[i][j] + " ");
			}
			System.out.println();
		}
		int skalar = 3;
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				f[i][j] = skalar * a[i][j];
				g[i][j] = skalar * b[i][j];
			}
		}
		System.out.println("Proizvod matrice A skalarom: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(f[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Proizvod matrice B skalarom: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(g[i][j] + " ");
			}
			System.out.println();
		}
		input.close();
	}
}