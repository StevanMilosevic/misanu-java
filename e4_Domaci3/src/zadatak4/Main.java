package zadatak4;

//Napisati program koji računa broj parnih i neparnih brojeva u nizu.

public class Main {
	public static void main(String[] args) {
		int[] niz = { 2, 27, 6, 31, 7, -12, 8, 32, 11, 15, 25, 0, 63, 17 };
		int parni = 0, neparni = 0;

		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % 2 == 0 && niz[i] != 0) // izbacujemo 0 iz brojanja
				parni++;
			if (niz[i] % 2 != 0)
				neparni++;
		}
		System.out.println("Parnih brojeva u nizu ima: " + parni);
		System.out.println("Neparnih brojeva u nizu ima: " + neparni);
	}
}