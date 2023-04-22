package zadatak2;

import java.util.Scanner;

public class UnapredjenaForPetlja {

	public static void main(String[] args) {
		/*
		 * int[] niz = {2, 5, 7, 9, 29};
		 * 
		 * // stampanje elementa niza
		 * System.out.println("Stampanje elemenata niza for petljom: "); for(int i = 0;
		 * i < niz.length; i++) { System.out.print(niz[i] + " "); }
		 * 
		 * System.out.println("\nStampanje elemenata niza unapredjenom for petljom: ");
		 * for(int i : niz) { System.out.print(i + " "); }
		 */
		int[] brojevi = new int[5];
		Scanner input = new Scanner(System.in);
		for (int i : brojevi) {
			System.out.print("Unesite broj: ");
			brojevi[i] = input.nextInt();
		}
		for (int i : brojevi) {
			System.out.print(i + " ");
		}
		input.close();
	}

}
