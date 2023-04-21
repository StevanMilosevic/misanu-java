package stevan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1 deo: unos podataka
        // 2 deo: obrada podataka
        // 3 deo: stampanje podataka

        Scanner input = new Scanner(System.in);
        int ocena;
        System.out.print("Unesite ocenu: ");
        ocena = input.nextInt();
        
        input.close();
        
        switch(ocena){
            case 5:{
                System.out.println("Odlican 5!");
                break;
            }
            case 4:{
                System.out.println("Vrlo dobar 4");
                break;
            }
            case 3:{
                System.out.println("Dobar 3");
                break;
            }
            case 2:{
                System.out.println("Dovoljan 2");
                break;
            }
            case 1:{
                System.out.println("Nedovoljan 1");
                break;
            }
            default:
                System.out.println("Uneta ocena ne postoji");

        }
    }
}
