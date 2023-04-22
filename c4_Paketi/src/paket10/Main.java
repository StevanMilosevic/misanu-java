package paket10;

// static import za static field

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double r, a;
		System.out.println("Unesite poluprecnik: ");
		r = input.nextDouble();
		a = PI * r * r;
		System.out.println("Povrsina kruga je: " + a);

	}

}
