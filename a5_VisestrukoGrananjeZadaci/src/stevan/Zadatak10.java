package stevan;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        int x = input.nextInt();

        System.out.print("Unesite drugi broj: ");
        int y = input.nextInt();
        input.close();
        
        for(int i = x; x <= y; x++) {
        	if(i % 3 == 0) {
        		System.out.println(i);
        	}
        }
	}
}