package com.example.myapplication;

import java.util.ArrayList;

public class Account {


    public String getPhoneOrEmail() {
        return phoneOrEmail;
    }

    public void setPhoneOrEmail(String phoneOrEmail) {
        this.phoneOrEmail = phoneOrEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String phoneOrEmail;
    private String password;
    public static ArrayList<Account> accounts;

    public Account() {
    }

    public Account (String phoneOrEmail, String password){
        this.phoneOrEmail = phoneOrEmail;
        this.password = password;
    }



}
