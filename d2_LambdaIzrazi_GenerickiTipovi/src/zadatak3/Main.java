package zadatak3;

// Lambda izrazom okrenuti redosled znakova u znakovnom nizu

public class Main {

	public static void main(String[] args) {

		OkreniString os = (str) -> {
			String rezultat = "";

			for (int i = str.length() - 1; i >= 0; i--)
				rezultat += str.charAt(i);
			return rezultat;
		};
		System.out.println("Java obrnuto : " + os.okreni("Java"));
	}

}
