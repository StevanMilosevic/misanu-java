package primer7;

public class EnumPrikaz {

	static void odgovor(Odgovori odg) {
		switch (odg) {
		case NE:
			System.out.println("Ne jok ");
			break;
		case DA:
			System.out.println("Da bre");
			break;
		case MOZDA:
			System.out.println("Mozda malo kasnije");
			break;
		case KASNIJE:
			System.out.println("Kasnije pa nikad");
			break;
		case USKORO:
			System.out.println("Uskoro kako da ne");
			break;
		case NIKAD:
			System.out.println("Nikad pa skoro uvek");
			break;
		}
	}

}
