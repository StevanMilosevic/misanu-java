package zadatak8;

public class Main {

	public static void main(String[] args) {
		Tacka t1 = new Tacka();
		Tacka t2 = new Tacka(5);
		Tacka t3 = new Tacka(2, 2);
		
		System.out.println(t1.poteg());
		System.out.println(t2.poteg());
		System.out.println(t3.poteg());
		
		System.out.println();
		
		System.out.println(t1.Rastojanje(t2));
		System.out.println(t2.Rastojanje(t3));
		System.out.println(t3.Rastojanje(t1));
		
		
	}

}
