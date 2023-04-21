package UUP;

import java.util.Scanner;

public class Primer4 {
    public static void main(String[] args) {
        double a, b, y;
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite vrednost za a: ");
        a = input.nextInt();

        System.out.print("Unesite vrednost za b: ");
        b = input.nextInt();

        if(a >= 0)
            y = ((1 - Math.min(a,b)) / (1 + Math.max(a, b)));
        else
            y = Math.min(a, b) / (Math.min(Math.pow(a, 2), Math.pow(b, 2)) + 3);

        System.out.println("Y je: " + y);
        input.close();
    }
}
