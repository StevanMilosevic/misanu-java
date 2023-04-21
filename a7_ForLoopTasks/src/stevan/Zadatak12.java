package stevan;

// Napisati program koji prebrojava brojeve od 1 ... 20 koji su deljivi brojem 3.

public class Zadatak12 {
    public static void main(String[] args) {
        int n = 0; // predstavlja neutral prilikom sabiranja
        for(int i = 1; i <= 20; i++){
            if(i % 3 == 0){
                System.out.print(i + " ");
                n++;
            }
        }
        System.out.println("\nU zadatom intervalu ima " + n + " brojeva deljivih sa 3");
    }
}
