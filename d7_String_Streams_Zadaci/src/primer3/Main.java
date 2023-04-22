package primer3;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		// Osnovne U/I operacije
		// Za UI Java koristi strimove (tokove)
		// oni obezbedjuju nacin za rad sa podacima koji se primaju i salju

		// Klasa koja omogucuje da se poveze tastatura sa strimom (tokom)
		DataInputStream dis = new DataInputStream(System.in);

		// povezivanje fajla sa klasom FileOutputStream
		FileOutputStream fos = new FileOutputStream("rezultat.txt");

		System.out.println("Unesite string (unos prekinite unosom karaktera $)");

		// read() ucitava karaktere znak po znak
		// write() upisuje u fajl

		char ch;

		while ((ch = (char) dis.read()) != '$') {
			fos.write(ch);
		}
		fos.close();

	}

}
