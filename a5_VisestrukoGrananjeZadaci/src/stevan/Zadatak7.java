package stevan;

import java.util.Scanner;

public class Zadatak7 {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Unesite broj m: ");
        int m = input.nextInt();

        System.out.print("Unesite broj n: ");
        int n = input.nextInt();
        input.close();

        int S = n;

        for(int i = 1;i <= m; i++ ){
            S = S * (n + i * m);           		
        }
        System.out.println("Vrednost  je: " + S);
    }
}
