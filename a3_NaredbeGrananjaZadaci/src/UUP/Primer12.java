package UUP;

import java.util.Scanner;

public class Primer12 {
    public static void main(String[] args) {
        double a, b, c, min, r;
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite vrednost promenljive a: ");
        a = input.nextDouble();

        System.out.print("Unesite vrednost promenljive b: ");
        b = input.nextDouble();

        System.out.print("Unesite vrednost promenljive c: ");
        c = input.nextDouble();

        min = a;
        if (min > b) min = b;
        if (min > c) min = c;
        System.out.println("Najmanji broj je: " + min);

        if(min == 0) r = 3;
        else r = 1 / min;
        System.out.println("r = " + r);
        input.close();

    }
}
