package stevan;

import java.util.Scanner;

public class Zadatak6 {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int n = input.nextInt();
        int fakt = 1;

        for(int i = 1;i <= n; i++ ){
            fakt *= i;
        }
        System.out.println("Faktorijel broja " + n + " je: " + fakt);
        input.close();

    }
}
