package zadatak6;

// ZADATAK 6 - Napisati genericku klasu “OpisnaOcena” koja omogućuje smeštanje vrednosti (Ocena, OpisnaOcena).
// Ocena je celobrojna vrednost, a OpisnaOcena je String-ovna vrednost. Ispis uraditi za ocene od 1 – 5.

public class OpisnaOcena<T, V> {
	T obj1;
	V obj2;

	public T getObj1() {
		return obj1;
	}

	public void setObj1(T obj1) {
		this.obj1 = obj1;
	}

	public V getObj2() {
		return obj2;
	}

	public void setObj2(V obj2) {
		this.obj2 = obj2;
	}

	void ispis() {
		System.out.println(this.getObj1() + " -> " + this.getObj2());
	}
}