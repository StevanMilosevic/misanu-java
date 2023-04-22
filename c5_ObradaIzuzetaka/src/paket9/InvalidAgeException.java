package paket9;

public class InvalidAgeException extends Throwable {
	private int age;

	InvalidAgeException(int a) {
		age = a;
	}

	public String toString() {
		return "age " + age + " is not a valid age";
	}
}
