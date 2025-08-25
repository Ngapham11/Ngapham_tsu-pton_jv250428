package util;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class ConnectionDB {
        private static final String DRIVER="com.mysql.cj.jdbc.Driver";
        private static final String URl="jdbc:mysql://localhost:3306/db_workshop";
        private static final String USERNAME="root";
        private static final String PASSWORD="12345678";
        public static Connection openConnection(){
            Connection con=null;
            try {
                Class.forName(DRIVER);
                con= DriverManager.getConnection(URl,USERNAME,PASSWORD);
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
            return con;
        }
        public static void closeConnection(Connection con, CallableStatement callableStatement){
            if (con!=null){
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }if (callableStatement!=null){
                try {
                    callableStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


