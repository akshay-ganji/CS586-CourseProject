package com.iit.edu.DataStore;

/*
    Implementation class of DataStore for the utilization of Account2 operations.
 */

public class DataStore2 extends DataStore {
    public float temp_a;        //Temp variable for pin
    public int temp_y;          //Temp variable for ID
    public int temp_p;          //Temp variable for account balance
    public float temp_d;        //Temp variable for deposit
    public float temp_w;        //Temp variable for withdraw
    private int pin;            //Private variable for balance for Account2
    private float balance;      //Private variable for pin for Account2
    private int id;             //Private variable for id for Account2

    //Getters and setters are implemented only for private variables
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

    //Deposit amount to account by adding the balance with the temp_d value
    public void DepositToAccount() {
        this.balance = this.balance + this.temp_d;
    }

    //Withdraw amount from account by subtracting the temp_w value from the balance
    public void WithdrawFromAccount() {
        this.balance = this.balance - this.temp_w;
    }
}
