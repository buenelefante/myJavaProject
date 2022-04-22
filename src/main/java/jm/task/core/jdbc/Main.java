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
        userService.saveUser("Roma","Zybov", (byte) 21);
        userService.saveUser("Chack","Kolchak", (byte)39);
        userService.saveUser("Egor","Player", (byte)32);
        userService.saveUser("Goga","Magoga", (byte)11);
        userService.removeUserById(1);
        userService.getAllUsers();
        userService.cleanUsersTable();


    }
}
