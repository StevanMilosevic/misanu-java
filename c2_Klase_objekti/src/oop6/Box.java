package oop6;

public class Box {
	private double width;
	private double height;
	private double depth;

	Box() {
		width = 10;
		height = 10;
		depth = 10;
	}

	double volume() {
		return width * height * depth;
	}
}
