package LinijskaStruktura;

import java.util.Scanner;

/* Učitati koordinate dve tačke M1(x1,y1) i M2(x2, y2) i izračunati njihovu međusobnu udaljenost. 
 * Posmatra se trougao koji formiraju tačke M1(x1,y1), hipotenuza je duž između ovih tačaka. 
 * Katete su Δx = x2- x1, druga kateta trougla je Δy = y2- y1. 
 * Na osnovu Pitagorine teoreme hipotenuza se računa: hipotenuza
	d2 = (x2- x1)2 + (y2- y1)2 odnosno kvadratni koren iz sume kvadrata. */

public class DveTacke{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Unesite koordinate tačke M: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Tacka x1 je: " + x1 + " , tacka y1 je: " + y1);
		
		System.out.println("Unesite koordinate tačke N: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		
		System.out.println("Rastojanje između tačaka M ("+ x1+ ","+ y1+ ") iN ("+ x2+ ","+ y2+ ") je "+ d);
		input.close();
	}
}