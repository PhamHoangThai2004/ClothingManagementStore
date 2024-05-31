package database.connect;

import java.util.ArrayList;
import model.entity.Account;

public interface DAOSearch<T> {
    public T Select(T t);
    
    public ArrayList<Account> Selects(T t);
}
