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
        String query ="SELECT * FROM PEOPLE";
        ResultSet rs = st.executeQuery(query);
        
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + 
                    rs.getString(3)+ " " + rs.getString(4));
        }
        
    }
    
}
