package zadatak3;

import java.io.*;

public class TestArtikal {
	public static void main(String[] args) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Unesite naziv artikla: ");
		String naziv = input.readLine();
		System.out.print("Unesite proizvodjaca artikla: ");
		String proizvodjac = input.readLine();
		System.out.print("Unesite barkod artikla: ");
		String barkod = input.readLine();
		System.out.print("Unesite cenu artikla: ");
		double cena = Double.parseDouble(input.readLine());

		Artikal artikal = new Artikal();

		try {
			artikal.setNaziv(naziv);
			artikal.setProizvodjac(proizvodjac);
			artikal.setBarkod(barkod);
			artikal.setCena(cena);

			System.out.println("Uneti podaci o artiklu su: ");
			System.out.println(artikal.toString());
		} catch (IzuzetakArtikal e) {
			System.out.println(e.getMessage());
		}

	}
}
