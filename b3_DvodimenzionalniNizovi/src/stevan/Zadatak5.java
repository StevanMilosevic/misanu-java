package stevan;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Broj redova: ");
		int red = input.nextInt();

		System.out.print("Broj kolona: ");
		int kolona = input.nextInt();

		int a[][] = new int[red][kolona];
		int zbir = 0;

		System.out.println("Unesite elemente niza: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + ", " + j + "] = ");
				a[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				zbir += a[i][j];
			}
		}
		System.out.println(zbir);
		input.close();

	}

}
