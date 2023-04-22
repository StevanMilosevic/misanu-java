package primer1;

//1. Prvo se implementira interfejs tipa prema kome se vrsi prilagodjavanje
// To je interfejs koji klijent ocekuje

public class CurkaAdapter implements Patka {
	Curka curka;

	// 2. korak u implementaciji interfejsa:
	// Dobiti referencu na objekat koji prilagodjavamo

	public CurkaAdapter(Curka curka) {
		this.curka = curka;
	}

	// 3. implementacija metoda u interfejsu

	// Prevodjenje metode kvace() u metodu curlice() izmedju klasa
	public void kvace() {
		curka.curlice();
	}

	public void leti() {
		for (int i = 0; i < 5; i++) {
			curka.leti();
		}
	}
}
