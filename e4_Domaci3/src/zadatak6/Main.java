package zadatak6;

//Napisati program koji pretvara dekadni broj {0,1,2,3,4,5,6,7,8,9} u binarni{0,1}.

public class Main {
	public static void main(String[] args) {
		System.out.println("Dekadno\tBinarno");

		for (int i = 0; i < 10; i++)
			System.out.println(i + "\t" + Integer.toBinaryString(i));
	}
}
