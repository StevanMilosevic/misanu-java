package zadatak1;

/* Napisati klasu koja opisuje tačke u ravni.  Predvideti postavljanje koordinata, dohvatanje koordinata,
 izračunavanja rastojanja do zadate tačke, čitanje tačke, pisanje tačke i glavnu funkciju za ispitivanje klase. */

public class Tacka {
	private double x;
	private double y;

	Tacka() {
	} // default konstruktor

	Tacka(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	// rastojanje od pocetka koordinatnog sistema - PKS
	public double rastojanjePKS() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}

	// rastojanje od druge tacke - DT
	public double rastojanjeDT(Tacka t) {
		return Math.sqrt(Math.pow(this.x - t.x, 2) + Math.pow(this.y - t.y, 2));
	}

	public String toString() {
		return "[" + this.x + ", " + this.y + "]";
	}
}
