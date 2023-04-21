package stevan;

// Napisati program kojim se štampaju Amstrongovi brojevi.
// Broj je Armstrongov ako je jednak zbiru kubova svojih cifara.
// interval je od 100 do 999

import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite pocetak intervala: ");
        int pocetak = input.nextInt();
        System.out.print("Unesite kraj intervala: ");
        int kraj = input.nextInt();
        int s, d, j, arm;
        for(int i = pocetak; i <= kraj; i++){
            s = i / 100;
            d = (i - (s * 100)) / 10;
            j = i % 10;
            arm = s * s * s + d * d * d + j * j * j;

            if(i == arm){
                System.out.print(i + " ");
            }
        }
        input.close();
    }
}
