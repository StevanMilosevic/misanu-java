package UUP;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        double x, y;
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite x: ");
        x = input.nextDouble();

        if (x < 0)
            y = -1;
        else if(x == 0)
            y = 0;
        else y = 1;

        System.out.println(y);
        input.close();
    }
}
