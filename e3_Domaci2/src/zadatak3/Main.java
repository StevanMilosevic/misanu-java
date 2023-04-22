package zadatak3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double x, y;
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite vrednost za x: ");
		x = input.nextDouble();

		if (x < 5)
			y = Math.pow(x - 3, 2);
		else if (x < 8)
			y = x + 2;
		else
			y = x - 1;

		System.out.println("Za unetu vrednost X = " + x + ", dobija se Y = " + y);
		input.close();
	}
}