package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;



import java.sql.SQLException;
import java.sql.Statement;

import java.util.List;

public class UserServiceImpl implements UserService {
    public void createUsersTable() {
        String sqlCommand = "CREATE TABLE IF NOT EXISTS users (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(25), lastname VARCHAR(25), age INT(3))";
        try {
            Statement statement = Util.getConnection().createStatement();
            statement.executeUpdate(sqlCommand);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void dropUsersTable() {
        String sqlCommand = "DROP TABLE IF EXISTS users";
        try {
            Statement statement = Util.getConnection().createStatement();
            statement.executeUpdate(sqlCommand);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveUser(String name, String lastName, byte age) {
        String sqlCommand = "INSERT INTO users (name,lastname, age) VALUES ('Nikola', 'Желткофф', 33)";
        try{    Statement statement = Util.getConnection().createStatement();
            statement.executeUpdate(sqlCommand);
            System.out.printf("User " + name + " добавлен в базу данных");
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }

    public void removeUserById(long id) {
        String sqlCommand = "DELETE FROM users WHERE id=2";
        try {
            Statement statement = Util.getConnection().createStatement();
            statement.executeUpdate(sqlCommand);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> getAllUsers() {

        return null;
    }

    public void cleanUsersTable() {
        String sqlCommand = "TRUNCATE TABLE users";
        try {
            Statement statement = Util.getConnection().createStatement();
            statement.executeUpdate(sqlCommand);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    UserDaoJDBCImpl dao = new UserDaoJDBCImpl();
}
