package LinijskaStruktura;

import java.util.Scanner;

public class Domaci1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite x ");
		int x = input.nextInt();
		
		double y = Math.sqrt(((Math.exp(x/2))-1.2*Math.sin(2*x))/((3.3*Math.cos(x)+7.1*Math.exp(x)))); 
		input.close();
		
		System.out.print("Za vrednost x = " + x + " vrednost y je =" + y); 	
		} 
	}