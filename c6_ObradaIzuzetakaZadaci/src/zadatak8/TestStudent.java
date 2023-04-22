package zadatak8;

import java.io.*;

public class TestStudent {
	public static void main(String[] args) throws Exception {
		String imePrezime;
		int brojIndeksa;
		double prosecnaOcena;

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Unesite ime i prezime studenta: ");
			imePrezime = input.readLine();
			System.out.print("Unesite broj indeksa studenta: ");
			brojIndeksa = Integer.parseInt(input.readLine());
			System.out.print("Unesite prosecnu ocenu studenta: ");
			prosecnaOcena = Double.parseDouble(input.readLine());

			Student s = new Student();
			s.setImePrezime(imePrezime);
			s.setBrojIndeksa(brojIndeksa);
			s.setProsecnaOcena(prosecnaOcena);

			System.out.println("Podaci o studentu su: ");
			System.out.println("Ime i prezime: " + imePrezime + "\nBroj indeksa: " + brojIndeksa + "\nProsecna ocena: "
					+ prosecnaOcena);

		} catch (Throwable e) {
			System.out.println("Stampanje informacije o izuzetku metodom printStackTrace");
			e.printStackTrace();

			// metoda za pracenje stacka
			StackTraceElement stack[] = e.getStackTrace();

			// unos elemenata
			for (int i = 0; i < stack.length; i++) {
				String fileName = stack[i].getFileName();
				String className = stack[i].getClassName();
				String methodName = stack[i].getMethodName();
				boolean isNativeMethod = stack[i].isNativeMethod();
				int line = stack[i].getLineNumber();
			}
			// stampanje informacija o izuzetku na osnovu pracenja stack-a
			for (int i = 0; i < stack.length; i++)
				System.out.println(stack[i]);
		}
	}
}
