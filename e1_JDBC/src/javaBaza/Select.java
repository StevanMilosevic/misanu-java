package javaBaza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//potrebno je da uvezemo JDBC drajver, on ce nam omoguciti da komuniciramo sa bazom
//on predstavlja posrednika izmedju javine aplikacije i baze podataka
//mysql-connector-j-8.0.32.jar je verzija koja je aktuelna sa Oraclovog sajta
//jar fajl dodajemo:
//desni klik na projekat -> build path -> Add External Archives...

public class Select {

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

			String sqlSelect = "SELECT * FROM korisnici";

			// objekat za komunikaciju sa bazom
			Statement stmt = conn.createStatement();
			// izvrsavanje (namena)
			ResultSet result = stmt.executeQuery(sqlSelect);

			while (result.next()) {
				String ki = result.getString(2);
				String lo = result.getString(3);
				String ime = result.getString(4);
				String email = result.getString(5);

				StringBuilder builder = new StringBuilder();
				builder.append("\nKorisnicko ime: ").append(ki);
				builder.append("\nLozinka: ").append(lo);
				builder.append("\nIme: ").append(ime);
				builder.append("\nEmail: ").append(email);

				System.out.println(builder.toString());
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
