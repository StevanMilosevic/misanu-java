package UUP;

import java.util.Scanner;

public class Primer11 {
    public static void main(String[] args) {
        int a, b, c, min;
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite vrednost promenljive a: ");
        a = input.nextInt();

        System.out.print("Unesite vrednost promenljive b: ");
        b = input.nextInt();

        System.out.print("Unesite vrednost promenljive c: ");
        c = input.nextInt();

        min = a;
        if(min > b) min = b;
        if(min > c) min = c;
        System.out.println("Najmanji broj je: " + min);
        input.close();
    }
}
