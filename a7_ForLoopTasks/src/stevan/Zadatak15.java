package stevan;

// Napisati program koji učitava 10 brojeva i ispisuje koliko ima negativnih, nula i pozitivnih brojeva

import java.util.Scanner;

public class Zadatak15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pozitivno = 0, negativno = 0, nula = 0; // predstavlja neutral prilikom sabiranja
        for(int i = 1; i <= 10; i++){
            System.out.println("Unesite " + i + ". broj:");
            int x = input.nextInt();

            if (x > 0){
                pozitivno++;
            }
            if(x == 0){
                nula++;
            }
            if(x < 0){
                negativno++;
            }
        }
        System.out.println("Pozitivnih ima: " + pozitivno);
        System.out.println("Nula ima: " + nula);
        System.out.println("Negativnih ima: " + negativno);
        input.close();

    }
}
