package UUP;

import java.util.Scanner;

public class Primer14 {
    public static void main(String[] args) {
        int broj, s, d, j, t, rezultat;
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite trocifreni broj: ");
        broj = input.nextInt();
        input.close();

        s = broj / 100;
        d = (broj - s * 100) / 10;
        j = broj % 10;

        if (j > d) {
            t = j;
            j = d;
            d = t;
        }
        if (j > s){
            t = j;
            j = s;
            s = t;
        }
        if (d > s){
            t = d;
            d = s;
            s = t;
        }
        rezultat = s * 100 + d * 10 + j;
        System.out.print(rezultat);
    }
}
