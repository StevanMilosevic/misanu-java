package primer8;

public class Main {

	public static void main(String[] args) {

		char[] ch = { 'J', 'A', 'V', 'A' };
		String s1 = new String(ch);

		byte[] b = { 71, 65, 89, 80, 79, 82, 78 }; // ASCII code za slova
		String s2 = new String(b);

		System.out.println("String = " + s1);
		System.out.println("String = " + s2);

	}

}
