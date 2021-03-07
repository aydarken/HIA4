package kz.lab2.dao;

import kz.lab2.models.Users;
import org.springframework.stereotype.Component;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;


@Component
public class UserDAO {
    private static int PEOPLE_COUNT;

    private static final String URL = "jdbc:postgresql://localhost:5432/user";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "1020";

    private static Connection connection;

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<Users> index() {
        List<Users> people = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            String SQL = "SELECT * FROM USERS";
            ResultSet resultSet = statement.executeQuery(SQL);

            while (resultSet.next()) {
                Users us = new Users();

                us.setUsername(resultSet.getString("name"));

                people.add(us);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return people;
    }


    public void save(Users user) {
        try {
            Statement statement = connection.createStatement();
            String SQL = "INSERT INTO Users VALUES(" + 1 + ",'" + user.getUsername() +
                    "'," + ")";

            statement.executeUpdate(SQL);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

