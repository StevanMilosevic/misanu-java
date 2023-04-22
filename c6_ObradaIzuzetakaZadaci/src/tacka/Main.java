package tacka;

public class Main {
	public static void main(String[] args) {
		Tacka t1 = new Tacka();
		Tacka t2 = new Tacka(5);
		Tacka t3 = new Tacka(2, 2);

		System.out.println("Rastojanje od koordinatnog pocetka tacke t1: " + t1.rastojanjeOdKP());
		System.out.println("Rastojanje od koordinatnog pocetka tacke t1: " + t2.rastojanjeOdKP());
		System.out.println("Rastojanje od koordinatnog pocetka tacke t1: " + t3.rastojanjeOdKP());

		System.out.println();

		System.out.println("Rastojanje tacke t1 od tacke t2: " + t1.rastojanjeIzmedju(t2));
		System.out.println("Rastojanje tacke t2 od tacke t3: " + t2.rastojanjeIzmedju(t3));
		System.out.println("Rastojanje tacke t3 od tacke t1: " + t3.rastojanjeIzmedju(t1));

	}
}
