package com.example.passwordkeeper;


public class password {

    private String entiti;
    private String username;
    public password(String entiti, String username, String password, String description) {
        this.entiti = entiti;
        this.username = username;
        this.password = password;
        Description = description;
    }


    public password(String entiti, String username, String password, String description, int ID) {
        this.entiti = entiti;
        this.username = username;
        this.password = password;
        Description = description;
        this.ID = ID;
    }

    public String getEntiti() {
        return entiti;
    }
    public void setEntiti(String entiti) {
        this.entiti = entiti;
    }



    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }


    private String password;
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    private String Description;
    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        Description = description;
    }


    private int ID;
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
}




