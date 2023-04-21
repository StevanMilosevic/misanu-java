package kontrolni;

//Написати програм који унети број исписује у обрнутом поретку 

import java.io.*;

public class Zadatak2 {
	public static void main(String[] args) throws Exception {
		// inicijalizacija i ucitavanje promenljivih
		int broj, i, cifra;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Unesite broj: ");
		broj = Integer.parseInt(input.readLine());
		i = broj;

		// obrada i stampanje rezultata
		while (i != 0) {
			cifra = i % 10;
			System.out.print(cifra);
			i /= 10;
		}
	}
}
