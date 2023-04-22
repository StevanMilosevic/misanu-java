package javaBaza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// potrebno je da uvezemo JDBC drajver, on ce nam omoguciti da komuniciramo sa bazom
// on predstavlja posrednika izmedju javine aplikacije i baze podataka
// mysql-connector-j-8.0.32.jar je verzija koja je aktuelna sa Oraclovog sajta
// jar fajl dodajemo:
// desni klik na projekat -> build path -> Add External Archives...

public class Update {

	public static void main(String[] args) {
		// da bi smo se konektovali sa bazom, potrebna su nam tri podatka:
		// 1. adresa gde se nalazi baza sa kojom zelimo da se povezemo
		// 2. korisnicko ime servera kome pristupamo
		// 3. lozinka servera kome pristupamo

		String url = "jdbc:mysql://localhost:3306/baza03";
		String username = "root";
		String password = "";

		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			System.out.println("Uspesna konekcija ka bazi");

			String sqlUpdate = "UPDATE korisnici SET lozinka = ?, ime = ?, email = ? WHERE korisnickoIme = ?";
			PreparedStatement ps = conn.prepareStatement(sqlUpdate);
			ps.setString(1, "123korisnik");
			ps.setString(2, "Neko");
			ps.setString(3, "neko@gmail.com");

			ps.setString(4, "korisnik1");

			int promenjenPodatak = ps.executeUpdate();

			if (promenjenPodatak > 0)
				System.out.println("Uspesno je izvrsena izmena u bazi");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
