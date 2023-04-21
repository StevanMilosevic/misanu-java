package stevan;

import java.util.Scanner;

public class Zadatak13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Koliko brojeva zelite da unesete: ");
        int x = input.nextInt();
        input.close();
        
        double ar;
        double zbir = 0;
        
		for(int i = 1; i <= x; i++) {
			System.out.println("Unesite " + i + " broj: ");
            int y = input.nextInt();
            zbir += y;	
		}
		ar = zbir / x;
		System.out.print(ar);
	}
}