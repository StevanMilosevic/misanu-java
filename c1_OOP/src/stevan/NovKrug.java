package stevan;

public class NovKrug {
	private double radius;

	NovKrug() {
		radius = 0.0;
	}

	NovKrug(double radius) {
		this.radius = radius;
	}

	public double area() {
		return 3.14 * radius * radius;
	}

}
