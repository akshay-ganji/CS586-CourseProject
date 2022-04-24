package com.iit.edu.Accounts;

import com.iit.edu.Constants;
import com.iit.edu.MDAEFSM.MDAEFSM;
import com.iit.edu.DataStore.*;

public class Account2 {

    MDAEFSM mdaEfsm;
    DataStore dataStore;

    public Account2(MDAEFSM mdaEfsm, DataStore dataStore)
    {
        this.mdaEfsm = mdaEfsm;
        this.dataStore = dataStore;
    }

    public void OPEN(int p,int y,float a)
    {
        ((DataStore2) dataStore).temp_p = p;
        ((DataStore2) dataStore).temp_y = y;
        ((DataStore2) dataStore).temp_a = a;
        mdaEfsm.Open();
        mdaEfsm.getCurrentState();
    }
    public void LOGIN(int y)
    {
        if(y == ((DataStore2) dataStore).getId() ){
            mdaEfsm.Login();
        } else {
            mdaEfsm.IncorrectLogin();
        }
        mdaEfsm.getCurrentState();
    }

    public void PIN(int x )
    {
        if( x == ((DataStore2) dataStore).getPin() ) {
            mdaEfsm.CorrectPinAboveMin();
        } else {
            mdaEfsm.IncorrectPin(Constants.ACCOUNT2_INCORRECT_PIN_ATTEMPTS);
        }
        mdaEfsm.getCurrentState();
    }

    public void DEPOSIT(float d)
    {
        ((DataStore2) dataStore).temp_d = d;
        mdaEfsm.Deposit();

        if( ((DataStore2) dataStore).getBalance() > Constants.MIN_ACCOUNT2_BALANCE)
        {
            mdaEfsm.AboveMinBalance();
        } else {
            mdaEfsm.BelowMinBalance();
        }
        mdaEfsm.getCurrentState();
    }

    public void BALANCE()
    {
        mdaEfsm.Balance();
        mdaEfsm.getCurrentState();
    }

    public void LOGOUT()
    {
        mdaEfsm.Logout();
        mdaEfsm.getCurrentState();
    }

    public void WITHDRAW(float w)
    {
        ((DataStore2) dataStore).temp_w = w;
        if( ((DataStore2) dataStore).getBalance() > Constants.MIN_ACCOUNT2_BALANCE )
        {
            mdaEfsm.Withdraw();
            mdaEfsm.AboveMinBalance();
        }
        else
        {
            mdaEfsm.NoFunds();
        }
        mdaEfsm.getCurrentState();
    }

    public void suspend() {
        mdaEfsm.Suspend();
        mdaEfsm.getCurrentState();
    }

    public void activate() {
        mdaEfsm.Activate();
        mdaEfsm.getCurrentState();
    }

    public void close() {
        mdaEfsm.Close();
        mdaEfsm.getCurrentState();
    }
}
