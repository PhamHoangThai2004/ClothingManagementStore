package database.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    private static Connection c = null;
    
    public static Connection GetConnect() {
        String userName = "root";
        String passWord = "";
        String url = "jdbc:mySQL://localhost:3306/CMSDATA";
        
        try {
            c = DriverManager.getConnection(url, userName, passWord);
            System.out.println("Kết nối thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }
    
    public static void CloseConnect(Connection c) {
        try {
            if(c != null)  c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
