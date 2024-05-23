package database.connect;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import model.entity.Account;
import model.entity.City;

public class AccountDAO implements AllDAO<Account>{
    
    public static AccountDAO setOBJ() {
        return new AccountDAO();
    }
    
    @Override
    public int Add(Account t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int Delete(Account t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int Update(Account t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Account> AllSelect() {
        ArrayList<Account> ketQua = new ArrayList<>();
        try {
            Connection c = DBConnect.GetConnect();         
            String sql = "SELECT * FROM Account";
            PreparedStatement pst = c.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();         
            while(rs.next()) {
                String userID = rs.getString("UserID");
                String passWord = rs.getString("PassWord");
                Date creationDate = rs.getDate("CreationDate");
                int location = rs.getInt("Location");
                String authority = rs.getString("Authority");
                boolean status = rs.getBoolean("Status");
                
                City city = new City(location, "");
                Account account = new Account(userID, passWord, creationDate,
                        CityDAO.setOBJ().SelectByID(city),
                        authority, status);
                ketQua.add(account);
            }
            DBConnect.CloseConnect(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ketQua;
    }
    
}
