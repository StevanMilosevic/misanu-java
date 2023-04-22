package zadatak5;

public class Main {

	public static void main(String[] args) {
		Domine domina = new Domine(5, 6);
		Domine domina1 = new Domine(4, 6);

		System.out.println("Provera: " + domina.provera(domina1));
		System.out.println("Opis: " + domina.opis());
		System.out.println(domina.zamena());
		System.out.println("Opis nakon zamene: " + domina.opis());

	}

}
