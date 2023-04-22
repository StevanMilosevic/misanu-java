package oop5;

public class Main {
	public static void main(String[] args) {
		Box b1 = new Box(); // u trenutku kreiranja pozvace se PODRAZUMEVANI konstruktor
		Box b2 = new Box();

		b1.initBox(10, 15, 20);
		b2.initBox(5, 6, 7);

		System.out.println(b1.volume());
		System.out.println(b2.volume());
	}
}
