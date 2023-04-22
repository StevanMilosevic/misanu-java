package zadatak5;

public class Main {

	public static void main(String[] args) {

		A<Integer, String> obj = new A<Integer, String>(100, "Java");
		obj.prikaziTip();

		int intVrednost = obj.getOb1();
		System.out.println("Vrednost: " + intVrednost);
		String strVrednost = obj.getOb2();
		System.out.println("Vrednost: " + strVrednost);

		A<String, Double> obj2 = new A<String, Double>("proba", 6.66);
		obj2.prikaziTip();

		String str = obj2.getOb1();
		System.out.println("Vrednost: " + str);
		double doubleVrednost = obj2.getOb2();
		System.out.println("Vrednost: " + doubleVrednost);

		A<Boolean, Integer> obj3 = new A<Boolean, Integer>(true, 101);
		obj3.prikaziTip();
		boolean bool = obj3.getOb1();
		System.out.println("Vrednost: " + bool);
		int broj = obj3.getOb2();
		System.out.println("Vrednost: " + broj);

	}

}
