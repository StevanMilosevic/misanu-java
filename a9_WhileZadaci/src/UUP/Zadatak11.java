package UUP;

// Napisati program kojim se izračunava vrednost sume
// 𝑆 = 1*1 + 3*3 + 5*5 +⋯+ 𝑛*n (samo neparni brojevi)
// resiti pomocu while i do-while petlje

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak11 {
	public static void main(String[] args) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite vrednost za n: ");
		int n = Integer.parseInt(input.readLine());
		System.out.print("Unesite vrednost za m: ");
		int m = Integer.parseInt(input.readLine());
		int suma = 0, S = 0;
		int i = 1, j = 1;

		while (i <= n) {
			if (i % 2 != 0)
				suma += i * i;
			i++;
		}
		do {
			S += j * j;
			j += 2;
		} while (j <= m);

		System.out.println("Zbir za n je: " + suma);
		System.out.println("Zbir za m je: " + S);

	}
}
