package de.telran.lesson20231215;

import java.sql.*;

public class JDBConnectionExample {

    public static void main(String[] args) {
//                Class.forName("com.mysql.cj.jdbc.Driver");

        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
                Statement statement = connection.createStatement();
                ){

            statement.setFetchSize(50);
            ResultSet resultSet = statement.executeQuery("SELECT * from city");
            ResultSetMetaData metaData = resultSet.getMetaData();
            System.out.println(metaData.getColumnCount());
            while (resultSet.next()) {
                for (int i = 1; i <= metaData.getColumnCount(); i++) {
                    System.out.print(resultSet.getString(i) + " ");
                }
                System.out.println();
            }
//            statement.close();
//            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


}
