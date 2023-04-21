package UUP;

import java.util.Scanner;

public class If3 {
    public static void main(String[] args) {

        // za uneti broj ispitati da li je deljiv sa brojem 2 i brojem 3

        Scanner input = new Scanner(System.in);
        System.out.print("Unesite promenljivu x: "); // nije neophodna linija koda!!!
        int x = input.nextInt();
        input.close();

        if((x%2==0) & (x%3==0)){
            System.out.println("deljiv je i sa 2 i sa 3");
        }
        else{
            System.out.println("nije deljiv");
        }
    }
}
