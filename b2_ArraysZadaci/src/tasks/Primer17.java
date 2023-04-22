package tasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primer17 {
	public static void main(String[] args) throws Exception {
		double vrednostBoda, suma = 0;
		String[] ime = new String[20];
		double[] brojBodova = new double[20];
		double[] rataKredita = new double[20];
		double[] clanarina = new double[20];
		double[] licniDohodak = new double[20];
		int brojRadnika;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite vrednost boda: ");
		vrednostBoda = Double.parseDouble(input.readLine());
		System.out.print("Unesite broj radnika: ");
		brojRadnika = Integer.parseInt(input.readLine());
		System.out.print("Unesite podatke o radnicima: " + "ime, broj bodova, ratu kredita i clanarinu: ");
		for (int i = 1; i <= brojRadnika; i++) {
			System.out.println("Podaci za " + i + ". radnika: ");
			System.out.print("Ime: ");
			ime[i] = input.readLine();
			System.out.print("Broj bodova: ");
			brojBodova[i] = Double.parseDouble(input.readLine());
			System.out.print("Ratu kredita: ");
			rataKredita[i] = Double.parseDouble(input.readLine());
			System.out.print("Clanarinu: ");
			clanarina[i] = Double.parseDouble(input.readLine());

			licniDohodak[i] = brojBodova[i] * vrednostBoda - rataKredita[i] - clanarina[i];
			suma += licniDohodak[i];
		}
		System.out.println("Ime\tBroj bodova\tRata kredita\tClanarina\tPlata");

		for (int i = 1; i <= brojRadnika; i++) {
			System.out.println("" + ime[i] + "\t" + brojBodova[i] + "\t\t" + rataKredita[i] + "\t\t" + clanarina[i]
					+ "\t" + licniDohodak[i]);
		}
		System.out.println("==============================================================");
		System.out.println("Ukupno za isplatu: " + suma);
	}
}
