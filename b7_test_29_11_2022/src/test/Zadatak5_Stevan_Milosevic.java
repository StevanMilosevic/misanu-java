package test;

import java.io.*;

public class Zadatak5_Stevan_Milosevic {
	final static double K = 9 * Math.pow(10, 9);

	public static double sila(double q1, double q2, double r) {
		return K * q1 * q2 / (r * r);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Naelektrisanje cestice q1: ");
		double q1 = Double.parseDouble(input.readLine());

		System.out.print("Naelektrisanje cestice q2: ");
		double q2 = Double.parseDouble(input.readLine());

		System.out.print("Rastojanje: ");
		double r = Double.parseDouble(input.readLine());

		System.out.println("Sila F je: " + sila(q1, q2, r));
	}
}