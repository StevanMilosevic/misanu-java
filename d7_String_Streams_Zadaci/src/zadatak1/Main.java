package zadatak1;

import java.util.Scanner;

// Радно време фирме је између 9 и 17 часова. 
// Одредити да ли је послати мејл стигао у току радног времена. 

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("U koliko sati je stigao mejl? ");
		int sati = input.nextInt();
		System.out.print("U koliko minuta je stigao mejl? ");
		int minuti = input.nextInt();

		if (sati >= 9 && sati < 17 && minuti >= 0 && minuti < 60)
			System.out.println("Mejl je stigao u radno vreme");
		else
			System.out.println("Mejl nije stigao u radno vreme");

	}

}
