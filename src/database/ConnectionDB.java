package database;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
public class ConnectionDB {
    private static final String DRIVER="com.mysql.cj.jdbc.Driver";
    private static final String URL="jdbc:mysql://localhost:3306/ss16_bai1?createDatabaseIfNotExist=true";
    private static final String USERNAME="root";
    private static final String PASSWORD="12345678";
    public static Connection openConnection(){
       Connection con;
        try {
            Class.forName(DRIVER);
            con= DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }return con;
    }
    public  static void closeConnection(Connection con){
        try {
            if (con!=null){
                con.close();
            }
        }catch (SQLException e){
            throw new RuntimeException();
        }
    }
}
