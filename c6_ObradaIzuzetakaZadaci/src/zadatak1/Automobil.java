package zadatak1;

import java.io.*;

public class Automobil {
	String naziv;
	String proizvodjac;
	int godiste;
	double potrosnja;

	public void unetiNazivAutomobila() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite naziv automobila: ");
		naziv = input.readLine();
	}

	public void unetiProizvodjacaAutomobila() throws IOException {
		while (true) {
			try {
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Unesite proizvodjaca automobila: ");
				proizvodjac = input.readLine();
				break;
			} catch (Exception e) {
				System.out.println("Niste dobro uneli naziv proizvodjaca automobila");
			}
		}
	}

	public void unetiGodisteAutomobila() {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Unesite godiste automobila: ");
			godiste = Integer.parseInt(input.readLine());
		} catch (Exception e) {
			System.out.println("Niste dobro uneli broj!");
			unetiGodisteAutomobila();
		}
	}

	public void unetiPotrosnjuAutomobila() {
		while (true) {
			try {
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Unesite potrosnju automobila: ");
				potrosnja = Double.parseDouble(input.readLine());
				break;
			} catch (Exception e) {
				System.out.println("Niste ispravno uneli potrosnju automobila");
			}
		}
	}

	public String toString() {
		return "Naziv: " + naziv + "\nProizvodjac: " + proizvodjac + "\nGodiste: " + godiste + "\nPotrosnja: "
				+ potrosnja;
	}
}
