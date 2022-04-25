package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import org.hibernate.Session;

import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class UserDaoHibernateImpl implements UserDao {
    public UserDaoHibernateImpl() {

    }


    @Override
    public void createUsersTable() {
//        Session session = getSessionFactory().openSession();
//        Transaction transaction = session.beginTransaction();
//
//        String sql = "CREATE TABLE IF NOT EXISTS toops (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(25), lastname VARCHAR(25), age INT(3))";
//
//        Query query = session.createSQLQuery(sql).addEntity(UserDaoHibernateImpl.class);
//
//
//        transaction.commit();
//        session.close();

    }

    @Override
    public void dropUsersTable() {

    }

    @Override
    public void saveUser(String name, String lastName, byte age) {

    }

    @Override
    public void removeUserById(long id) {

    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void cleanUsersTable() {

    }
}
