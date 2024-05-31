package model.entity;

import java.sql.Date;

public class Account {
    private String userName;
    private String password;
    private Date creationDate;
    private City location;
    private String authority;
    private boolean status;

    public Account() {
    }

    public Account(String userName, String password, Date creationDate,
            City location, String authority, boolean status) {
        this.userName = userName;
        this.password = password;
        this.creationDate = creationDate;
        this.location = location;
        this.authority = authority;
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public City getLocation() {
        return location;
    }

    public void setLocation(City location) {
        this.location = location;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Account{" + "userName=" + userName + ", password=" + password +
                ", creationDate=" + creationDate + ", location=" + location + 
                ", authority=" + authority + ", status=" + status + '}';
    }
}
