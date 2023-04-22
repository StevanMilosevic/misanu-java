package zadatak7;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// Kreirati program za unos vrednosti sa konzole, 
// smeštanje u kolekciji LinkedList ispisavanje smeštenih vrednosti. 

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> ll = new LinkedList<Integer>();
		System.out.println("Unesite koliko god brojeva zelite, prestanak unosa je kad unesete -1");

		while (true) {
			System.out.print("Unos broja: ");
			int num = input.nextInt();
			if (num == -1)
				break;
			ll.add(num);
		}
		System.out.println(ll);
		input.close();

	}

}
