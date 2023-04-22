package zadatak7;

import java.io.*;

// Programski kreirati fajl i upisati tekst: Ja sam programer!

public class Main {
	public static void main(String[] args) throws IOException {

		// try-with-resources, automatski zatvara resurs kada se zavrsi try blok
		try (FileOutputStream fis = new FileOutputStream("fajl.txt")) {
			String text = "Ja sam programer!";
			byte[] textBytes = text.getBytes();
			fis.write(textBytes);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}