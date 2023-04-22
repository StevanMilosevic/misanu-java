package zadatak2;

// Оцена садржи цео број у опсегу од 5 до 10. Вредности изван опсега приликом стварања промене се у најближу
// прихватљиву вредност. Може да се дохвати вредност оцене бројчано и словима као и да се оцена испише на
// главном излазу када се пишу оба облика оцене (на пример: 10(deset)).

public class Ocena {
	private int ocena;

	Ocena(int ocena) {
		if (ocena < 5)
			this.ocena = 5;
		if (ocena > 10)
			this.ocena = 10;
		if (ocena >= 5 && ocena <= 10)
			this.ocena = ocena;
	}

	public int getOcena() {
		return this.ocena;
	}

	public String getOpisnaOcena(int ocena) {
		switch (ocena) {
		case 5:
			return "pet";
		case 6:
			return "sest";
		case 7:
			return "sedam";
		case 8:
			return "osam";
		case 9:
			return "devet";
		case 10:
			return "deset";
		default:
			return "Greska prilikom upisa ocene";
		}
	}

}
