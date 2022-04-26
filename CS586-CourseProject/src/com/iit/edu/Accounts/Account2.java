package com.iit.edu.Accounts;

import com.iit.edu.Constants;
import com.iit.edu.MDAEFSM.MDAEFSM;
import com.iit.edu.DataStore.*;

public class Account2 {

    MDAEFSM mdaEfsm;
    DataStore2 dataStore2;

    public Account2(MDAEFSM mdaEfsm, DataStore2 dataStore2)
    {
        this.mdaEfsm = mdaEfsm;
        this.dataStore2 = dataStore2;
    }

    public void OPEN(int p,int y,float a)
    {
        dataStore2.temp_p = p;
        dataStore2.temp_y = y;
        dataStore2.temp_a = a;
        mdaEfsm.Open();
        mdaEfsm.getCurrentState();
    }
    public void LOGIN(int y)
    {
        if(y == dataStore2.getId()){
            mdaEfsm.Login();
        } else {
            mdaEfsm.IncorrectLogin();
        }
        mdaEfsm.getCurrentState();
    }

    public void PIN(int x )
    {
        if( x == dataStore2.getPin()) {
            mdaEfsm.CorrectPinAboveMin();
        } else {
            mdaEfsm.IncorrectPin(Constants.ACCOUNT2_INCORRECT_PIN_ATTEMPTS);
        }
        mdaEfsm.getCurrentState();
    }

    public void DEPOSIT(float d)
    {
        dataStore2.temp_d = d;
        mdaEfsm.Deposit();
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
        dataStore2.temp_w = w;
        if( dataStore2.getBalance() > Constants.MIN_ACCOUNT2_BALANCE )
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
