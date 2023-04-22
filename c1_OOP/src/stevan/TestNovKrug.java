package stevan;

public class TestNovKrug {
	public static void main(String[] args) {

		NovKrug krug = new NovKrug(20); // pravimo objekat(instancu) klase
		NovKrug krug2 = new NovKrug(30);

		calcArea(krug); // poziv konkretno za objekat krug
		calcArea(krug2);
	}

	public static void calcArea(NovKrug krug) {
		System.out.println("Povrsina kruga: " + krug.area());
	}

}
