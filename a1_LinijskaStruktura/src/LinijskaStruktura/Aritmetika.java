package LinijskaStruktura;

public class Aritmetika {
	static double a;
	static double b;
	static double c;
	static double rez;
	
	static double izraz1(double x, double y, double z) {
		a = x;
		b = y;
		c = z;
		rez = a * b + a * c;
		return rez;
	}
	public static void main(String[] args) {
		izraz1(3,4,2);
		System.out.println(rez);
}

}
