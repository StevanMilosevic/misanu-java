package UUP;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        int godina;
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite godinu: ");

        godina = input.nextInt();

        if (godina % 4 == 0)
            System.out.println("godina je prestupna");
        else System.out.println("godina nije prestupna");
        input.close();

    }
}
