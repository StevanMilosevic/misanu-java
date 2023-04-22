package zadatak3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/biblioteke";
		String username = "root";
		String password = "";

		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			System.out.println("Uspostavljena je konekcija...");

			String sqlInset = "INSERT INTO biblioteka(`ime_biblioteke`, `ulica`, `broj`) VALUES(?, ?, ?)";

			PreparedStatement ps = conn.prepareStatement(sqlInset);
			ps.setString(1, "Mala gradska biblioteka");
			ps.setString(2, "Gradski trg");
			ps.setInt(3, 2);

			int unetPodatak = ps.executeUpdate();

			if (unetPodatak > 0)
				System.out.println("Podatak je upisan!");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
