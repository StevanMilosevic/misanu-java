package zadatak5;

// Ispisati sve delioce broja 10 -> 1,2,5,10

public class Main {

	public static void funkc(int a) {
		int suma = 0;
		System.out.println("broj je: " + a + "\nnjegovi delioci su: ");
		for (int i = 1; i < (a + 1); i++) {
			if (a % i == 0) {
				System.out.print(i + " ");
				suma += i;
			}
		}
		System.out.println("\nSuma brojeva: " + suma);
	}

	public static void main(String[] args) {
		int x = 13;
		funkc(x);
	}
}
