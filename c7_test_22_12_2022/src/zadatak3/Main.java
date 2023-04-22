package zadatak3;

import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Racunamo kvadratni koren kom broju? ");
		double broj = Double.parseDouble(input.readLine());

		KvadratniKoren kk = new KvadratniKoren();
		kk.racunanje(broj);
	}
}
