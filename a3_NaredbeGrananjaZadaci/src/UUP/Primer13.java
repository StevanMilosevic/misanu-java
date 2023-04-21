package UUP;

import java.util.Scanner;

public class Primer13 {
    public static void main(String[] args) {
        int x, y, x1, x2, y1, y2;
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite koordinatu za x: ");
        x = input.nextInt();
        System.out.print("Unesite koordinatu za y: ");
        y = input.nextInt();

        System.out.print("Unesite koordinatu za x1: ");
        x1 = input.nextInt();
        System.out.print("Unesite koordinatu za x2: ");
        x2 = input.nextInt();
        System.out.print("Unesite koordinatu za y1: ");
        y1 = input.nextInt();
        System.out.print("Unesite koordinatu za y2: ");
        y2 = input.nextInt();

        if((x > x1) & (x < x2) & (y > y1) & (y < y2))
            System.out.println("Unutar pravouganika!");
        else
            System.out.println("Nalazi se van pravouganika");
        input.close();

    }
}
