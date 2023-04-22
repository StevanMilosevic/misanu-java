package zadatak2;

// Испит садржи шифру испита од највише 6 знакова и оцену. 
// Може да се дохвати шифра испита и оцена и да се испит испише на главном излазу 
// у облику "шифра:оцена".

public class Ispit extends Ocena {
	private String sifraIspita;
	int ocena;

	Ispit(int ocena, String sifraIspita) {
		super(ocena);
		this.sifraIspita = sifraIspita;
	}

	public String getSifraIspita() {
		return this.sifraIspita;
	}

	public String getIspit() {
		return getSifraIspita() + ":" + getOcena();
	}

}