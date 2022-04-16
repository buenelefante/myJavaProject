package jm.task.core.jdbc;

import jm.task.core.jdbc.util.Util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        Util util = new Util();
        String query = "select * from users";

        try {
            Statement statement = util.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String name = resultSet.getString(2);
                System.out.println(name);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
