package zadatak4;

//ZADATAK 4 - Kreirati program za unos vrednosti sa konzole,
//smeštanje u kolekciji ArrayList i ispisavanje smeštenih vrednosti.

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unosite brojeve po zelji, prekid unosa je kad unesete -1 ");
		List<Integer> kolekcija = new ArrayList<Integer>();

		while (true) {
			System.out.print("Unesite broj: ");
			int num = input.nextInt();

			if (num == -1)
				break;
			kolekcija.add(num);
		}
		input.close();
		System.out.println(kolekcija);
	}
}
