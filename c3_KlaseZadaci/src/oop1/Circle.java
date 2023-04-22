package oop1;

public class Circle {
	private double radius;

	Circle() {
		radius = 0.0;
	}

	Circle(double radius) {
		this.radius = radius;
	}

	// proslednjivanje objekta kao argumenta
	Circle(Circle ob) {
		radius = ob.radius;
	}

	public double area() {
		return 3.14 * radius * radius;
	}

}
