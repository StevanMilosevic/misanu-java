package zadatak3;

// Улица је саобраћајница која може да садржи задат број стамбених зграда.

// Ствара се празна, капацитета одређеног задатом максималном вредношћу целобројног адресног броја,
// после чега се зграде додају појединачно, под задатим адресним бројем
// (грешка је ако под задатим адресним бројем већ постоји зграда).
// Улица не може да се копира. Може да се дохвати укупан број зграда и укупна површина свих стамбених јединица.

public class Ulica extends Saobracajnica {
	StambenaZgrada[] ulica;

	Ulica(String ime, int duzina, int adresniBroj) {
		super(ime, duzina);
		ulica = new StambenaZgrada[(adresniBroj + 1)];
	}

	public void dodajZgradu(int broj, StambenaZgrada obj) {
		if (ulica[broj] != null) {
			System.out.println("Pod tim adresnim brojem je vec upisana zgrada!");
		} else {
			ulica[broj] = obj;
		}
	}

	// ukupan broj zgrada
	public int ukupanBrojZgrada() {
		int brojac = 0;
		for (int i = 1; i < ulica.length; i++) {
			if (ulica[i] != null)
				brojac++;
		}
		return brojac;
	}

	// ukupna povrsina svih stambenih jedinica
	public double povrsinaSvihStanova() {
		double povrsina = 0;
		for (int i = 1; i < ulica.length; i++) {
			if (ulica[i] != null) {
				povrsina += ulica[i].getProsecnaPovrsinaStana() * ulica[i].getUkupanBrojStanova();
			}
		}
		return povrsina;
	}
}
