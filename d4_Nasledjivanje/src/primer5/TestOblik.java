package primer5;

public class TestOblik {
	public static void main(String[] args) {
		Krug krug = new Krug();
		Pravougaonik pravougaonik = new Pravougaonik();
		Zvezda zvezda = new Zvezda();

		crtajOblik(krug);
		crtajOblik(pravougaonik);
		crtajOblik(zvezda);
	}

	static void crtajOblik(Oblik o) {
		o.crtaj();
	}
}
