package javaBaza;

import java.sql.*;

//potrebno je da uvezemo JDBC drajver, on ce nam omoguciti da komuniciramo sa bazom
//on predstavlja posrednika izmedju javine aplikacije i baze podataka
//mysql-connector-j-8.0.32.jar je verzija koja je aktuelna sa Oraclovog sajta
//jar fajl dodajemo:
//desni klik na projekat -> build path -> Add External Archives...

public class Insert {

	public static void main(String[] args) {
		// da bi smo se konektovali sa bazom, potrebna su nam tri podatka:
		// 1. adresa gde se nalazi baza sa kojom zelimo da se povezemo
		// 2. korisnicko ime servera kome pristupamo
		// 3. lozinka servera kome pristupamo

		String url = "jdbc:mysql://localhost:3306/baza03";
		String username = "root";
		String password = "";

		System.out.println("Konekcija...");
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			System.out.println("Uspesna konekcija ka bazi");

			String sqlInsert = "INSERT INTO korisnici(korisnickoIme, lozinka, ime, email) VALUES (?, ?, ?, ?)";

			PreparedStatement ps = conn.prepareStatement(sqlInsert);
			ps.setString(1, "Dino");
			ps.setString(2, "kurtovic326");
			ps.setString(3, "Jamezdin");
			ps.setString(4, "jamezdin@mail.com");

			int unetPodatak = ps.executeUpdate();

			if (unetPodatak > 0)
				System.out.println("Podatak je upisan");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
