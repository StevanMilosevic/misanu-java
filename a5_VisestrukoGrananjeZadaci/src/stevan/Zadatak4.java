package stevan;

import java.util.Scanner;

public class Zadatak4 {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Koliko brojeva zelite da saberete: ");
	        int x = input.nextInt();
	        int zbir = 0;

	        for(int i = 1;i <= x; i++){
	            System.out.println("Unesite " + i + " broj: ");
	            int y = input.nextInt();
	            zbir += y;

	        }
	        input.close();
	        System.out.println("Zbir ovih brojeva je: " + zbir);
	    }
	}
