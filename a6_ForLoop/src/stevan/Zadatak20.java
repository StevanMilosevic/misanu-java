package stevan;

import java.util.Scanner;

public class Zadatak20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double p = 1;
		for (int i = 1; i <= n; i++) {
			p *= (1 - (1 / 1 + i));
		}
		System.out.println(p);
		sc.close();
	}
}