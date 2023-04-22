package stevan;

public class Main {
	public static void main(String[] args) {

		// prvi nacin: Inicijalizacija dvodimenzionalnog niza
		int[][] a = { { 12, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		// stampanje elemenata dvodimenzionalnog niza
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		// matrica NEMA 0. red
		// matrica IMA 0. index

		// 0. index matrice je oznaka za 1 red matrice
		// mi vidimo elemente matrice (dok su indexi u pozadini)
	}
}