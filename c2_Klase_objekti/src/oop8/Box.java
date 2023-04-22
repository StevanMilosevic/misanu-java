package oop8;

public class Box {
	private double width;
	private double height;
	private double depth;

	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}

	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	Box(double len) {
		width = height = depth = len;
	}

	Box(Box b) {
		width = b.width;
		height = b.height;
		depth = b.depth;
	}

	double volume() {
		return width * height * depth;
	}
}
