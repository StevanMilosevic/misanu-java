package zadatak8;

public class Student {
	String imePrezime;
	int brojIndeksa;
	double prosecnaOcena;

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public double getProsecnaOcena() {
		return prosecnaOcena;
	}

	public void setProsecnaOcena(double prosecnaOcena) {
		if (prosecnaOcena >= 6.0 && prosecnaOcena <= 10.0)
			this.prosecnaOcena = prosecnaOcena;
	}
}
