package DZ1_3zadatak_StevanMilosevic;

public class Main {
	public static void main(String[] args) {
		Polica polica = new Polica(5, 120);

		Predmet p1 = new Predmet("Knjiga", 1);
		Predmet p2 = new Predmet("Cekic", 3);
		Predmet p3 = new Predmet("Tanjir", 2);

		polica.staviPredmet(0, p1);
		polica.staviPredmet(1, p2);
		polica.staviPredmet(2, p3);

		polica.daLiJePrazno(4);
		polica.pristupPredmetu(2);
		polica.sklanjanjePredmeta(2);

		polica.stanjePolice();

	}
}
