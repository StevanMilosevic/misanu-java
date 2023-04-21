package stevan;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        // 1 deo: unos podataka
        Scanner input = new Scanner(System.in);
        char slovo;
        System.out.print("Unesite jedno slovo: ");
        slovo = input.next().charAt(0);
        input.close();

        // 2 deo: obrada podataka
        switch (slovo) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("samoglasnik");
                break;
            default:
                System.out.println("Suglasnik");
        }
    }
}
