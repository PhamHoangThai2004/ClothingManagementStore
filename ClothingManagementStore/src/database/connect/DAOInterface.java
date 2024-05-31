package database.connect;

import java.util.ArrayList;

public interface DAOInterface<T> {
    public int Add(T t);
    
    public int Delete(T t);
    
    public int Update(T t);
    
    public ArrayList<T> AllSelect();
}
