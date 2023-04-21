package UUP;

import java.util.Scanner;

public class if4 {
    public static void main(String[] args) {

        // ispitati da li je broj paran

        Scanner input = new Scanner(System.in);
        int broj;
        System.out.print("Unesite broj: ");
        broj = input.nextInt();
        
        input.close();
        if(broj % 2 == 0){
            System.out.println("Broj je paran");
        }
        else{
            System.out.println("Broj je neparan");
        }

    }
}
