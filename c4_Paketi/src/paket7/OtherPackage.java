package paket7;

public class OtherPackage {
	OtherPackage() {
		paket6.Base b = new paket6.Base();
		System.out.println("Konstruktor klase OtherPackage");
		// System.out.println("OtherPackage klasa n_pri: " + n_pri);
		// System.out.println("OtherPackage klasa n_def: " + b.n_def);
		// System.out.println("OtherPackage klasa n_pro: " + b.n_pro);
		System.out.println("OtherPackage klasa n_pub: " + b.n_pub);
	}
}
