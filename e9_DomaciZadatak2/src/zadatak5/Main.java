package zadatak5;

// Саставити на језику JAVA програм који направи тркачки ауто са две вожње које садрже по три етапе,
// испише ауто на главном излазу и за вожњу с највећом средњом брзином испише дужину, трајaње и средњу брзину.

public class Main {
	public static void main(String[] args) {
		Etapa etapa1 = new Etapa(1200, 50);
		Etapa etapa2 = new Etapa(850, 65);
		Etapa etapa3 = new Etapa(2100, 70);

		Voznja voznja = new Voznja();

		voznja.dodajEtapu(etapa1);
		voznja.dodajEtapu(etapa2);
		voznja.dodajEtapu(etapa3);

		TrkackiAuto auto = new TrkackiAuto(1200);
		auto.dodajVoznju(voznja);

		System.out.println("Srednja brzina je: " + auto.srednjaBrzina());

	}
}