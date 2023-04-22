package primer4;

public class B extends Thread {
	B(String s) {
		super(s);
	}

	public void run() {
		System.out.println("Ovo je nit 2");
	}
}
