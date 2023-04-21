package stevan;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dan;
        System.out.print("Unesite dan u godini: ");
        dan = input.nextInt();
        
        input.close();

        if(dan % 7 == 0){
            System.out.println("ponedeljak");
        } 
        if(dan % 7 == 1)
        	System.out.println("utorak");
        if(dan % 7 == 2)
        	System.out.println("sreda");
        if(dan % 7 == 3)
        	System.out.println("cetvrtak");
        if(dan % 7 == 4)
        	System.out.println("petak");
        if(dan % 7 == 5)
        	System.out.println("subota");
        if(dan % 7 == 6)
        	System.out.println("nedelja");
    }
}
