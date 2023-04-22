package paket3;

public class Main {
	public static void main(String[] args) {
		try {
			int a = 0;
			System.out.println("a = " + a);
			// int b = 10 / a;

			int[] c = { 1 };
			c[10] = 100;
		} catch (ArithmeticException e) {
			System.out.println("Deljenje nulom. ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Nepostojeci index unutar niza.");
		}
		System.out.println("Nakon try/catch bloka");
	}
}
