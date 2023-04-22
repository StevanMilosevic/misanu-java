package oop1;

public class Main {
	public static void main(String[] args) {

		ABC a = new ABC();
		XYZ x = new XYZ();

		if (a instanceof ABC)
			System.out.println("a je objekat klase ABC");
		else
			System.out.println("a nije objekat klase ABC");

		if (x instanceof XYZ)
			System.out.println("x je objekat klase XYZ");
		else
			System.out.println("x nije objekat klase XYZ");
	}
}
