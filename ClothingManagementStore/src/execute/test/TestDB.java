package execute.test;

import database.connect.*;
import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;
import model.entity.*;

public class TestDB {
    public static void main(String[] args) {
        Date d = new Date(2012, 3, 14);
        Account acc = new Account("qưe", "123", d, 
                new City(0, "An Giang"), "Manager", true);
        int a = AccountDAO.setOBJ().Add(acc);
        System.out.println(a);
        
    }
}
