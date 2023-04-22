package stevan;

import java.util.Scanner;

public class Zadatak15 {

	public static void main(String[] args) {
		int zbir = 0, pozitivni = 0;
		double ar = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Broj redova: ");
		int red = input.nextInt();

		System.out.print("Broj kolona: ");
		int kolona = input.nextInt();

		int[][] a = new int[red][kolona];

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + ", " + j + "] = ");
				a[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				zbir += a[i][j];
				if (a[i][j] > 0)
					pozitivni += a[i][j];
				// ubaci brojac, broj pozitivnih ne mora da bude isti
				// kao broj svih unetih elemenata
			}
		}
		ar = (double) zbir / (red * kolona);
		System.out.println("Aritmeticka sredina svih elemenata je: " + ar);
		System.out.println((double) pozitivni / (red * kolona));

		input.close();
	}
}
