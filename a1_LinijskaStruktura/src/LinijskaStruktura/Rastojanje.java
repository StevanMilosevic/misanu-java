package LinijskaStruktura;

import java.util.Scanner;

/* Učitati koordinate dve tačke M1(x1,y1) i M2(x2, y2) i izračunati pojedinačnu udaljenost tačaka 
 * od koordinatnog početka 
 * 	Udaljenost tačke od koordinatnog početka je po Pitagori kvadratni koren sume kvadrata veličina kateta. 
 * Za tačku M1(x1, y1) udaljenost od koordinatnog početka je hipotenuza a12 = x12 + y12 odnosno kvadratni koren iz sume kvadrata. Na isti način se računa i udaljenost tačke M2(x2, y2), hipotenuza a22 = x22 + y22 odnosno kvadratni koren iz sume kvadrata kateta.
 * */

public class Rastojanje {
	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		System.out.println("Unesite koordinate prve tačke: ");
		double x1= input.nextDouble();
		double y1= input.nextDouble();
		double a1= Math.sqrt(x1 * x1 + y1 * y1);
		
		System.out.println("Unesite koordinate druge tačke: ");
		double x2= input.nextDouble();
		double y2= input.nextDouble();
		double a2= Math.sqrt(x2 * x2 + y2 * y2);
		
		System.out.println("Rastojanje prve tačke("+ x1+ ","+ y1+ ") od koordinatnog početka je "+ a1);
		System.out.println("Rastojanje druge tačke("+ x2+ ","+ y2+ ") od koordinatnog početka je "+ a2);
		input.close();
	}
}