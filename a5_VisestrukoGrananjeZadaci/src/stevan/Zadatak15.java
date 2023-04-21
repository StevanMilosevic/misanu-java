package stevan;

import java.util.Scanner;

public class Zadatak15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Koliko brojeva zelite da unesete: ");
        int x = input.nextInt();
        int paran = 0, nula = 0, negativan = 0;
        
        input.close();
        
        for(int i = 1; i <= x; i++) {
			System.out.println("Unesite " + i + " broj: ");
            int y = input.nextInt();
            
            if(y > 0) {
            	paran++;
            }
            if(y == 0) {
            	nula++;
            }
            if(y < 0) {
            	negativan++;
            }
       }
        System.out.println(paran + " " + nula + " " + negativan);
	}
}
