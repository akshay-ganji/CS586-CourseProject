package com.iit.edu.DataStore;

import com.iit.edu.Constants;

/*
    Implementation class of DataStore for the utilization of Account1 operations.
 */

public class DataStore1 extends DataStore{

    public int temp_p;          //Temp variable for pin
    public int temp_y;          //Temp variable for ID
    public int temp_a;          //Temp variable for account balance
    public int temp_d;          //Temp variable for deposit
    public int temp_w;          //Temp variable for withdraw
    private int balance;        //Private variable for balance for Account1
    private int pin;            //Private variable for pin for Account1
    private int id;             //Private variable for id for Account1

    //Getters and setters are implemented only for private variables
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

    //Deposit amount to account by adding the balance with the temp_d value   
    public void DepositToAccount() {
        this.balance = this.balance + this.temp_d;
    }

    //Withdraw amount from account by subtracting the temp_w value from the balance 
    public void WithdrawFromAccount() {
        this.balance = this.balance - this.temp_w;
    }

    //Applies penalty when the minimum balance ($100) criteria is violated for Account 1
    public int applyPenalty() {
        this.balance = this.balance - Constants.ACCOUNT1_PENALTY;
        return this.balance;
    }
}
