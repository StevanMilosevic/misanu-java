package LinijskaStruktura;
import java.util.Scanner;

/* */
public class BMI {
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite visinu osobe: ");
		double visina = input.nextDouble();
		
		System.out.print("Unesite masu osobe: ");
		double masa = input.nextDouble();
		
		System.out.println("Indeks telesne mase BMI = " + masa / Math.pow(visina, 2));
		input.close();
		} 
	}