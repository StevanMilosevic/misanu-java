package DZ1_5zadatak_StevanMilosevic;

public class Okrug extends Oblast {
	public String naziv;
	char vrsta;
	int brStanovnika;
	double povrsina;
	int brojOpstina;
	private Niz<Opstina> opstine;

	Okrug(String naziv, int brojOpstina) {
		this.naziv = naziv;
		this.vrsta = 'K';
		this.brojOpstina = brojOpstina;
		opstine = new Niz<>(brojOpstina);
	}

	public String getNaziv() {
		return this.naziv;
	}

	public char getVrsta() {
		return vrsta;
	}

	public void postaviOpstine(int i, Opstina obj) {
		opstine.set(i, obj);
	}

	public int getBrStanovnika() {
		int zbir = 0;
		for (int i = 0; i < brojOpstina; i++) {
			Opstina opstina = opstine.get(i);
			zbir += opstina.getBrStanovnika();
		}
		return zbir;
	}

	public int getPovrsina() {
		int zbir = 0;
		for (int i = 0; i < this.brojOpstina; i++) {
			zbir += opstine.get(i).getPovrsina();
		}
		return zbir;
	}

	public void opis() {
		System.out.print(
				this.getNaziv() + ":" + this.getVrsta() + ":" + this.getBrStanovnika() + ":" + this.getPovrsina());
		System.out.print("[ ");
		for (int i = 0; i < brojOpstina; i++) {
			Opstina opstina = opstine.get(i);
			System.out.print(opstina.getNaziv() + " ");
		}
		System.out.print("]");
	}
}
