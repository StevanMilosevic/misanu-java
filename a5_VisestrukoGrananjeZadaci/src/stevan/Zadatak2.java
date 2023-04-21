package stevan;

public class Zadatak2 {
	public static void main(String[] args) {
		
        int zbir = 0; // predstavlja neutral prilikom sabiranja 
        
        for(int i = 1; i < 11; i++){
            zbir = zbir + i; // zbir += i;
       }
        
        System.out.println("Zbir brojeva iznosi: " + zbir);
    }
}
