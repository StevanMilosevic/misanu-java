package primer8;

public class TestUredjaj {
	public static void main(String[] args) {
		Uredjaj u = new Uredjaj("Samsung", true);
		MasinaZaVes k = new MasinaZaVes("Gorenje", false, 2, 30);
		u.iskljuci();
		// Štampanje podataka o uredjaju
		System.out.println("Podaci o uredjaju: ");
		u.ispisi();
		k.ukljuci();
		k.promeniProgramNavise();
		// Štampanje podataka o mašini za veš
		System.out.println("\nPodaci o mašini za veš: ");
		k.ispisi();
	}
}
