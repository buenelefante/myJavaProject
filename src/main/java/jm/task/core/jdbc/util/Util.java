package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String URL = "jdbc:mysql://localhost:3306/javatest";
    private static  final String USERNAME = "root";
    private  static final String PASSWORD = "mySQL2022";

    private Connection connection;

    public Connection getConnection(){
        return connection;
    }
    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    public Util() {
        try {
            connection = DriverManager.getConnection(URL,USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
