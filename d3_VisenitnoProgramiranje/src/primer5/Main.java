package primer5;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();

		a.t.start();
		b.t.start();
		c.t.start();

		try {
			System.out.println("Cekanje da se niti zavrse.");
			a.t.join();
			b.t.join();
			c.t.join();
		} catch (InterruptedException e) {
			System.out.println("Glavna nit je prekinuta");
		}
		System.out.println("Nit broj jedan se izvrsava -> " + a.t.isAlive());
		System.out.println("Nit broj dva se izvrsava -> " + b.t.isAlive());
		System.out.println("Nit broj tri se izvrsava -> " + c.t.isAlive());

	}

}
