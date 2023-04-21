package stevan;

// Napisati program koji sabira zadati broj sabiraka (korisnik unosi koliko)

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Koliko brojeva zelite da saberete? ");
        int x = input.nextInt();
        
        int zbir = 0; // predstavlja neutral prilikom sabiranja
        
        for(int i = 1; i <= x; i++){
            System.out.print("Unesite " + i + " broj: ");
            int y = input.nextInt();
            zbir += y;
        }
        
        System.out.println("Zbir unetih brojeva je: " + zbir);
        input.close();
    }
}
