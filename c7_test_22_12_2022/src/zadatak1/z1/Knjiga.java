package zadatak1.z1;

public class Knjiga {
	String naslov, autor, opis;
	double cena;
	boolean stanje;

	public Knjiga(String naslov, String autor, String opis, double cena, boolean stanje) {
		this.naslov = naslov;
		this.autor = autor;
		this.opis = opis;
		this.cena = cena;
		this.stanje = stanje;
	}

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public boolean getStanje() {
		return stanje;
	}

	public void setStanje(boolean stanje) {
		this.stanje = stanje;
	}

	public String toString() {
		return "Naslov: " + naslov + "\nAutor: " + autor + "\nOpis: " + opis + "\nCena: " + cena + "\nStanje: "
				+ stanje;
	}
}
