package stevan;

public class TestKrug {
	public static void main(String[] args) {
		Krug krug = new Krug(10);

		System.out.println("Povrsina kruga je: " + krug.area());
	}

}

// ako ne navedemo konstruktor 
// 		- vraca se podrazumevana vrednost za taj tip podataka (0 ili null)
// da li konstruktoru mozemo zadati pocetnu vrednost(ne preko parametra)?
//		- mozemo! navodimo to u telu metode.
// konstruktor sa parametrom - kako izgleda i kako ga pozivamo?
// 		- na isti/sličan način kao i metod sa parametrom
// pri pozivu se navodi onoliko argumenata koliko je definisano parametara: 
// redosled odgovara redosledu definisanja parametara