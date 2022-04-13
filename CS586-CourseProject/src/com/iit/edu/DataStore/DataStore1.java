package com.iit.edu.DataStore;

import com.iit.edu.Constants;

public class DataStore1 extends DataStore{

    public int temp_p;
    public int temp_y;
    public int temp_a;
    public int temp_d;
    public int temp_w;
    private int balance;
    private int pin;
    private int id;


    public void setBalance() {
        this.balance = this.temp_a;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setPin() { this.pin = this.temp_p; }

    public int getPin() { return this.pin; }

    public void setId() { this.id = this.temp_y; }

    public int getId() {
        return this.id;
    }

    public void DepositToAccount() {
        this.balance = this.balance + this.temp_d;
    }

    public void WithdrawFromAccount() {
        this.balance = this.balance - this.temp_w;
    }

    public int applyPenalty() {
        this.balance = this.balance - Constants.ACCOUNT1_PENALTY;
        return this.balance;
    }
}
