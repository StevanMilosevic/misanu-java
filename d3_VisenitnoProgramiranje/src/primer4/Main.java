package primer4;

// za domaci uraditi isto ovo, ali sa Runnable
public class Main {
	public static void main(String[] args) {
		A a = new A();
		B b = new B("nit 2");
		C c = new C("Nit 3");

		a.start();
		b.start();
		c.start();

	}

}
