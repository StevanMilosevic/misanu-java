package predavanje2;

import java.util.Scanner;

public class Zadatak14 {
	public static double CuF(double c) {
		return 1.8 * c + 32;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite temp u celzijusima: ");
		double c = input.nextDouble();
		System.out.println(CuF(c));
		
		input.close();
	}
}