package DZ1_2zadatak_StevanMilosevic;

public class VerizniRazlomak {
	// zadati red sam shvatio da je broj elemenata niza
	static double verizni(int brojilac[], int zadatiRed) {
		double imenilac = brojilac[0];
		double rezultat = 0;

		// zakomentarisan kod je zbog pracenja sta se desava u petlji i sa imeniocem
		// System.out.println("1. korak: " + brojilac[0] + " / (1 / " + imenilac + ")");

		for (int i = 1; i < zadatiRed; i++) {
			// System.out.println((i + 1) + ". korak: " + brojilac[(i)] + " / (1 / " +
			// imenilac + ")");

			imenilac = brojilac[i] + (1 / imenilac);
			rezultat = brojilac[i] + (1 / imenilac);
		}
		return rezultat;
	}
// svaki razlomak se predstavlja kao: BROJILAC / IMENILAC, kod veriznog razlomka mozemo da imamo:
// BROJILAC / BROJILAC + IMENILAC (gde je IMENILAC takodje razlomak), zato je IMENILAC tipa double
// i tu sam udario u problem, sa vrtenjem elemenata niza BROJIOCA, zatim je tu problem ako je 0 element niza...
// zato sam se zadrzao na osnovnoj postavci koje smo sreli na predavanjima: 
// BROJILAC / 1 + IMENILAC (gde je imenilac razlomak)
// s tim sto IMENILAC je u stvari 1 + IMENILAC (radi lakseg pracenja sta se desava ostavio sam naziv promenljive IMENILAC)

	public static void main(String[] args) {
		int[] brojilac = { 4, 3, 9, 1, 2 };
		double rezultat = verizni(brojilac, brojilac.length);
		System.out.println("Rezultat je: " + rezultat);
	}
}