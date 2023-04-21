package UUP;

import java.util.Scanner;

public class Primer5 {
    public static void main(String[] args) {
        double a, y;
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite vrednost promenljive a: ");
        a = input.nextDouble();

        if (a > 0)
            y = Math.sqrt(a);
        else
            y = Math.pow(a, 2);

        System.out.println("Y je: " + y);
        input.close();

    }
}
