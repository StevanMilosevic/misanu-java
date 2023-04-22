package DZ1_3zadatak_StevanMilosevic;

public class Niz<T> {
	private final Object[] NIZ;
	public final int DUZINA;

	public Niz(int duzina) {
		NIZ = new Object[duzina];
		DUZINA = duzina;
	}

	int getBrElemenata() {
		return NIZ.length;
	}

	T get(int i) {
		@SuppressWarnings("unchecked")
		final T obj = (T) NIZ[i];
		return obj;
	}

	// Seter-uj element u OBJ_NIZ[i]
	void set(int i, T e) {
		NIZ[i] = e;
	}
}