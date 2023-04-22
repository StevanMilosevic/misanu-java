package matrica;

public class Matrica {
	private double[][] matrica;

	Matrica(int red, int kolona) {
		matrica = new double[red][kolona];
	}

	public double getRed() {
		return matrica.length;
	}

	public double getKolona() {
		return matrica[0].length;
	}

	public void postaviElement(int r, int k, int vrednost) {
		matrica[r][k] = vrednost;
	}

	public double dohvatiElement(int r, int k) {
		return matrica[r][k];
	}

	public void stampanjeMatrice() {
		for (int v = 0; v < matrica.length; v++) {
			for (int k = 0; k < matrica[0].length; k++) {
				System.out.print(matrica[v][k] + " ");
			}
			System.out.println();
		}
	}
}
