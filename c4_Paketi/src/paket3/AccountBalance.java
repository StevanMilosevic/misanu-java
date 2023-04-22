package paket3;

public class AccountBalance {

	public static void main(String[] args) {
		Balance current[] = new Balance[3];

		current[0] = new Balance("Mika", 123.45);
		current[1] = new Balance("Zika", 345.12);
		current[2] = new Balance("Ljubivoje", -12.34);

		for (int i = 0; i < current.length; i++) {
			current[i].show();
		}

	}
}