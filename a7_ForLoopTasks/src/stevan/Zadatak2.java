package stevan;

// Napisati program koji računa kvadrat i kub brojeva od 1 do 5.

public class Zadatak2 {
    public static void main(String[] args) {
        for(int i = 1; i < 6; i++) {
            System.out.println("Broj: " + i + " kvadrat: " + i * i + " kub: " + i * i * i);
        }
    }
}
