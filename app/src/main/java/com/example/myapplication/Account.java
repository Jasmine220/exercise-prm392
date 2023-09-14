package com.example.myapplication;

import java.util.ArrayList;

public class Account {

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

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

    private String firstname;
    private String surname;
    private String phoneOrEmail;
    private String password;
    public static ArrayList<Account> accounts = new ArrayList<>();

    public Account() {
    }

    public Account (String firstname, String surname, String phoneOrEmail, String password){
        this.firstname = firstname;
        this.surname = surname;
        this.phoneOrEmail = phoneOrEmail;
        this.password = password;
    }



}
