package primer5;

public class B implements Runnable {
	Thread t;

	B() {
		t = new Thread(this, "Sporedna nit broj 2");
	}

	@Override
	public void run() {
		try {
			for (int i = 5; i < 12; i++) {
				System.out.println((i - 4) + " == " + t);
				Thread.sleep(i * 250);
			}
		} catch (InterruptedException e) {
			System.out.println("Uhvacen izuzetak!");
		}
	}
}
