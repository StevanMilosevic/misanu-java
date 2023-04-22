package primer5;

public class A implements Runnable {
	Thread t;

	A() {
		t = new Thread(this, "Nit broj 1");
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println((i + 1) + " -> " + t);
				Thread.sleep(i * 200);
			}
		} catch (InterruptedException e) {
			System.out.println("Uhvacen izuzetak");
		}
	}
}
