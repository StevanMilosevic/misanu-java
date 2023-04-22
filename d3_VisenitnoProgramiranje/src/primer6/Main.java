package primer6;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();

		// Kada odredjenoj niti zelimo da dodamo prioritet prilikom izvrsavanja
		// pozivamo metodu setPriority() koja je clan klase thread
		// void setPriority(nivo)
		// parametrom nivo zadajemo nivo prioriteta niti za koju je metoda pozvana
		// Vrednost mora biti u opsegu izmedju MIN_PRIORITY = 1 i MAX_PRIORITY = 10
		// podrazumevana vrednost iznosi 5, a moze se zadati preko NORM_PRIORITY

		a.setPriority(Thread.MIN_PRIORITY + 5); // 1 -> 6
		b.setPriority(Thread.MAX_PRIORITY - 7); // 10 -> 3

		// Thread priorities are highly OS specific
		// and on many operating systems often have minimal effect.

		a.start();
		b.start();

		System.out.println("Kraj glavne niti.");
	}

}
