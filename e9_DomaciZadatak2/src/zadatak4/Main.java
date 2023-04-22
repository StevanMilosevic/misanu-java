package zadatak4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Tacka tacka1 = new Tacka(2.2, 4, 1, 3);
		Tacka tacka2 = new Tacka(3.4, 5, 3, 1);
		Tacka tacka3 = new Tacka(1.8, 2, 8, 7);
		Niz niz = new Niz();
		niz.dodajTacku(tacka1);
		niz.dodajTacku(tacka2);
		niz.dodajTacku(tacka3);

		System.out.println("Radi pojednostavljenja unosa, u niz su vec unete 3 tacke");
		System.out.println("Unosimo tacke dok se ne unese tacka sa NEGATIVNOM masom:");

		boolean provera = true;
		while (provera) {
			System.out.print("x = ");
			double x = input.nextDouble();
			System.out.print("y = ");
			double y = input.nextDouble();
			System.out.print("z = ");
			double z = input.nextDouble();
			System.out.print("Realna masa = ");
			double masa = input.nextDouble();

			if (masa < 0)
				provera = false;

			niz.dodajTacku(new Tacka(masa, x, y, z));
		}
		System.out.println("Ispis tacaka: ");
		niz.ispis();

		// тачкa која највише привлачи тачку јединичне масе у координатном почетку
		Tacka tackaPrivlacenja = new Tacka();

		System.out.println("Tacka iz niza koja najvise privlaci tacku iz koordinatnog pocetka je: ");
		niz.najvecePrivlacenje(tackaPrivlacenja).opis();
		
		input.close();
	}
}
