package stevan;

public class FunkcijaReturn {

	public static void test() {
		int a = 10;
		System.out.println("BBB");
		if (a == 10) {
			return;
		}
		System.out.println("BBB");

	}

	public static void main(String[] args) {
		System.out.println("AAA");
		test();
		System.out.println("DDD");
	}

}
