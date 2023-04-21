package UUP;

import java.util.Scanner;

public class Primer9 {
    public static void main(String[] args) {
        double a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite vrednost promenljive a: ");
        a = input.nextDouble();

        System.out.print("Unesite vrednost promenljive b: ");
        b = input.nextDouble();

        if (b != 0)
            System.out.println("c je: " + (a / b));
        else
            System.out.println("Deljenje nulom!");
        input.close();
    }
}
