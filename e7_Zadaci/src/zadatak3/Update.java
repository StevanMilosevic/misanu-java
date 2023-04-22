package zadatak3;

import java.sql.*;

public class Update {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/biblioteke";
		String username = "root";
		String password = "";

		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			if (conn != null)
				System.out.println("Uspostavljena je konekcija ka bazi!");
			else
				System.out.println("Nije uspostavljena konekcija sa bazom");

			String sqlUpdate = "UPDATE biblioteka SET ime_biblioteke = ?, ulica = ?, broj = ? WHERE biblioteka_id = ?";

			PreparedStatement ps = conn.prepareStatement(sqlUpdate);
			ps.setString(1, "Opstinska biblioteka");
			ps.setString(2, "Sporedna ulica");
			ps.setInt(3, 16);
			ps.setInt(4, 3);

			int numRows = ps.executeUpdate();

			if (numRows > 0)
				System.out.println("Uspesno je izvrsen UPDATE korisnika");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
