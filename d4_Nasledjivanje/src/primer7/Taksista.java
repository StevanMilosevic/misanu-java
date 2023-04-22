package primer7;

public class Taksista {
	private static String imeKompanije = "Zuti taksi";
	private String ime;

	public Taksista() {
		ime = null;
	}

	public Taksista(String iIme) {
		ime = iIme;
	}

	public void zadajIme(String iIme) {
		ime = iIme;
	}

	public String uzmiIme() {
		return ime;
	}

	public void zadajPravac() {
		System.out.println("Pravac");
	}

	private void skreniDesno() {
		System.out.println("Skreni desno");
	}

	private void skreniLevo() {
		System.out.println("Skreni levo");
	}

	public static String uzmiImeKompanije() {
		return imeKompanije;
	}
}
