package primer5;

public class C implements Runnable {
	Thread t;

	C() {
		t = new Thread(this, "Ovo je sporedna nit broj 3");
	}

	@Override
	public void run() {
		try {
			for (int i = 10; i > 0; i--) {
				System.out.println(i + " --- " + t);
				Thread.sleep(i * 150);
			}
		} catch (InterruptedException e) {
			System.out.println("Uhvacen izuzetak!");
		}
	}

}
