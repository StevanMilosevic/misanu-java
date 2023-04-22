package oop8;

public class Main {
	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box(10);
		Box b3 = new Box(10, 15, 20);
		Box b4 = new Box(b2);

		System.out.println("Zapremina je: " + b1.volume());
		System.out.println("Zapremina je: " + b2.volume());
		System.out.println("Zapremina je: " + b3.volume());
		System.out.println("Zapremina je: " + b4.volume());

		// klasa knjiga - ime i br strana
		// omoguciti ucitavanje ime knjige i br strana
		// te podatke ucitavati sa ulaza (scanner)
		// profa napisao: Kreirati klasu Knjiga. Knjia ima podatke: Ime, brojStrana
		// napraviti razlicite kontruktore za poziv i ispisivanje

	}
}
