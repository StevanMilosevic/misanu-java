package stevan;

// Napisati program za izračunavanje aritmetičke sredine parnih brojeva.
// za zadati interval od strane korisnika

import java.util.Scanner;

public class Zadatak14 {
    public static void main(String[] args) {
        // 1 deo algoritma - unosenje podataka
        Scanner input = new Scanner(System.in);
        System.out.print("Pocetak intervala: ");
        int pocetak = input.nextInt();
        
        System.out.print("Kraj intervala: ");
        int kraj = input.nextInt();
        
        int n = 0, zbir = 0; // predstavlja neutral prilikom sabiranja

        // 2 deo algoritma - obrada podataka
        for(int i  = pocetak; i <= kraj; i++){
            if(i % 2 == 0){
                zbir += i;
                n++;
            }
        }
        // 3 deo algoritma - stampanje rezultata
        int arm = zbir / n;
        System.out.println("Aritmeticka sredina parnih brojeva u zadatom intervalu je: " + arm);
        input.close();
    }
}
