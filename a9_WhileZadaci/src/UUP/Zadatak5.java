package UUP;

// Napisati program za ispisivanje brojeva od 1 do zadatog broja n koji su deljivi sa a.

import java.io.*;

public class Zadatak5 {
	public static void main(String[] args) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite vrednost za n: ");
		int n = Integer.parseInt(input.readLine());
		System.out.print("Unesite vrednost za a: ");
		int a = Integer.parseInt(input.readLine());

		int i = 1;
		while (i <= n) {
			if (i % a == 0)
				System.out.print(i + " ");
			i++;

		}
	}
}
