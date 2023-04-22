package domine;

public class Main {
	public static void main(String[] args) {
		Domina domina1 = new Domina(3, 5);
		Domina domina2 = new Domina(1, 2);

		System.out.println(domina1.toString());
		System.out.println(domina2.toString());
		System.out.println("=========");
		System.out.println(domina1.ista(domina2));
		domina1.okreni();
		domina2.okreni();
		System.out.println(domina1.toString());
		System.out.println(domina2.toString());

	}
}
