package zadatak2;

public class Sfera extends Predmet {
	protected double poluprecnik;
	protected double V;

	public Sfera() {
		super();
		vrstaPredmeta = 'S';
		this.poluprecnik = 1;
	}

	public Sfera(double specTezina, char vrstaPredmeta, double poluprecnik) {
		super(specTezina, vrstaPredmeta);
		this.poluprecnik = poluprecnik;
	}

	public double getPoluprecnik() {
		return poluprecnik;
	}

	public void setPoluprecnik(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}

	public double zapremina(double r) {
		return 1.33 * (r * r * r * Math.PI);
	}

	public double tezina(double specTezina, double r) {
		masa = this.zapremina(r) * specTezina;
		return masa * GRAVITACIJA;
	}

}
