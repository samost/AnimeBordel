package model;

import java.sql.*;

public class JdbcDao {
    private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/bordel";
    private static final String DATABASE_USERNAME = "postgres";
    private static final String DATABASE_PASSWORD = "postgres";

    private static final String SELECT_QUERY = "SELECT * FROM client WHERE EMAIL = ? AND PASSWORD = ?";
    private static final String DOWNLOAD_DATA_OWNER = "INSERT INTO owner (USERNAME, EMAIL, PASSWORD, PHONE, BALANCE, COUNTRY, BANK, FULL_NAME) VALUES (?,?,?,?,?,?,?,?)";

    private static final String DOWNLOAD_DATA = "INSERT INTO Client (USERNAME, EMAIL, PASSWORD) VALUES (?,?,?)";

    public void addData(String username, String email, String password) throws SQLException{

        try(Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(DOWNLOAD_DATA)){

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);

            int row = preparedStatement.executeUpdate();

            System.out.println(row);
        } catch (SQLException e) {
            System.err.format("SQL State %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public boolean validate(String email, String password) throws SQLException{
        try(Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_QUERY)){


            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            System.out.println(preparedStatement);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()){
                return true;
            }

        } catch (SQLException e) {
            System.err.format("SQL State %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void addDataOwner(String email, String username, String password, String phone, int balance, String country, String bank, String full_name) throws SQLException{
        try(Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(DOWNLOAD_DATA_OWNER)){

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);
            preparedStatement.setString(4, phone);
            preparedStatement.setInt(5, balance);
            preparedStatement.setString(6, country);
            preparedStatement.setString(7, bank);
            preparedStatement.setString(8, full_name);


            int row = preparedStatement.executeUpdate();

            System.out.println(row);
        } catch (SQLException e) {
            System.err.format("SQL State %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
