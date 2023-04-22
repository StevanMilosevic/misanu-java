package zadatak9;

public class TestKnjiga {
	public static void main(String[] args) {
		Knjiga knjiga = new Knjiga();

		knjiga.unetiNazivKnjige();
		knjiga.unetiAutoraKnjige();
		knjiga.unetiIzdavacaKnjige();

		knjiga.ispisi();
	}
}
