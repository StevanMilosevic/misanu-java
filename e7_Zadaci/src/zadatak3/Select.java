package zadatak3;

import java.sql.*;

public class Select {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/biblioteke";
		String username = "root";
		String password = "";

		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			System.out.println("Uspesna konekcija ka bazi");

			String sqlSelect = "SELECT * FROM biblioteka";

			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(sqlSelect);

			while (result.next()) {
				String imeBiblioteke = result.getString(2);
				String ulica = result.getString(3);
				int broj = result.getInt(4);

				StringBuilder builder = new StringBuilder();
				builder.append("\nIme biblioteke: ").append(imeBiblioteke);
				builder.append("\nUlica: ").append(ulica);
				builder.append("\nBroj: ").append(broj);

				System.out.println(builder.toString());
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
