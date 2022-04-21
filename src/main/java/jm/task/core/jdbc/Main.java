package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;


public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.dropUsersTable();
        userService.saveUser("Roma","Saenko", (byte)1);
        userService.removeUserById(1);
        userService.getAllUsers();
        userService.cleanUsersTable();

        Connection connection = Util.getConnection();
    }
}
