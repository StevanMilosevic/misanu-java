package paket4;

public class Main {
	public static void main(String[] args) {
		try {
			int a = 0;
			System.out.println("a = " + a);

			int b = 10 / a;

			int[] c = { 1 };
			c[10] = 100;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Uhvacen exception. " + e); // e.getMessage() a moze i e.getLocalizedMessage()
		}
		System.out.println("Nakon try/catch bloka.");
	}
}
