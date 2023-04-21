package stevan;

// Napisati program za izračunavanje aritmetičke sredine unetih brojeva.

import java.io.*;

public class Zadatak13 {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("koliko brojeva zelite da unesete: ");
        int broj = Integer.parseInt(input.readLine());
        int zbir = 0; // predstavlja neutral prillikom sabiranja

        for(int i = 1; i <= broj; i++){
            System.out.println("Unesite " + i + ". broj: ");
            int x = Integer.parseInt(input.readLine());
            zbir += x;
        }
        System.out.println("Aritmeticka sredina je: " + zbir / broj);
    }
}
