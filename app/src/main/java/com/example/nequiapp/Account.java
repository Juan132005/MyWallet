package com.example.nequiapp;

import androidx.annotation.NonNull;

public class Account {

    private String name;
    private String typeAccount;

    private Double currentValue;
    private String imageUrl;
    public String getName() {
        return name;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public Double getCurrentValue() {
        return currentValue;
    }



    public String getImageUrl() {
        return imageUrl;
    }
    public Account(String name, String typeAccount,  Double currentValue,String imageUrl) {
        this.name = name;
        this.typeAccount = typeAccount;
        this.currentValue = currentValue;
        this.imageUrl = imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public void setCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
    }
}
