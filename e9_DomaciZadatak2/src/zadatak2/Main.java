package zadatak2;

public class Main {
	public static void main(String[] args) {
		Ispit ispit1 = new Ispit(11, "baze");
		Ispit ispit2 = new Ispit(7, "admin");
		Ispit ispit3 = new Ispit(4, "elektro");

		Student s = new Student("Stevan", "2023/1234");
		s.dodajIspit(ispit1);
		s.dodajIspit(ispit2);
		s.dodajIspit(ispit3);

		System.out.println(s.toString());
	}
}