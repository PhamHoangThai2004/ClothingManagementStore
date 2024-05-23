package execute.test;

import database.connect.*;
import java.sql.Connection;
import java.util.ArrayList;
import model.entity.*;

public class TestDB {
    public static void main(String[] args) {
        ArrayList<Account> list = AccountDAO.setOBJ().AllSelect();
        for (Account a : list) {
            System.out.println(a);
        }
        
    }
}
