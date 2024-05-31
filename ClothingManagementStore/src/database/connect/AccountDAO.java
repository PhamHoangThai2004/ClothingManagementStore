package database.connect;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import model.entity.Account;
import model.entity.City;

public class AccountDAO implements DAOInterface<Account>, DAOSearch<Account>{
    
    public static AccountDAO setOBJ() {
        return new AccountDAO();
    }
    
    @Override
    public int Add(Account t) {
        int ketQua = 0;
        try {
            Connection c = DBConnect.GetConnect();
            String sql = """
                         INSERT INTO Account (UserName, Password, CreationDate, Location, Authority, Status)
                         VALUES (?,?,?,?,?,?)""";
            
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, t.getUserName());
            ps.setString(2, t.getPassword());
            ps.setDate(3, t.getCreationDate());
            ps.setInt(4, t.getLocation().getCityID());
            ps.setString(5, t.getAuthority());
            ps.setBoolean(6, t.isStatus()); 
            System.out.println(sql);
            ketQua = ps.executeUpdate();
            DBConnect.CloseConnect(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int Delete(Account t) {
        int ketQua = 0;
        try {
            Connection c = DBConnect.GetConnect();
            String sql = """
                         DELETE FROM Account
                         WHERE UserName=?""";
            
            PreparedStatement ps = c.prepareStatement(sql);
            System.out.println(sql);
            ps.setString(1, t.getUserName());
            ketQua = ps.executeUpdate();
            DBConnect.CloseConnect(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int Update(Account t) {
        int ketQua = 0;
        try {
            Connection c = DBConnect.GetConnect();
            String sql = """
                         UPDATE Account
                         SET  Password=?, CreationDate="?, Location=?, Authority=?, Status=?
                         WHERE UserName=?""";
            
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, t.getPassword());
            ps.setDate(2, t.getCreationDate());
            ps.setInt(3, t.getLocation().getCityID());
            ps.setString(4, t.getAuthority());
            ps.setBoolean(5, t.isStatus());
            ps.setString(6, t.getUserName());
            System.out.println(sql);
            ketQua = ps.executeUpdate();
            DBConnect.CloseConnect(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<Account> AllSelect() {
        ArrayList<Account> ketQua = new ArrayList<>();
        try {
            Connection c = DBConnect.GetConnect();         
            String sql = "SELECT * FROM Account";
            PreparedStatement ps = c.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();         
            while(rs.next()) {
                String userID = rs.getString("UserName");
                String passWord = rs.getString("Password");
                Date creationDate = rs.getDate("CreationDate");
                int location = rs.getInt("Location");
                String authority = rs.getString("Authority");
                boolean status = rs.getBoolean("Status");
                
                City city = new City(location, "");
                Account account = new Account(userID, passWord, creationDate,
                        CityDAO.setOBJ().Select(city),
                        authority, status);
                ketQua.add(account);
            }
            DBConnect.CloseConnect(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public Account Select(Account t) {
        Account ketQua = null;
        try {
            Connection c = DBConnect.GetConnect();  
            String sql = """
                         SELECT * FROM Account
                         WHERE UserName=? AND Password=? AND Status=1""";          
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, t.getUserName());
            ps.setString(2, t.getPassword());
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                String userID = rs.getString("UserName");
                String passWord = rs.getString("Password");
                Date creationDate = rs.getDate("CreationDate");
                int location = rs.getInt("Location");
                String authority = rs.getString("Authority");
                boolean status = rs.getBoolean("Status");
                
                City city = new City(location, "");
                ketQua = new Account(userID, passWord, creationDate,
                        CityDAO.setOBJ().Select(city),
                        authority, status);
            }
            DBConnect.CloseConnect(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<Account> Selects(Account t) {
        return null;
    }
    
}
