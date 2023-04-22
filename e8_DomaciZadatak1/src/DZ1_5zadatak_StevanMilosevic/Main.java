package DZ1_5zadatak_StevanMilosevic;

public class Main {

	public static void main(String[] args) {
		Okrug kolubarskiOkrug = new Okrug("Kolubarski okrug", 2);
		Opstina valjevo = new Opstina("Valjevo", 905, 2);
		Opstina ub = new Opstina("Ub", 456, 2);

		Naselje naselje1 = new Naselje("Valjevo", 58932);
		Naselje naselje2 = new Naselje("Mionica", 1620);

		Naselje naselje3 = new Naselje("Ub", 6018);
		Naselje naselje4 = new Naselje("Ljig", 3226);

		// u opstinu Valjevo smestamo dva naselja
		valjevo.postaviNaselje(0, naselje1);
		valjevo.postaviNaselje(1, naselje2);
		// u opstinu Ub smestamo dva naselja
		ub.postaviNaselje(0, naselje3);
		ub.postaviNaselje(1, naselje4);

		// u okrug postavljamo dve opstine
		kolubarskiOkrug.postaviOpstine(0, valjevo);
		kolubarskiOkrug.postaviOpstine(1, ub);

		System.out.println("Ukupna povrsina okruga: " + kolubarskiOkrug.getPovrsina() + " km2");

		System.out.println("Ukupna broj stanovnika okruga: " + kolubarskiOkrug.getBrStanovnika());

		kolubarskiOkrug.opis();
	}
}