package stevan;

import java.util.Scanner;

public class Zadatak5if {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c1, c2, ce, izbor;
        System.out.print("Unesite kapacitet kondenzatora c1: ");
        c1 = input.nextInt();
        
        System.out.print("Unesite kapacitet kondenzatora c2: ");
        c2 = input.nextInt();
        
        System.out.print("Unesite vrednost 1 za rednu ili vrednost 2 za paralelnu vezu: ");
        izbor = input.nextInt();
        
        input.close();

        if (izbor == 1) {
            ce = (c1 * c2) / (c1 + c2);
            System.out.println(ce);
        } else if (izbor == 2) {
            ce = c1 + c2;
            System.out.println(ce);
        }else{
            System.out.println("Greska");
        }
    }
}
