package database.connect;

public interface DAOSearchByID<T> {
    public T SelectByID(T t);
}
