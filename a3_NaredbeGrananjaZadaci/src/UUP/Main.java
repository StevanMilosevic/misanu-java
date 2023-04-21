package UUP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* za uneti broj ispitati da li je pozitivan, negativan ili jednak 0 */

        // 1 deo. unos podataka
        Scanner input = new Scanner(System.in);
        int broj;
        System.out.print("Unesite broj: ");
        broj = input.nextInt();
        input.close();

        // 2 deo algoritma: obrada podataka

        if(broj > 0){
            System.out.println("Broj je pozitivan");
        }
        if(broj < 0){
            System.out.println("Broj je negativan");
        }
        if(broj == 0){
            System.out.println("Uneti broj je 0");
        }
    }
}
