package UUP;

import java.util.Scanner;

public class Primer10 {
    public static void main(String[] args) {
        int a, b, c, max;
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite vrednost promenljive a: ");
        a = input.nextInt();

        System.out.print("Unesite vrednost promenljive b: ");
        b = input.nextInt();

        System.out.print("Unesite vrednost promenljive c: ");
        c = input.nextInt();

        max = a;
        if(max < b) max = b;
        if(max < c) max = c;
        System.out.println("Najveci broj je: " + max);
        input.close();
    }
}