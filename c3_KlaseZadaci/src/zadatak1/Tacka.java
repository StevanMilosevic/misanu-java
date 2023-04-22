package zadatak1;

public class Tacka {
	private double x;
	private double y;

	Tacka(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public String ispisi() {
		return "(" + x + "," + y + ")";
	}
}
