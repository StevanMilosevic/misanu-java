package stevan;

public class Primer1 {
	public static int kvadratBroja(int x) {
		return x * x;
	}

	public static void main(String[] args) {
		int x = 10;
		System.out.println("Kvadrat broja " + x + " je " + kvadratBroja(x));
	}
}