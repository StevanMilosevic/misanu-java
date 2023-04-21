package stevan;

// U intervalu brojeva od 1 .. 100 ispitati sve parne brojeve

public class Zadatak9 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
