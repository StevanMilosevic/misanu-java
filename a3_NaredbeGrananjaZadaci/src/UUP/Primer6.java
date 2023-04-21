package UUP;

import java.util.Scanner;

public class Primer6 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite vrednost za a: ");
        a = input.nextInt();

        System.out.print("Unesite vrednost za b: ");
        b = input.nextInt();

       if (a > b)
           c = 2 * a + b;
       else
           c = a - 2 * b;
        System.out.println("c je: " + c);
        input.close();
    }
}
