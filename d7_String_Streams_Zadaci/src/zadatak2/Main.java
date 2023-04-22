package zadatak2;

import java.util.Scanner;

// Написати програм који учитава позитиван цео број n, а потом и n целих бројева. 
// Израчунати и исписати збир оних бројева који су истовремено и непарни и негативни. 
// У случају неисправног уноса, исписати одговарајућу поруку о грешци. 

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Koliko brojeva unosimo?");
		int n, zbir = 0;

		n = input.nextInt();
		if (n > 0) {
			System.out.println("Unesite brojeve: ");
			for (int i = 0; i < n; i++) {
				int a = input.nextInt();
				if (a < 0 && a % 2 != 0)
					zbir += a;
			}
		} else {
			System.out.println("Neispravanm unos");
		}
		System.out.println(zbir);
	}
}
