package com.iit.edu.DataStore;

public class DataStore2 extends DataStore {
    public float temp_a;
    public int temp_y;
    public int temp_p;
    public float temp_d;
    public float temp_w;
    private int pin;
    private float balance;
    private int id;

    public int getPin() {
        return pin;
    }

    public void setPin() {
        this.pin = this.temp_p;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance() {
        this.balance = this.temp_a;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = this.temp_y;
    }

    public void DepositToAccount() {
        this.balance = this.balance + this.temp_d;
    }

    public void WithdrawFromAccount() {
        this.balance = this.balance - this.temp_w;
    }
}
