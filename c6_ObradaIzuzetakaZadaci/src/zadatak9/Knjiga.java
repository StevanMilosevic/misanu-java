package zadatak9;

import java.io.*;

public class Knjiga {
	private String naziv;
	private String autor;
	private String izdavac;
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	public void unetiNazivKnjige() {
		while (true) {
			try {
				System.out.print("Unesite naziv knjige: ");
				naziv = input.readLine();
				if (!naziv.isBlank())
					break;
			} catch (IOException e) {
				System.out.print("Niste dobro uneli naziv knjige!");
			}
		}
	}

	public void unetiAutoraKnjige() {
		boolean provera = true;
		while (provera) {
			try {
				System.out.print("Unesite autora knjige: ");
				autor = input.readLine();
				if (!autor.isEmpty() && !autor.isBlank())
					provera = false;

			} catch (IOException e) {
				System.out.println("Niste dobro uneli autora knjige!");
			}
		}
	}

	public void unetiIzdavacaKnjige() {
		boolean provera = true;
		while (provera) {
			try {
				System.out.print("Unesite izdavaca knjige: ");
				izdavac = input.readLine();
				if (!izdavac.isEmpty() && !izdavac.isBlank())
					provera = false;

			} catch (IOException e) {
				System.out.println("Niste dobro uneli izdavaca knjige!");
			}
		}
	}

	public void ispisi() {
		System.out.println(naziv + " / " + autor + " / " + izdavac);
	}
}