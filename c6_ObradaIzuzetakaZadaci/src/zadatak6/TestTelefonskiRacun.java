package zadatak6;

import java.io.*;

public class TestTelefonskiRacun {
	public static void main(String[] args) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		TelefonskiRacun tr = new TelefonskiRacun();

		try {
			System.out.print("Unesite broj racuna: ");
			String brojTelefona = input.readLine();
			System.out.print("Unesite ime i prezime vlasnika telefona: ");
			String vlasnik = input.readLine();
			System.out.print("Unesite iznos telefonskog racuna: ");
			double dugovanje = Double.parseDouble(input.readLine());

			tr.setBrojTelefona(brojTelefona);
			tr.setVlasnik(vlasnik);
			tr.setDugovanje(dugovanje);

			System.out.println("Uneti podacu su: ");
			System.out.println(tr.toString());

		} catch (Exception e) {
			System.out.println("Greska: " + e.getMessage());
		} finally {
			System.out.println("Hvala sto koristite nase usluge");
		}

	}
}
