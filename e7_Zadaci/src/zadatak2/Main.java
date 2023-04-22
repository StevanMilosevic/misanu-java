package zadatak2;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		int[][] matrica = new int[9][9];
		int redX = (int) (Math.random() * 10);// za najtezi nivo
		int kolonaX = (int) (Math.random() * 10);// za najtezi nivo

		System.out.print("Izaberite nivo od 1 (easy) do 3 (hard): ");
		int nivo = input.nextInt();

		switch (nivo) {
		case 1:
			System.out.println("Imate 5 pokusaja");
			int nivo1red = rand.nextInt(4) + 1;
			int nivo1kolona = rand.nextInt(4) + 1;

			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					System.out.print(0 + " ");
				}
				System.out.println();
			}

			for (int a = 1; a <= 5; a++) {
				System.out.println(a + " pokusaj");
				System.out.println("Red: ");
				int prviX = input.nextInt();
				System.out.println("Kolona: ");
				int prviY = input.nextInt();
				System.out.println("[" + prviX + ":" + prviY + "]");

				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						if (i == prviX && j == prviY)
							System.out.print("X ");
						else
							System.out.print(0 + " ");
					}
					System.out.println();
				}
				if (prviX == nivo1red && prviY == nivo1kolona)
					System.out.println("Pogodak!");
			}
			System.out.println("Resenje [" + nivo1red + ":" + nivo1kolona + "]");
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (i == nivo1red && j == nivo1kolona)
						System.out.print("X ");
					else
						System.out.print(0 + " ");
				}
				System.out.println();

			}
			break;

		case 2:
			System.out.println("Imate 3 pokusaja");
			int nivo2red = rand.nextInt(7) + 1;
			int nivo2kolona = rand.nextInt(7) + 1;

			for (int i = 0; i < 7; i++) {
				for (int j = 0; j < 7; j++) {
					System.out.print(0 + " ");
				}
				System.out.println();
			}

			for (int a = 1; a <= 3; a++) {
				System.out.println(a + " pokusaj");
				System.out.println("Red: ");
				int drugiX = input.nextInt();
				System.out.println("Kolona: ");
				int drugiY = input.nextInt();
				System.out.println("[" + drugiX + ":" + drugiY + "]");

				for (int i = 0; i < 7; i++) {
					for (int j = 0; j < 7; j++) {
						if (i == drugiX && j == drugiY)
							System.out.print("X ");
						else
							System.out.print(0 + " ");
					}
					System.out.println();
				}
				if (drugiX == nivo2red && drugiY == nivo2kolona)
					System.out.println("Pogodak!");
			}
			System.out.println("Resenje [" + nivo2red + ":" + nivo2kolona + "]");
			for (int i = 0; i < 7; i++) {
				for (int j = 0; j < 7; j++) {
					if (i == nivo2red && j == nivo2kolona)
						System.out.print("X ");
					else
						System.out.print(0 + " ");
				}
				System.out.println();

			}
			break;

		case 3:
			System.out.println("Imate 1 pokusaj");
			// ovde koristimo redX i kolonaX

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					System.out.print(0 + " ");
				}
				System.out.println();
			}

			System.out.print("Red: ");
			int treciX = input.nextInt();
			System.out.print("Kolona: ");
			int treciY = input.nextInt();

			System.out.println("Pokusali ste: [" + treciX + ":" + treciY + "]");
			for (int i = 0; i < matrica.length; i++) {
				for (int j = 0; j < matrica.length; j++) {
					if (i == treciX && j == treciY)
						System.out.print("X ");
					else
						System.out.print(0 + " ");

				}
				System.out.println();
			}

			System.out.println("Resenje [" + redX + ":" + kolonaX + "]");
			for (int i = 0; i < matrica.length; i++) {
				for (int j = 0; j < matrica.length; j++) {
					if (i == redX && j == kolonaX)
						System.out.print("X ");
					else
						System.out.print(0 + " ");

				}
				System.out.println();
			}
			if (treciX == redX && treciY == kolonaX)
				System.out.println("Pogodili ste!");
			break;
		}
		input.close();
	}
}
