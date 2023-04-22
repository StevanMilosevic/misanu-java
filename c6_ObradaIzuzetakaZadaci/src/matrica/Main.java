package matrica;

public class Main {
	public static void main(String[] args) {
		Matrica m1 = new Matrica(4, 5);
		System.out.println(m1.getRed());
		System.out.println(m1.getKolona());
		m1.postaviElement(1, 2, 3);
		m1.stampanjeMatrice();
	}
}
