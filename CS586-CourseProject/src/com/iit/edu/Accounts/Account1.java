package com.iit.edu.Accounts;

import com.iit.edu.AbstractFactory.AbstractFactory;
import com.iit.edu.Constants;
import com.iit.edu.MDAEFSM.MDAEFSM;
import com.iit.edu.DataStore.*;
import com.iit.edu.OutputProcessor.OutputProcessor;

public class Account1 {

    MDAEFSM mdaEfsm ;
    DataStore dataStore;
    OutputProcessor outputProcessor = new OutputProcessor();

    public Account1(AbstractFactory abstractFactory) {
        outputProcessor.initializeOutputProcessor(abstractFactory);
        this.mdaEfsm = new MDAEFSM(outputProcessor);
        this.dataStore = abstractFactory.getDataStore();
    }

    public void open(int p, int y, int a) {
        ((DataStore1) dataStore).temp_p = p;
        ((DataStore1) dataStore).temp_y = y;
        ((DataStore1) dataStore).temp_a = a;
        mdaEfsm.Open();                                         
        mdaEfsm.getCurrentState();
    }

    public void login(int y) {                                  
        if (y == ((DataStore1) dataStore).getId()) {
            mdaEfsm.Login();                                    
        } else {
            mdaEfsm.IncorrectLogin();                           
        }
        mdaEfsm.getCurrentState();
    }

    public void pin(int x) {                                    
        if (x ==  ((DataStore1) dataStore).getPin()) {
            if ( ((DataStore1) dataStore).getBalance() > 100)
                mdaEfsm.CorrectPinAboveMin();
            else
                mdaEfsm.CorrectPinBelowMin();
        } else {
            mdaEfsm.IncorrectPin(Constants.ACCOUNT1_INCORRECT_PIN_ATTEMPTS);
        }
        mdaEfsm.getCurrentState();
    }

    public void deposit(int d) {                                
        ((DataStore1) dataStore).temp_d = d;
        mdaEfsm.Deposit();

        if (((DataStore1) dataStore).getBalance() > Constants.MIN_ACCOUNT1_BALANCE) {
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
        ((DataStore1) dataStore).temp_w = w;
        mdaEfsm.Withdraw();
        if (((DataStore1) dataStore).getBalance() > Constants.MIN_ACCOUNT1_BALANCE) {
            mdaEfsm.AboveMinBalance();
        } else {
            mdaEfsm.WithdrawBelowMinBalance();
        }
        mdaEfsm.getCurrentState();
    }

    public void lock(int x) {
        if (x == ((DataStore1) dataStore).getPin()) {
            mdaEfsm.Lock();
        } else {
            mdaEfsm.IncorrectLock();
        }
        mdaEfsm.getCurrentState();
    }

    public void unlock(int x) {
        if (x == ((DataStore1) dataStore).getPin()) {
            mdaEfsm.Unlock();

            if (((DataStore1) dataStore).getBalance() > Constants.MIN_ACCOUNT1_BALANCE) {
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