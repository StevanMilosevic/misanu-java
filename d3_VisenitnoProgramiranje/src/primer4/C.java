package primer4;

public class C extends Thread {
	C(String s) {
		super(s);
	}

	public void run() {
		System.out.println("Ovo je nit 3");
	}
}
