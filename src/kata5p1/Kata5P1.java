package kata5p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Kata5P1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        String UrlConnection ="jdbc:sqlite:KATA5.DB";
        Connection connection = DriverManager.getConnection(UrlConnection);
        
        Statement st = connection.createStatement();
        String query ="CREATE TABLE IF NOT EXISTS MAIL ("
                + "'Id'	INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "'Mail' TEXT NOT NULL"
                +    ");";
        st.execute(query);
        
    }
    
}
