package zadatak5;

public class Domine {
	private int a;
	private int b;

	Domine(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public Domine zamena() {
		int x = a;
		a = b;
		b = x;
		return this;
	}

	public boolean provera(Domine ob) {
		return a == ob.a && b == ob.b || b == ob.a && a == ob.b;
	}

	public String opis() {
		return "(" + a + ", " + b + ")";
	}
}
/*
 * PROFINO RESENJE
 * 
 * public class Domine { private int a, b;
 * 
 * Domine(int aa, int bb) { a = aa; b = bb; } public int getA() { return a; }
 * public int getB() { return b; } public Domine okreni() { int p = a; a = b; b
 * = p; return this; } public boolean ista(Domine d) { return a == d.a && b ==
 * d.b || b == d.a && a == d.b; } public String tekstualniOpis() {
 * 
 *
 * return "(" + a + ", " + b + ")"; }
 */
