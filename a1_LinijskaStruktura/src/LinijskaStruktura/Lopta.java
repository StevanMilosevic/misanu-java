package LinijskaStruktura;
import java.util.Scanner;

/* Program koji izračunava površinu i zapreminu lopte na osnovu unetog poluprečnika.  */

public class Lopta {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite vrednost poluprecnika: ");
			
		double r = input.nextDouble();
		
		if(r <= 0) {
			System.out.println("poluprecnik mora biti veci od 0!");
		} else {
			double P = Math.pow(r , 2) * Math.PI * 4;
			double V = Math.pow(r, 3) * Math.PI * 4.0 / 3;
		
			System.out.println("Površina lopte je: " + P);
			System.out.println("Zapremina lopte je: " + V);
		}
		input.close();
	}
}