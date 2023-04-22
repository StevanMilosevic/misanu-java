package zadatak3;
/* Valjak se zadaje poluprečnikom i visinom. Napisati klasu Valjak i predvideti:
- stvaranje valjka zadatog poluprečnika i visine,
- dohvatanje poluprečnika i visine,
- izračunavanje zapremine,
- izračunavanje površine valjka,
- sastavljanje tekstualnog opisa valjka.
Kreirati UML diagram za zadatu klasu */

public class Valjak {
	private double poluprecnik;
	private double visina;

	Valjak(double p, double v) {
		poluprecnik = p;
		visina = v;
	}

	Valjak() {
		poluprecnik = 1.0;
		visina = 1.0;
	}

	public double getPoluprecnik() {
		return poluprecnik;
	}

	public double getVisina() {
		return visina;
	}

	public double zapremina() {
		return 3.14 * poluprecnik * poluprecnik * visina;
	}

	public double povrsina() {
		return 2 * poluprecnik * 3.14 * (poluprecnik + visina);
	}

	public String opis() {
		return "Poluprecnik valjka je: " + poluprecnik + "\nVisina valjka je: " + visina;
	}

}
