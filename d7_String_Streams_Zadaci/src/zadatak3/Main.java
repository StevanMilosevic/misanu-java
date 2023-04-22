package zadatak3;

import java.util.Scanner;

// Написати програм који за унети позитиван цео број проверава и 
// исписује да ли се цифра 5 налази у његовом запису. 

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj");
		int broj = input.nextInt();

		int brojac = 0;

		while (broj != 0) {
			int cifra = broj % 10;
			if (cifra == 5) {
				brojac++;
			}
			broj /= 10;
		}
		if (brojac > 0)
			System.out.println("Ima");
		else
			System.out.println("Nema broja 5");

	}

}
