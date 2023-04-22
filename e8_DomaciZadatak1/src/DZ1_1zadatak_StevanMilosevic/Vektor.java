package DZ1_1zadatak_StevanMilosevic;

/* Napisati klasu vektora realnih brojeva sa zadatim opsezima indeksa i tom prilikom predvideti:
- stvaranje vektora s opsegom indeksa od zadate donje do zadate gornje granice, od 1 do zadate gornje
granice i od 1 do 10.
- postavljanje I dohvatanje vrednosti komponente sa zadatim indeksom,
- izračunavanje skalarnog proizvoda dva vektora
- dohvatanje graničnih vrednosti indeksa.
U main klasi ispitati kreirane klase. */

public class Vektor {
	int n;
	double[] niz;

	Vektor(int n) {
		if (n < 0 || n > 10) {
			throw new IllegalArgumentException("Pogresna vrednost:  " + n);
		}
		niz = new double[n];
	}

	// postavljanje I dohvatanje vrednosti komponente sa zadatim indeksom
	public void postaviElement(int i, double x) {
		this.niz[i] = x;
	}

	public double dohvatiElement(int j) {
		return niz[j];
	}

	// izračunavanje skalarnog proizvoda dva vektora
	public double proizvod(double[] niz1) {
		double proizvod = 0;
		for (int i = 0; i < niz1.length; i++) {
			proizvod += this.niz[i] * niz1[i];
		}
		return proizvod;
	}

	// dohvatanje graničnih vrednosti indeksa
	public int dohvatanjeIndeksa() {
		return niz.length;
	}
}
