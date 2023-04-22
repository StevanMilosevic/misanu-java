package UUP;

public class Primer12 {
	public static void main(String[] args) {
		int[] niz = { 25, 31, 12, -7, 14, 24, 121, -35, 42, 15 };
		int[] niz2 = new int[100];
		int[] niz5 = new int[100];
		int n2 = 0, n5 = 0;

		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % 2 == 0) {
				n2++;
				niz2[n2] = niz[i];
			}
			if (niz[i] % 5 == 0) {
				n5++;
				niz5[n5] = niz[i];
			}
		}
		System.out.println("Zadati niz brojeva: ");
		for (int i = 0; i < 10; i++)
			System.out.print(niz[i] + " ");

		System.out.println("\nNiz brojeva deljivih sa 2: ");
		for (int i = 1; i <= n2; i++)
			System.out.print(niz2[i] + " ");

		System.out.println("\nNiz brojeva deljivih sa 5: ");
		for (int i = 1; i <= n5; i++)
			System.out.print(niz5[i] + " ");
	}
}
