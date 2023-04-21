package stevan;

import java.util.Scanner;

public class Zadatak14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Koliko brojeva zelite da unesete: ");
        int x = input.nextInt();
        int parni = 0, zbir = 0; 
        
        
        
        for(int i = 1; i <= x; i++) {
			System.out.println("Unesite " + i + " broj: ");
            int y = input.nextInt();
            if(y % 2 == 0) {
            	parni++;
            	zbir += y;	
            }
       }
        System.out.println("Unetih parnih brojeva: " + parni);
        System.out.println("Zbir parnih brojeva: " + zbir);
        input.close();
	}

}
