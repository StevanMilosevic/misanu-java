package UUP;

import java.util.Scanner;

public class Vezba2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite vrednost za n: ");
		int n = input.nextInt();
		double s = 0; // neutral, sabiranje
		int i = 1;
		while (i <= n) {
			s += 1.0 / Math.pow((3 * i), 2);
			i++;
		}
		System.out.println("Vrednost sume je: " + s);
		input.close();
	}
}
