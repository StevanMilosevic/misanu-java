package zadatak7;

import java.util.Scanner;

// Napisati Java program koji će izračunati prosek svih pozitivnih cijelih brojeva 
// unutar datog raspona (npr. od 1 do 100). 
// Program treba da podržava unos raspona od korisnika i da ispisuje rezultat na ekran.

public class Main {

	public static void main(String[] args) {

		String s1 = "java"; // prvi put se kreira string sadrzine „java“, dodeljuje se alokacija
		String s2 = "java"; // Isti sadrzaj! Pravi se referenca ka s1 ali se ne kreira nov objekat
		String s3 = new String("Java"); // New uvek kreira nov objekat, alocira se memorija

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));

	}

}
