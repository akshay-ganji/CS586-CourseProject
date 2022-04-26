package com.iit.edu.Accounts;

import com.iit.edu.Constants;
import com.iit.edu.MDAEFSM.MDAEFSM;
import com.iit.edu.DataStore.*;

public class Account1 {

    MDAEFSM mdaEfsm ;
    DataStore1 dataStore1;                                      

    public Account1(MDAEFSM mdaEfsm, DataStore1 dataStore1) {   
        this.mdaEfsm = mdaEfsm;
        this.dataStore1 = dataStore1;
    }

    public void open(int p, int y, int a) {                     
        dataStore1.temp_p = p;
        dataStore1.temp_y = y;
        dataStore1.temp_a = a;
        mdaEfsm.Open();                                         
        mdaEfsm.getCurrentState();
    }

    public void login(int y) {                                  
        if (y == dataStore1.getId()) {
            mdaEfsm.Login();                                    
        } else {
            mdaEfsm.IncorrectLogin();                           
        }
        mdaEfsm.getCurrentState();
    }

    public void pin(int x) {                                    
        if (x ==  dataStore1.getPin()) {
            if ( dataStore1.getBalance() > 100)
                mdaEfsm.CorrectPinAboveMin();
            else
                mdaEfsm.CorrectPinBelowMin();
        } else {
            mdaEfsm.IncorrectPin(Constants.ACCOUNT1_INCORRECT_PIN_ATTEMPTS);
        }
        mdaEfsm.getCurrentState();
    }

    public void deposit(int d) {                                
        dataStore1.temp_d = d;
        mdaEfsm.Deposit();

        if (dataStore1.getBalance() > Constants.MIN_ACCOUNT1_BALANCE) {
            mdaEfsm.AboveMinBalance();
        } else {
            mdaEfsm.BelowMinBalance();
        }
        mdaEfsm.getCurrentState();
    }

    public void balance() {
        mdaEfsm.Balance();
        mdaEfsm.getCurrentState();
    }

    public void logout() {
        mdaEfsm.Logout();
        mdaEfsm.getCurrentState();
    }

    public void withdraw(int w) {
        dataStore1.temp_w = w;
        mdaEfsm.Withdraw();
        if (dataStore1.getBalance() > Constants.MIN_ACCOUNT1_BALANCE) {
            mdaEfsm.AboveMinBalance();
        } else {
            mdaEfsm.WithdrawBelowMinBalance();
        }
        mdaEfsm.getCurrentState();
    }

    public void lock(int x) {
        if (x == dataStore1.getPin()) {
            mdaEfsm.Lock();
        } else {
            mdaEfsm.IncorrectLock();
        }
        mdaEfsm.getCurrentState();
    }

    public void unlock(int x) {
        if (x == dataStore1.getPin()) {
            mdaEfsm.Unlock();

            if ( dataStore1.getBalance() > Constants.MIN_ACCOUNT1_BALANCE) {
                mdaEfsm.AboveMinBalance();
            } else {
                mdaEfsm.BelowMinBalance();
            }
        } else {
            mdaEfsm.IncorrectUnlock();
        }
        mdaEfsm.getCurrentState();
    }
}