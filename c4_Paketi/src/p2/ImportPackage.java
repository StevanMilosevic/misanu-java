package p2;

import p1.First;

// import p1.*; Drugi nacin importovanja paketa
// ako ima vise klasa u tom paketu, * (zvezdicom) biramo SVE klase da importujemo

// import paket.nazivKlase -> importuje samo zadatu klasu iz navedenog paketa
// import paket.* -> importuje sve klase iz navedenog paketa

public class ImportPackage {
	public static void main(String[] args) {
		First f = new First();
		f.view();
	}
}
