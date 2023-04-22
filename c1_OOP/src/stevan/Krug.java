package stevan;

public class Krug {

	private double radius;

	Krug(double rad) { // konstruktor klase inicijalizuje jedan podatak
		radius = rad;
	}

	public double area() {
		return 3.14 * radius * radius;
	}

}
