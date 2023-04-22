package zadatak4;

public class Motor {
	String marka;
	double kubikaza;

	public void setMarka(String marka) throws Exception {
		if (marka.isBlank() || marka.isEmpty())
			throw new Exception("Greska! Ne sme biti null.");
		this.marka = marka;
	}

	public void setKubikaza(double kubikaza) throws Exception {
		if (kubikaza < 50 || kubikaza > 2000)
			throw new Exception("Kubikaza mora biti izmedju 50 i 2000 kubika.");
		this.kubikaza = kubikaza;
	}

	public void ispisi() {
		System.out.println("Marka motora je: " + marka + "\nKubikaza motora je: " + kubikaza);
	}
}
