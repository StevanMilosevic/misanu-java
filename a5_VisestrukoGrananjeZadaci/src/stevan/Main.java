package stevan;

public class Main {

	public static void main(String[] args) {

        System.out.printf("%8s%8s%8s \n", "Broj", "Kvadrat", "Kub");
        
        for(int i = 1; i < 6; i++){
            System.out.printf("%8d%8d%8d \n", i, i * i, i * i * i);
        }

	}

}
