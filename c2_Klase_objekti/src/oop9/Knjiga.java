package oop9;

public class Knjiga {
	private String ime;
	private int brStrana;

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getIme() {
		return ime;
	}

	public void setBrojStrana(int br) {
		if (br > 0)
			brStrana = br;
		else
			System.out.println("Greska! Broj strana mora biti veci od 0");
	}

	public int getBrojStrana() {
		return brStrana;
	}

	public void stampaj() {
		System.out.println("Ime: " + getIme() + ". \nBroj stranica: " + getBrojStrana());
	}
}