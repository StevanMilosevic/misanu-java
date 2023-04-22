package stevan;

/* THIS
 *  Kljucna rec this ili referenca this pruza nacin da metoda zna koji tacno objekat je pozvao metodu, 
 * tj sa cijim podacima radi.   
 * Takodje, moze se koristiti za pristup podacima objekta koji su sakriveni lokalnim promenljivama 
 * ili parametrima metode.
 	Takodje, odnosi se na trenutni objekat u metodi ili konstruktoru. 
 	
 	Destruktori se koriste kada objekat treba da dealocira memoriju koju je konstruktor alocirao. 
 	Ovo se nekad radilo manuelno u C++ 
 	a Java "sama" to radi kroz nesto sto se zove GarbageCollector i 
 	time znatno olaksava posao programera u pogledu alokacije memorije.
 */

public class KrugThis {
	private double poluprecnik;

	KrugThis() {
		poluprecnik = 0.0;
	}

	KrugThis(double radius) {
		this.poluprecnik = radius;
	}

	public double area() {
		return 3.14 * poluprecnik * poluprecnik;
	}
}
