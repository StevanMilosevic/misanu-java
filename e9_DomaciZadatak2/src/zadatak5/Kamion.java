package zadatak5;

// Камион је возило задате сопствене тежине и носивости.
// Ствара се без товара после чега може да се дода товар задате тежине и да се скине товар задате тежине.
// Грешка је ако се камион претовари. Скидањем превише товара тежина товара постане једнака нули.
// У излазни ток се пише и тренутна тежина товара на камиону.

public class Kamion extends Vozilo {
	double tovar, nosivost;
	String naziv;

	Kamion(String naziv, double tezina, double nosivost) {
		super(tezina);
		this.naziv = naziv;
		this.nosivost = nosivost;
		this.tovar = 0;
	}

	public double getTezina() {
		return super.getTezina() + this.tovar;
	}

	public String getNaziv() {
		return "Kamion";
	}

	public Kamion dodajTovar(double tovar) {
		this.tovar += tovar;
		if (tovar > nosivost) {
			tovar = nosivost; // skidamo visak tovara preko nosivosti
		}
		return this;
	}

	public Kamion skiniTovar(double tovar) {
		this.tovar -= tovar;
		if (tovar < 0) {
			tovar = 0;
		}
		return this;
	}

	@Override
	public String opis() {
		return super.opis() + "\nTovar na kamionu je: " + this.tovar;
	}
}