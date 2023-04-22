package oop9;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite naziv knjige: ");
		String ime = input.nextLine();
		System.out.println("Unesite broj strana: ");
		int brStrana = input.nextInt();

		Knjiga knjiga = new Knjiga();
		knjiga.setIme(ime);
		knjiga.setBrojStrana(brStrana);
		knjiga.stampaj();
		
		input.close();

	}
}
