package UUP;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        // 0 - 49 ocena 1
        // od 50 do 60 ocena 2
        // 61 - 69 ocena 3
        // 70 - 80 ocena 4
        // 81 - 100 ocena 5
        // izvan toga je greska

        int bodovi, ocena = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite broj bodova: ");
        bodovi = input.nextInt();

        if(bodovi >= 0 && bodovi < 49)
            ocena = 1;
        else if(bodovi >= 50 && bodovi < 60)
            ocena = 2;
        else if(bodovi >= 61 && bodovi < 69)
            ocena = 3;
        else if(bodovi >= 70 && bodovi < 80)
            ocena = 4;
        else if(bodovi >= 81 && bodovi <= 100)
            ocena = 5;
        else System.out.println("greska");


        System.out.println("Ocena je: " + ocena);
        input.close();

    }
}
