package stevan;

public class DemoPrikaz {

	public static void main(String[] args) {
		Rastojanje r1 = new Rastojanje();
		Rastojanje r2 = new Rastojanje();
		Rastojanje r3 = new Rastojanje();

		r1.stopala = 14;
		r1.inch = 9.5;

		r2.stopala = 19;
		r2.inch = 5.5;

		System.out.println("Rastojanje 1: " + r1.stopala + "\' -> " + r1.inch + "\"");
		System.out.println("Rastojanje 2: " + r2.stopala + "\' -> " + r2.inch + "\"");
		System.out.println("Rastojanje 3: " + r3.stopala + "\' -> " + r3.inch + "\"");

	}

}
