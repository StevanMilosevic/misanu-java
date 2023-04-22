package paket5KontrolaVidljivostiUIstomPaketu;

public class SamePackage {

	SamePackage() {
		Base b = new Base();
		System.out.println("Konstruktor klase SamePackage");

		// System.out.println("SamePackage klasa n_pri: " + n_pri);
		System.out.println("SamePackage klasa n_def: " + b.n_def);
		System.out.println("SamePackage klasa n_pro: " + b.n_pro);
		System.out.println("SamePackage klasa n_pub: " + b.n_pub);
	}

}
