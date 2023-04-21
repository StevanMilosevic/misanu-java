package UUP;

import java.util.Scanner;

public class Primer7 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite vrednost za a: ");
        a = input.nextInt();

        System.out.print("Unesite vrednost za b: ");
        b = input.nextInt();

        if((a % 2 == 0) & (b % 3 == 0))
            c = a + b;
        else
            c = a - b;

        System.out.println("c je: " + c);
        input.close();
    }
}
