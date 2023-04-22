package zadatak6;

// Matrica realnih brojeva ima zadat broj vrsta i kolona koji mogu da se dohvate. Može da se
// postavi ili da se dohvati element sa zadatim indeksima. Kreirati UML diagram za zadatu klasu.

public class Matrica {
	private int red;
	private int kolona;
	private int[][] matrica;

	public static void getRed(int r, int k, int[][] matrica, int n) {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < k; j++) {
				if (i == n - 1)
					System.out.print(matrica[i][j] + " ");
			}
		}
	}

	public static void getKolona(int r, int k, int[][] matrica, int n) {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < k; j++) {
				if (j == n - 1)
					System.out.print(matrica[i][j] + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void setElement(int x, int y, int[][] matrica, int n) {
		matrica[x - 1][y - 1] = n;
	}

	public static int getElement(int x, int y, int[][] matrica) {
		return matrica[x - 1][y - 1];
	}

	public static void stampaj(int x, int y, int[][] matrica) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
	}
}
