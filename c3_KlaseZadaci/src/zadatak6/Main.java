package zadatak6;

public class Main {
	public static void main(String[] args) {
		Matrice m1 = new Matrice(5, 5);
		System.out.println("Matrica ima " + m1.vrs() + " vrsta ");
		System.out.println("Broj kolona iznosi " + m1.kol() + " kolona ");

		System.out.println(m1.postavi(1, 2, 3));
		System.out.println("Vrednost: " + m1.dohvati(1, 2));
		System.out.println(m1.postavi(1, 2, 3));

	}
}