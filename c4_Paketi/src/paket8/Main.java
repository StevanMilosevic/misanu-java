package paket8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double r, a;
		System.out.println("Unesite poluprecnik: ");
		r = input.nextDouble();
		a = 3.14 * r * r;
		System.out.println("Povrsina kruga je: " + a);

	}

}
