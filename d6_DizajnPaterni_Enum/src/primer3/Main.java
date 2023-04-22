package primer3;

// ENUM -> enumeracije, nabrajanja

public class Main {

	public static void main(String[] args) {

		// Nabrajanje je lista imenovanih vrednosti koja definisu nov tip podataka
		// i njegove dozvoljene vrednosti
		// to znaci da nabrajanje moze da sadrzi neku od vrednosti koje su navedene na
		// listi
		// druge vrednosti NISU dozvoljene

		Boje b; // int a
		b = Boje.Crvena; // a = 5

		System.out.println("Boja: " + b);

		b = Boje.Plava;
		if (b == Boje.Plava)
			System.out.println("Plava");

		switch (b) {
		case Crvena:
			System.out.println("Crvena");
			break;
		case Zelena:
			System.out.println("Zelena");
			break;
		case Plava:
			System.out.println("Plava");
			break;
		case Crna:
			System.out.println("Crna");
			break;
		case Bela:
			System.out.println("Bela");
			break;
		case Narandzasta:
			System.out.println("Narandzasta");
			break;
		case Zuta:
			System.out.println("Zuta");
			break;
		}

	}

}
