package predavanje2;

// Napisati program kojim se određuju i ispisuju svi savršeni brojevi unetog broja m.
// Napomena: Broj je savršen ako je jednak sumi svih delitelja isključujući njega samog.
// Npr: 28 je savrsen broj
// 1 + 2 + 4 + 7 + 14 = 28

import java.io.*;

public class Zadatak17 {
	public static void savrsenBroj(int m) {
		System.out.println("Savrseni brojevi broja " + m + " su: ");
		for (int n = 2; n <= m; n++) {
			int suma = 1;
			int nk = n / 2;
			for (int i = 2; i <= nk; i++)
				if (n % i == 0)
					suma += n / i;
			if (suma == n)
				System.out.println(n);
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		// m - broj za koji se pronalaze svi savršeni brojevi
		int m;
		System.out.println("Unesite broj za koji se pronalaze svi savršeni brojevi m: ");
		m = Integer.parseInt(ulaz.readLine());
		savrsenBroj(m);
	}
}
