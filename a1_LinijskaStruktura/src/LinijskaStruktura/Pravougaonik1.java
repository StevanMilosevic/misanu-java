package LinijskaStruktura;

import java.util.Scanner;

// program ispituje da li je jedan uuneti pravougaonik manji od drugog

public class Pravougaonik1 {
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite stranicu a prvog pravougaonika: ");
		int a = input.nextInt();
		System.out.print("Unesite stranicu b prvog pravougaonika: ");
		int b = input.nextInt();
		System.out.print("Unesite stranicu c drugog pravougaonika: ");
		int c = input.nextInt();
		System.out.print("Unesite stranicu d drugog pravougaonika: ");
		int d = input.nextInt();
		
		boolean provera = ((a < c) && (b < d)) || ((a < d) && (b < c));
		System.out.println("provera = " + provera);     
		input.close();
		} 
	}