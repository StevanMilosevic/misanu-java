package zadatak3;

// Napisati program koji ispisuje sve proste brojeve od 1 do 10. 
// Prost broj je deljiv samo jedinicom i samim sobom.

public class Main {
	public static void main(String[] args) {
		boolean provera; // boolean za kontrolu

		for (int i = 1; i <= 10; i++) {
			provera = false;

			/*
			 * najblizi broj koji dokazuje da neki broj nije prost je njegova polovina (broj
			 * / 2) zato u for petlji je postavljen uslov na (i / 2) jer nema potrebe da
			 * proveravamo brojeve od "broj / 2" do samog broja, posto ce svakako da daju
			 * ostatak prilikom deljenja
			 */

			for (int j = 2; j <= i / 2; j++) { // pocetak od 1, jer nema potrebe da ga ispitujemo
				if (i % j == 0) {
					provera = true; // ako prodje IF uslov, broj nije prost
					break;
				}
			}
			if (!provera)
				System.out.println(i + " je prost broj");
		}
	}
}
