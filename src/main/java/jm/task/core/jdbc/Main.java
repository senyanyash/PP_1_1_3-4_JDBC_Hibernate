package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl table = new UserDaoJDBCImpl();
        table.createUsersTable();


    }
}
