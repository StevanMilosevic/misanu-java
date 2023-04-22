package zadatak2;

public class Kvadar extends Predmet {
	protected double a, b, c;

	public Kvadar() {
		super();
		vrstaPredmeta = 'K';
		this.a = this.b = this.c = 1;
	}

	public Kvadar(double specTezina, char vrstaPredmeta, double a, double b, double c) {
		super(specTezina, vrstaPredmeta);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double zapremina(double a, double b, double c) {
		return a * b * c;
	}

	public double tezina(double specTezina, double a, double b, double c) {
		masa = this.zapremina(a, b, c) * specTezina;
		return masa * GRAVITACIJA;
	}

}
