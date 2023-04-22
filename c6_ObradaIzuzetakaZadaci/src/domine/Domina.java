package domine;

public class Domina {
	private double a;
	private double b;

	Domina(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public boolean ista(Domina d) {
		return a == d.a && b == d.b || a == d.b && b == d.a;
	}

	public Domina okreni() {
		double x = a;
		a = b;
		b = x;
		return this;
	}

	public String toString() {
		return "[" + a + ", " + b + "]";
	}
}
