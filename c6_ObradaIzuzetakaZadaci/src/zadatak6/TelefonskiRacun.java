package zadatak6;

public class TelefonskiRacun {
	private String brojTelefona;
	private String vlasnik;
	private double dugovanje;

	public String getBrojTelefona() {
		return brojTelefona;
	}

	public void setBrojTelefona(String brojTelefona) throws IzuzetakTelefonskiRacun {
		if (brojTelefona.isEmpty() || brojTelefona.isBlank())
			throw new IzuzetakTelefonskiRacun("Broj telefona ne sme biti null");

		this.brojTelefona = brojTelefona;
	}

	public String getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(String vlasnik) {
		if (vlasnik.isEmpty() || vlasnik.isBlank())
			throw new IzuzetakTelefonskiRacun("Naziv vlasnika ne sme biti null");

		this.vlasnik = vlasnik;
	}

	public double getDugovanje() {
		return dugovanje;
	}

	public void setDugovanje(double dugovanje) {
		if (dugovanje < 0)
			throw new IzuzetakTelefonskiRacun("Iznos dugovanja mora biti veci od 0");

		this.dugovanje = dugovanje;
	}

	public String toString() {
		return "Broj telefona: " + brojTelefona + "\nVlasnik: " + vlasnik + "\nDugovanje: " + dugovanje;
	}
}
