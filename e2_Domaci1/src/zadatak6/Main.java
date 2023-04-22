package zadatak6;

public class Main {
	public static void main(String[] args) {
		String[] opis = { "Nedovoljan", "Dovoljan", "Dobar", "Vrlo dobar", "Odlican" };
		Integer[] ocena = { 1, 2, 3, 4, 5 };

		OpisnaOcena<Integer, String> obj = new OpisnaOcena<>();

		for (int i = 0; i < ocena.length; i++) {
			obj.setObj1(i + 1);
			obj.setObj2(opis[i]);
			obj.ispis();
		}
	}
}