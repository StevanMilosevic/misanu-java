package zadatak9;

// Napisati program koji prebrojava “space” simbole.

public class Main {

	public static void main(String[] args) {
		String provera = "Svakog dana u svakom pogledu sve vise i vise napredujem";

		int brojac = 0;
		char[] simboli = provera.toCharArray(); // razbijanje Stringa u niz char karaktera

		for (char c : simboli) {
			if (c == ' ') {
				brojac++;
			}
		}
		System.out.println("Space simbola u tekstu ima: " + brojac);
	}
}