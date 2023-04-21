package stevan;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int ocena;
        System.out.print("Unesite ocenu: ");
        ocena = input.nextInt();
        input.close();

        if(ocena == 5)
            System.out.println("Odlican");
        else if (ocena == 4)
            System.out.println("Vrlo dobar");
        else if(ocena ==3)
            System.out.println("dobar");
        else if(ocena == 2)
            System.out.println("dovoljan");
        else if(ocena == 1)
            System.out.println("Nedovoljan");
        else System.out.println("Uneta ocena ne postoji");
    }
}
