package zadatak1;

public class Main {

	public static void main(String[] args) {
		Tacka t1 = new Tacka(2.7, 1.9);
		Tacka t2 = new Tacka(3.3, 1.5);

		System.out.println("Tacka 1: " + t1.toString());
		System.out.println("Tacka 2: " + t2.toString());
		System.out.println("Rastojanje izmedju tacke 2 od pocetka koordinatnog sistema: " + t2.rastojanjePKS());
		System.out.println("Rastojanje izmedju tacke 1 od tacke 2: " + t1.rastojanjeDT(t2));

	}

}
