package primer2;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// prvo napravimo fajl negde na hardu
		File f = new File("C:/Temp/Stevan.java");
		// getName() vraca naziv fajla
		System.out.println("Fajl: " + f.getName() + (f.isFile() ? " je fajl " : " nije fajl!"));
		// getAbsolutePath vraca apsolutnu putanju do fajla
		System.out.println("Apsolutna putanja: " + f.getAbsolutePath());
		// exists() ispituje da li fajl postoji
		System.out.println(f.exists() ? "Fajl postoji " : "Fajl ne postoji");
		// isDirectory() ispituje da li je u pitanju direktorijum, gde ga upucujemo
		System.out.println(f.isDirectory() ? "Direktorijum" : "Fajl");
		// canRead() ispituje da li fajl moze biti procitan
		System.out.println(f.canRead() ? "Fajl moze biti procitan" : "Fajl ne moze biti procitan");
		// canWrite() -> da li se moze vrsiti upisivanje u fajl
		System.out.println(f.canWrite() ? "Omoguceno je upisivanje " : "Nije moguce upisivanje u fajl");
		// length() vraca velicinu fajla
		System.out.println("Velicina: " + f.length());
		// lastModified() koliko je proslo od poslednje promene fajla,
		// u milisekundama koje posle mozemo da pretvaramo u ono sto nam treba
		System.out.println("Poslednja promena fajla: " + f.lastModified() + " u milisekundama");
	}

}
