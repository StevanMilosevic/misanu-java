package zadatak7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ApsolutnaVrednost aps = new ApsolutnaVrednost();
		System.out.print("Unesite broj: ");
		int x = input.nextInt();
		
		System.out.println("Apsolutna vrednost od " + x + " je: " + aps.apsolutna(x));
		
		input.close();

	}

}
