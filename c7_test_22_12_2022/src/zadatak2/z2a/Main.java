package zadatak2.z2a;

import zadatak2.z2.BankAccount;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite trenutno stanje na racunu: ");
		double uplata = Double.parseDouble(input.readLine());

		BankAccount ba = new BankAccount(uplata);
		ba.upitStanja();
		System.out.print("Koliko zelite da uplatite na racun? ");
		uplata = Double.parseDouble(input.readLine());
		ba.uplata(uplata);
		ba.upitStanja();
	}
}
