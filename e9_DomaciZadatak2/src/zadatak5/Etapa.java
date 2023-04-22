package zadatak5;

// Етапа вожње се задаје помоћу реалне дужине и брзине. На једној етапи се не мења брзина.
// Могу да се дохвате атрибути етапе и да се израчуна време кретања у етапи.
// Вожња садржи низ етапа задатог капацитета (подразумевано 10).
// Ствара се празна после чега се етапе додају једна по једна. Ако се низ препуни, програм се прекида.
// Може да се одреди укупна дужина вожње, укупно трајање и средња брзина кретања у току вожње.

public class Etapa {
	double duzina, brzina;

	Etapa() {
		this.duzina = 0;
		this.brzina = 0;
	}

	Etapa(double duzina, double brzina) {
		this.duzina = duzina;
		this.brzina = brzina;
	}

	public double getDuzina() {
		return this.duzina;
	}

	public double getBrzina() {
		return this.brzina;
	}

	public double getVreme() {
		return this.duzina / this.brzina;
	}
}
