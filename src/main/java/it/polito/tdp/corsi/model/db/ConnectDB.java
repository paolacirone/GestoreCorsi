package it.polito.tdp.corsi.model.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectDB {

	// 1.definisco la stringa di connessione

	static private final String jdbcUrl = "jdbc:mysql://localhost/iscritticorsi?user=root&password=root";

	public static Connection getConnection() {

		try {
				Connection connection = DriverManager.getConnection(jdbcUrl);
				return connection;

		} catch (SQLException e) {

			e.printStackTrace();
			throw new RuntimeException("Cannot get a connection " + jdbcUrl, e);
		}
	}
}
