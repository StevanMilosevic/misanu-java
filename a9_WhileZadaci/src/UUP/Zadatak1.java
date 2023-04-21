package UUP;// Napisati program kojim se štampaju prvih deset prirodnih brojeva korišćenjem for i while petlje.

public class Zadatak1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++)
			System.out.print(i + " ");

		System.out.println();
		int n = 1;
		while (n <= 10) {
			System.out.print(n + " ");
			n++;
		}
	}
}
