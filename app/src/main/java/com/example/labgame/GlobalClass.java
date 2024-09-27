package com.example.labgame;

import java.util.ArrayList;

public class GlobalClass {

    public ArrayList<Account> accountArrayList;
    public Account currentUser;
    private static GlobalClass instance;

    private GlobalClass() {
        if (accountArrayList == null) {
            accountArrayList = new ArrayList<>();
            accountArrayList.add(new Account("Sample", "12345678", 100));
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
