package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
// SQL PROJECT
public class SQL_Main {
	static Connection conn;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the name of the city: ");
		String city = input.nextLine();
		// citanje iz database
		try {
			conn = checkConnection();
			Statement statement = conn.createStatement();
			printInfo(statement, city);
		} catch (SQLException e) {
			System.out.println("City you entered does not exist.");
			e.printStackTrace();
		}
	}

	// metoda za ispis informacija
	private static void printInfo(Statement statement, String city)
			throws SQLException {
		char check = 0;
		while (true) {
			/*
			 * SELECT * FROM name - iz koje tabele da selektujemo podatak; WHERE
			 * Name = 'userInput' - naziv podatka koji selektujemo iz te tabele;
			 */
			ResultSet result = statement
					.executeQuery("SELECT * FROM city WHERE Name = '" + city
							+ "'");
			result.next();
			System.out.println("City: " + result.getString("Name") + " ");
			System.out.println("CountryCode: "
					+ result.getString("CountryCode") + " ");
			System.out.println("District: " + result.getString("District"));
			System.out.println("Population: " + result.getString("Population")
					+ " citizens");
			System.out
					.println("Chose another city? (insert Y to continue, anything else to exit)");
			check = input.next().charAt(0);
			if (check == 'Y' || check == 'y') {
				System.out.println("Enter the name of the city:");
				city = input.nextLine();
				continue;
			} else
				break;
		}
	}

	// evo nakon cijelog dana stimanja, proradio connection HYPE HYPE
	public static Connection checkConnection() {
		try {
			System.out.println("Connecting...");
			String username = "root";
			String password = "1234";
			// autoReconnect pokusava ponovno konektovanje, useSSL sprijecava
			// izbacivanje warning poruke o sigurnosti servera
			conn = DriverManager
					.getConnection(
							"jdbc:mysql://localhost:3306/mydatabase?autoReconnect=true&useSSL=false",
							username, password);
			System.out.println("Connected!");
			return conn;
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());

		}
		return null;
	}
}