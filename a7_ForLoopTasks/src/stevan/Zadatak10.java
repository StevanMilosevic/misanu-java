package stevan;

// U zadatom intervalu ispitati i ispisati sve brojeve deljive brojem 3.

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite odakle pocinje interval: ");
        int pocetak = sc.nextInt();
        
        System.out.print("Unesite dokle traje interval: ");
        int kraj = sc.nextInt();
        
        int n = 0; // predstavlja neutral prilikom sabiranja

        for(int i = pocetak; i <= kraj; i++){
            if(i % 3 == 0){
                System.out.print(i + " ");
                n++;
            }
        }
        System.out.println("\nU zadatom intervalu ima " + n + " brojeva deljivih sa 3");
        sc.close();
    }
}
