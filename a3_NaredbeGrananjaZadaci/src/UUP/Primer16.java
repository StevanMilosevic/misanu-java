package UUP;

import java.util.Scanner;

public class Primer16 {
    public static void main(String[] args) {
        double a, b, c, P;
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite vrednos' za a: ");
        a = input.nextDouble();
        
        System.out.print("Unesite vrednos' za b: ");
        b = input.nextDouble();
        
        System.out.print("Unesite vrednos' za c: ");
        c = input.nextDouble();

        if((a + b > c) & (a + c > b) & (b + c > a)){
            System.out.println("Trougao!");

	        P = 0.25 * (Math.sqrt((a + b + c) * (a + b - c) * (a + c - b) * (b + c - a)));
	        System.out.println("Povrsina trougla je: " + P); }
        else {
            System.out.println("Nije trougao");
        }
        input.close();
    }
}
