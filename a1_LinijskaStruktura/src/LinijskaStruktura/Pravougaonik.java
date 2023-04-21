package LinijskaStruktura;
import java.util.Scanner;
    
/* Pravougaonik by Stevan Milosevic 
 * Napisati program kojim se izračunava dijagonala pravougaonika 
 * za unete stranice pravougaonika a i b.  */

public class Pravougaonik{
	public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Unesite vrednost stranice pravougaonika a: ");
        double a= input.nextDouble();
        
        System.out.println("Unesite vrednost stranice pravougaonika b: ");
        double b= input.nextDouble();
        input.close();
        
        System.out.println("Dijagonala pravougaonika je: "+ Math.sqrt(a* a+ b* b));
   }
}