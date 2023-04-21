package stevan;

import java.util.Scanner;

public class Dan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dan;
        System.out.print("Unesite broj jednog dana u nedelji: ");
        dan = input.nextInt();
        
        input.close();

        switch (dan) {
            case 1: {
                System.out.println("Ponedeljak");
                break;
            }
            case 2: {
                System.out.println("Utorak");
                break;
            }
            case 3: {
                System.out.println("Sreda");
                break;
            }
            case 4: {
                System.out.println("Cetvrtak");
                break;
            }
            case 5: {
                System.out.println("Petak");
                break;
            }
            case 6: {
                System.out.println("ubota");
                break;
            }
            case 7: {
                System.out.println("Nedelja");
                break;
            }
            default:
                System.out.println("Taj dan ne postoji");
        }
    }
}
