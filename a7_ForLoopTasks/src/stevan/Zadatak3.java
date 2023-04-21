package stevan;

// Napisati program za računanje zbira brojeva od 1 do 10.

public class Zadatak3 {
    public static void main(String[] args) {
        int zbir = 0; // predstavlja neutral prilikom sabiranja
        for(int i = 1; i < 11; i++){
            zbir += i;
        }
        System.out.println("Zbir brojeva od 1 do 10 je: " + zbir);
    }
}
