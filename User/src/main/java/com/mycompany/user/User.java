package com.mycompany.user;
public class User {
    private String userId;
    private String email;

    public User(String userId, String email) {
        this.userId = userId;
        this.email = email;
    }


    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public void updateEmail(String newEmail) { this.email = newEmail; }
}