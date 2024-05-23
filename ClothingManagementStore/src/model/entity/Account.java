package model.entity;

import java.sql.Date;

public class Account {
    private String userID;
    private String passWord;
    private Date creationDate;
    private City location;
    private String authority;
    private boolean status;

    public Account() {
    }

    public Account(String userID, String passWord, Date creationDate, 
            City location, String Authority, boolean status) {
        this.userID = userID;
        this.passWord = passWord;
        this.creationDate = creationDate;
        this.location = location;
        this.authority = Authority;
        this.status = status;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
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

    public void setAuthority(String Authority) {
        this.authority = Authority;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Account{" + "userID=" + userID + ", passWord=" + passWord +
                ", creationDate=" + creationDate + ", location=" + location +
                ", Authority=" + authority + ", status=" + status + '}';
    }
}
