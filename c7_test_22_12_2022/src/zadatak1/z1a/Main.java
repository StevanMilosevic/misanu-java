package zadatak1.z1a;

import zadatak1.z1.Knjiga;

public class Main {
	public static void main(String[] args) {
		Knjiga knjiga = new Knjiga("Na Drini cuprija", "Ivo Andric",
				"Roman pripoveda o gradjenju mosta preko Drine u bosanskom mestu Visegrad", 1100.0, true);
		System.out.println(knjiga.toString());

		// postavljanje nove cene i stanja i stampanje novih rezultata
		knjiga.setCena(950.0);
		knjiga.setStanje(false);
		System.out.println(knjiga.toString());

	}
}
