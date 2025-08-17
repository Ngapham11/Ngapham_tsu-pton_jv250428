package Model;

import database.ConnectionDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        try { Connection con= ConnectionDB.openConnection();
            Statement st=con.createStatement();
            String st=""
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
