package zadatak3;

// Стамбена зграда има површину основе изражену у m2, број спратова и број стамбених јединица по спрату
// који се задају при стварању зграде. Може да се дохвати површина основе, број спратова,
// број стамбених јединица по спрату, укупан број стамбених јединица и просечна површина стамбене јединице.
// Може да се упише у излазни ток (it<<zgrada, пише се површина/број_спратова/број_стамбених_јединица).

public class StambenaZgrada {
	private double povrsinaOsnove;
	private int brojSpratova;
	int brojStanovaPoSpratu;
	final double ZP = 0.15; // deo zgrade koji otpada na zajednicki prostor (stepeniste i hodnik)
	// proizvoljno sam odredio ovo na 15% od svake zgrade, 85% su stanovi

	StambenaZgrada(double povrsinaOsnove, int brojSpratova, int brojStanova) {
		this.povrsinaOsnove = povrsinaOsnove;
		this.brojSpratova = brojSpratova;
		this.brojStanovaPoSpratu = brojStanova;
	}

	public double getPovrsinaOsnove() {
		return this.povrsinaOsnove;
	}

	public int getBrojSpratova() {
		return this.brojSpratova;
	}

	public int getBrojStanovaPoSpratu() {
		return this.brojStanovaPoSpratu;
	}

	// ukupan broj stambenih jedinica
	public int getUkupanBrojStanova() {
		int rez = this.brojStanovaPoSpratu * this.brojSpratova;
		return rez;
	}

	// prosecna povrsina stambene jedinice, ukalkulisao sam da jedan deo zgrade
	// otpada na zajednicke prostorije (15%)
	public double getProsecnaPovrsinaStana() {
		double stan, rez;
		rez = this.getPovrsinaOsnove() * ZP;
		stan = (this.getPovrsinaOsnove() - rez) / this.brojStanovaPoSpratu;
		return stan;
	}

	public double getUkupnaPovrsina() {
		double up;
		up = this.povrsinaOsnove * this.brojSpratova;
		return up;
	}

	// површина/број_спратова/број_стамбених_јединица)
	public String toString() {
		return this.getUkupnaPovrsina() + " kvadrata / " + this.getBrojSpratova() + " spratova / "
				+ this.getUkupanBrojStanova() + " stanova u zgradi";
	}
}
