package stevan;

import java.util.Scanner;

public class Zadatak13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Broj redova: ");
		int red = input.nextInt();

		System.out.print("Broj kolona: ");
		int kolona = input.nextInt();

		int[][] a = new int[red][kolona];

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				a[i][j] = 4;
			}
		}
		int zbir = 0;
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (a[i][j] > 3)
					zbir += a[i][j];
			}
		}
		System.out.println("Zbir elemenata niza vecih od 3 je: " + zbir);
		input.close();
	}

}
