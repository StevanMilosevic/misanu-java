package oop3;

public class Main {
	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box();

		double vol;

		b1.width = 10;
		b1.height = 15;
		b1.depth = 20;

		b2.width = 6;
		b2.height = 7;
		b2.depth = 5;

		vol = b1.width * b1.height * b1.depth;
		System.out.println("Zapremina prvog objekta je: " + vol);

		vol = b2.width * b2.height * b2.depth;
		System.out.println("Zapremina drugog objekta je: " + vol);
	}
}
