package stevan;

import java.util.Scanner;

public class Zadatak5 {
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

        switch(izbor){
            case 1:{
                ce = (c1 * c2) / (c1 + c2);
                System.out.println(ce);
                break;
            }
            case 2:{
                ce = c1 + c2;
                System.out.println(ce);
                break;
            }
            default:
                System.out.println("Greska");
        }
    }
}
