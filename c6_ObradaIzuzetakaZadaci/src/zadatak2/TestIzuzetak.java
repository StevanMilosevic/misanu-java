package zadatak2;

import java.io.*;

public class TestIzuzetak {
	public static void main(String[] args) throws IOException {
		String ime;
		String prezime;
		String adresa;
		int indeks;

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite broj studenata: ");
		int n = Integer.parseInt(input.readLine());
		Student[] student = new Student[n];

		try {
			for (int i = 0; i < n; i++) {
				System.out.print("Unesite ime " + (i + 1) + ". studenta: ");
				ime = input.readLine();
				System.out.print("Unesite prezime " + (i + 1) + ". studenta: ");
				prezime = input.readLine();
				System.out.print("Unesite adresu " + (i + 1) + ". studenta: ");
				adresa = input.readLine();
				System.out.print("Unesite broj indeksa " + (i + 1) + ". studenta: ");
				indeks = Integer.parseInt(input.readLine());

				student[i] = new Student(ime, prezime, adresa, indeks);
			}
			System.out.println("\nIme\tPrezime\tAdresa\tBroj indeksa");
			for (int i = 0; i < n; i++)
				student[i].ispisi();
		} catch (Izuzetak e) {
			System.out.println(e.getMessage());
			System.out.println("Indeks studenta za koji se desio izuzetak je: " + e.getIndeksStudenta());
		}
	}
}
