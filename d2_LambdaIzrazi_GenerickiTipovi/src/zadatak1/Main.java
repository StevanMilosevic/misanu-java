package zadatak1;

public class Main {

	public static void main(String[] args) {

		TestiraBroj paranBroj = (n) -> (n % 2) == 0;
		// leva strana Lambda izraza -> desna strana Lambda izraza (Lambda telo)

		if (paranBroj.test(12)) {
			System.out.println("Broj je paran broj.");
		} else {
			System.out.println("Broj nije paran broj.");
		}

	}

}
