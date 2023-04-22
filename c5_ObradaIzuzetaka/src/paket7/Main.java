package paket7;

public class Main {
	public static void main(String[] args) {
		try {
			int a = 2; // 0 pa 1 pa 2 se stavlja vrednost, kako bi izazvali razlicite izuzetke
			int b = 10 / a;
			System.out.println("a = " + a);
			try {
				if (a == 1)
					a = a / (a - a);
				if (a == 2) {
					int c[] = { 1 };
					c[10] = 100;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				// unutrasnji catch blok
				System.out.println("Greska sa indeksom");
			}
		} catch (ArithmeticException e) {
			// spoljasni catch blok
			System.out.println("Greska prilikom deljenja");
		}
	}
}
