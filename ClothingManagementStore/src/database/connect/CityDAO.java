package database.connect;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.entity.Account;
import model.entity.City;

public class CityDAO implements DAOInterface<City>, DAOSearch<City>{

    public static CityDAO setOBJ() {
        return new CityDAO();
    }
    @Override
    public int Add(City t) {
        int ketQua = 0;
        try {
            Connection c = DBConnect.GetConnect();
            String sql = """
                         INSERT INTO City (CityID, CityName)
                         VALUES (?,?)""";
            
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, t.getCityID());
            ps.setString(2, t.getCityName());
            ketQua = ps.executeUpdate();
            DBConnect.CloseConnect(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int Delete(City t) {
        int ketQua = 0;
        try {
            Connection c = DBConnect.GetConnect();
            String sql = """
                         DELETE FROM City
                         WHERE CityID=?""";
            
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, t.getCityID());
            ketQua = ps.executeUpdate();
            DBConnect.CloseConnect(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int Update(City t) {
        int ketQua = 0;
        try {
            Connection c = DBConnect.GetConnect();
            String sql = """
                         UPDATE City
                         SET  CityName=?
                         WHERE CityID=?""";
            
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, t.getCityName());
            ps.setInt(2, t.getCityID());
            ketQua = ps.executeUpdate();
            DBConnect.CloseConnect(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<City> AllSelect() {
        ArrayList<City> ketQua = new ArrayList<>();
        try {
            Connection c = DBConnect.GetConnect();         
            String sql = "SELECT * FROM City";
            PreparedStatement ps = c.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();         
            while(rs.next()) {
                int cityID = rs.getInt("CityID");
                String cityName = rs.getString("CityName");
                City city = new City(cityID, cityName);
                ketQua.add(city);
            }
            DBConnect.CloseConnect(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public City Select(City t) {
        City ketQua = null;
        try {
            Connection c = DBConnect.GetConnect();  
            String sql = """
                         SELECT * FROM City
                         WHERE CityName=?""";          
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, t.getCityName());
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                int cityID = rs.getInt("CityID");
                String cityName = rs.getString("CityName");
                ketQua = new City(cityID, cityName);
            }
            DBConnect.CloseConnect(c);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<Account> Selects(City t) {
        return null;
    }
    
}
