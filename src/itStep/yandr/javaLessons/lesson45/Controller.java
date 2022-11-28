package itStep.yandr.javaLessons.lesson45;

import java.io.IOException;
import java.sql.*;

public class Controller {
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://127.0.0.1:3306/computerdb";
    public static final String USER = "root";
    public static final String PASSWORD = "Zasada301187";
    public static final String SIMPLE_SELECT = "SELECT c.classcol, pc.id_pc, pc.name FROM class c JOIN pc ON pc.id_class = c.id_class;";

    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SIMPLE_SELECT);
            int index = 1;
            while (resultSet.next()) {
                System.out.println(index + ". " + resultSet.getString("c.classcol") + " ");
                System.out.println(resultSet.getInt("pc.id_pc") + " ");
                System.out.println(resultSet.getString("pc.name") + "\n");
                index++;
            }
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }
    }
}

