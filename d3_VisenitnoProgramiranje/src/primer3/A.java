package primer3;

// Nit se moze napraviti i kada Thread prosirimo novom nasledjenom klasom,
// a zatim napravimo instancu te klase

// Nova potklasa mora da redefinise metodu run()

public class A extends Thread {

	A(String s) {
		super(s); // poziva se konstruktor Thread sledeceg oblika:
					// public Thread(String imeNiti)
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++)
			System.out.println(getName());
	}
}