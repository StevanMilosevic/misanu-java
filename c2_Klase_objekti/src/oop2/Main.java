package oop2;

public class Main {
	public static void main(String[] args) {
		Box box = new Box();
		double zapremina;

		box.sirina = 10;
		box.visina = 15;
		box.dubina = 20;

		zapremina = box.sirina * box.visina * box.dubina;

		System.out.println("Zapremina kutije je: " + zapremina);
	}
}
