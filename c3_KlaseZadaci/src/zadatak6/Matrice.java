package zadatak6;

public class Matrice {
	private int[][] matr;

	public Matrice(int vrs, int kol) {
		matr = new int[vrs][kol];
	}

	public int vrs() {
		return matr.length; // length = osobina
	}

	public int kol() {
		return matr[0].length;
	}

	public Matrice postavi(int v, int k, int vrednost) {
		matr[v][k] = vrednost;
		return this;
	}

	public int dohvati(int v, int k) {
		return matr[v][k];
	}

	public String toString() {
		String s = "";
		for (int v = 0; v < matr.length; v++) {
			for (int k = 0; k < matr[0].length; k++) {
				System.out.print(matr[v][k] + " ");
				s = s + '\n';
			}
			s = s + "\n";
		}
		return s;
	}

}
