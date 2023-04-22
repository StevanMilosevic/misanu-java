package zadatak2.z2;

public class BankAccount {
	double racun;

	public BankAccount() {
		racun = 0.0;
	}

	public BankAccount(double racun) {
		this.racun = racun;
	}

	// dodavanje zadate sume na trenutno stanje racuna
	public void uplata(double uplata) {
		if (uplata > 0) {
			this.racun = racun + uplata;
			System.out.println("Iznos uplate: " + uplata);
		} else
			System.out.println("Ne mozete uplacivati negativne vrednosti");

	}

	// dohvatanje trenutne vrednosti na racunu
	public double getRacun() {
		return racun;
	}

	// ispisivanje odgovarajuce poruke na ekranu
	public void upitStanja() {
		System.out.println("Vase trenutno stanje iznosi: " + racun);
	}
}
