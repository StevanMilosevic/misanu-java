package zadatak4;
/* Radnik u trgovačkoj firmi ima ime i kao platu dobija za dati procenat 
 * od vrednosti ostvarenog prihoda.
Može da se odredi vrednost ostvarenog prihoda, da se izračuna visina plate i da se sastavi tekstualni opis u
obliku "ime/plata". Kreirati UML diagram za zadatu klasu. */

public class Radnik {
	private String ime;
	private double procenat;
	private double prihod;

	Radnik(String ime, double procenat, double prihod) {
		this.ime = ime;
		this.procenat = procenat;
		this.prihod = prihod;
	}

	public void ostvareniPrihod(double prihod) {
		this.prihod = prihod;
	}

	public double plata() {
		return prihod * (procenat / 100);
	}

	public String opis() {
		return ime + "/" + plata();
	}

}
