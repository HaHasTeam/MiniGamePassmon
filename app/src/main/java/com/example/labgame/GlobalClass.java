package com.example.labgame;

import java.util.ArrayList;

public class GlobalClass {

    public ArrayList<Account> accountArrayList;
    public Account currentUser;
    private static GlobalClass instance;

    private GlobalClass() {
        if (accountArrayList == null) {
            accountArrayList = new ArrayList<>();
            accountArrayList.add(new Account("Linh", "12345678", 100));
            accountArrayList.add(new Account("Minh", "12345678", 100));
            accountArrayList.add(new Account("Quang", "12345678", 100));
        }
        if (currentUser == null){
            currentUser = new Account();
        }
    }

    public static synchronized GlobalClass getInstance() {
        if (instance == null) {
            instance = new GlobalClass();
        }
        return instance;
    }
}
