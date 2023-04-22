package paket9;

public class Main {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		double r, a;
		System.out.println("Unesite poluprecnik: ");
		r = input.nextDouble();
		a = 3.14 * r * r;
		System.out.println("Povrsina kruga je: " + a);
		
		input.close();

	}

}
