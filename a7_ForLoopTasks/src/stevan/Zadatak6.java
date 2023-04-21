package stevan;

// Napisati naredbe kojima se za dato n izračunava faktorijel prirodnog broja
// n: fakt = n! = 1*2*3*...*n

import java.io.*;

public class Zadatak6 {
    public static void main(String[] args) throws Exception {
        // 1 deo algoritma - prikupljanje podataka
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Unesite broj kojem treba da se sracuna faktorijel: ");
        int n = Integer.parseInt(input.readLine());
        int fakt = 1; // predstavlja neutral prilikom mnozenja

        // 2 deo algoritma - obrada podataka

        for(int i = 1; i <= n; i++){
            fakt *= i;
        }
        // 3 deo algoritma - stampanje rezultata

        System.out.println("Faktorijel broja " + n + " je: " + fakt);
    }
}
