package UUP;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        System.out.print("Unesite x: ");
        x = sc.nextDouble();


        if (x < 0)
            y = -5;
        else if(0 <= x && x < 1)
            y = x + 2;
        else if(1 <= x && x < 5)
            y = 3 * x - 1;
        else y = 2 * x;

        System.out.println(y);
        sc.close();

    }
}