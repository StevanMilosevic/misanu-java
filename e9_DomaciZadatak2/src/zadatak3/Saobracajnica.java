package zadatak3;

// Саобраћајница има име од највише 30 знакова и дужину у метрима. Може да се дохвати име.
// Може да се упише у излазни ток (it<<saobracajnica, пише се име саобраћајнице и дужина у загради).
// Име и дужина се задају приликом стварања, али име може и накнадно да се мења.

public class Saobracajnica {
	private String ime;
	private int duzina;

	public String getIme() {
		return this.ime;
	}

	// naknadna promena imena
	public void setIme(String novoIme) {
		this.ime = novoIme;
	}

	Saobracajnica(String ime, int duzina) {
		this.ime = ime;
		this.duzina = duzina;
	}

	public String toString() {
		return this.ime + "(" + this.duzina + " m)";
	}
}
