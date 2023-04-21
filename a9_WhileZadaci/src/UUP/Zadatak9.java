package UUP;

// proba, while radi kao rekurzija?

public class Zadatak9 {
	public static void main(String[] args) {
		double eps = 1.0E-6;
		double x = 1.2;
		double y = 3.4;

		double x1 = 0.5 * Math.sqrt(x * (3 * y - 1) + 1);
		double y1 = Math.sqrt((x + 3) / 2);
		int i = 1;
		while (Math.abs(x1 - x) > eps || Math.abs(y1 - y) > eps) {
			x = x1;
			x1 = 0.5 * Math.sqrt(x * (3 * y - 1) + 1);
			y = y1;
			y1 = Math.sqrt((x + 3) / 2);
			System.out.println(i + " iteracija");
			i++;
		}
		System.out.println("resenje sistema jednacina su x= " + x1);
		System.out.println("resenje sistema jednacina su y= " + y1);

	}
}
