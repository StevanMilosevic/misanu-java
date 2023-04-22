package paket9;

public class Exception {
	public static void checkAge(int age) throws InvalidAgeException {
		System.out.println("Checking age validity: (" + age + ")");
		if (age < 0 || age > 100)
			throw new InvalidAgeException(age);
		System.out.println("Age: " + age + " is valid age");
	}

	public static void main(String[] args) {
		try {
			checkAge(25);
			checkAge(-5);
		} catch (InvalidAgeException e) {
			System.out.println("Uhvaceno: " + e);
		}
	}
}
