package tacka;

public class Tacka {
	private double x, y;

	Tacka() {
	}

	Tacka(double x) {
		this.x = x;
	}

	public Tacka(double x, double y) {
		this.x = x;
		this.y = y;
	}

	double rastojanjeOdKP() {
		return Math.sqrt(x * x + y * y);
	}

	double rastojanjeIzmedju(Tacka t) {
		return Math.sqrt(Math.pow(t.x - x, 2) + Math.pow(t.y - y, 2));
	}
}