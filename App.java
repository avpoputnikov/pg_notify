package lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/tdb?currentSchema=public";
        Connection conn = DriverManager.getConnection(url,"postgres","postgres");
        Listener listener = new Listener(conn);
        listener.start();
    }
}