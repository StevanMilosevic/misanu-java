package primer1;

public class TestPas {
	public static void main(String[] args) {
		Pas p = new Pas();
		System.out.println("Klasa Pas");
		p.laj();
		p.dahci();

		ZlatniRetriver zr = new ZlatniRetriver();
		System.out.println("Klasa ZlatniRetriver");
		zr.laj();
		zr.dahci();
		zr.aportiraj();

		LhasaApso la = new LhasaApso();
		la.laj();
		la.dahci();
		la.cuvaj();
	}
}
