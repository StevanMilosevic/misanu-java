package primer5;

/* Nabrajanje je vrsta klase, nema sve osobine klase
 * Instanca se ne pravi pomocu kljucne reci NEW. Rezervisana rec ENUM definise klasu
 * Svaka konstanta definisana u nabrajanju je zapravo objekat ciji tip je to isto nabrajanje.  */

public class Main {
	public static void main(String[] args) {
		Boja b;

		System.out.println("Udeo zelene boje: " + Boja.Zelena.getUdeo());

		System.out.println("Sve boje: ");
		for (Boja c : Boja.values())
			System.out.println(c + " -> " + c.getUdeo());
	}
}
