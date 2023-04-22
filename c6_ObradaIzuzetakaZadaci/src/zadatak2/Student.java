package zadatak2;

public class Student {
	private String ime;
	private String prezime;
	private String adresa;
	private int brojIndexa;

	Student(String ime, String prezime, String adresa, int indeks) throws Izuzetak {
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
		if (indeks > 0 && indeks < 100)
			this.brojIndexa = indeks;
		else
			throw new Izuzetak(indeks);
	}

	public void ispisi() {
		System.out.println(ime + "\t" + prezime + "\t" + adresa + "\t" + brojIndexa);
	}
}
