package com.pizzadeliveryapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private Connection connection = null;
    private String hostname = null;
    private String username = null;
    private String password = null;
    private String url = null;
    private String databaseName = null;
    private String databasePrefix = null;
    private String databasePort = null;

    public ConnectionFactory() {
        super();

        hostname = "localhost";
        username = "root";
        password = "";
        databasePrefix = "jdbc:mysql://";
        databaseName = "db_pizzadelivery";
        databasePort = "3306";

        url = databasePrefix + hostname + ":" + databasePort + "/" + databaseName;
    }

    public Connection getConnection() {
        try {
            if (connection == null) {
                connection = DriverManager.getConnection(url, username, password);
                System.out.println("Connection established");
            } else if (connection.isClosed()) {
                connection = null;
                return getConnection();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return connection;
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Connection closed");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
