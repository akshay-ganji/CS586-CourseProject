package com.iit.edu.Accounts;

import com.iit.edu.AbstractFactory.AbstractFactory;
import com.iit.edu.Constants;
import com.iit.edu.MDAEFSM.MDAEFSM;
import com.iit.edu.DataStore.*;
import com.iit.edu.OutputProcessor.OutputProcessor;

/*
    Implementation class for Account2 related operations
 */

public class Account2 {
    final MDAEFSM mdaEfsm ;                                         //Pointer to MDAEFSM object
    final DataStore dataStore;                                      //Pointer to DataStore object
    final OutputProcessor outputProcessor = new OutputProcessor();  //Pointer to OutputProcessor object

    public Account2(AbstractFactory abstractFactory) {
        outputProcessor.initializeOutputProcessor(abstractFactory);     //Initialize Outputprocessor
        this.mdaEfsm = new MDAEFSM(outputProcessor);                    //Set MDAEFSM
        this.dataStore = abstractFactory.CreateDataStore();             //Create DataStore (DataStore2)
    }

    //Method invoked when OPEN operation is called from the driver for Account-2
    public void OPEN(int p,int y,float a)
    {
        ((DataStore2) dataStore).temp_p = p;   //Set pin to temp_p
        ((DataStore2) dataStore).temp_y = y;   //Set login id to temp_y
        ((DataStore2) dataStore).temp_a = a;   //Set account balance to temp_a
        mdaEfsm.Open();                        //Invoke MDAEFSM Open operation
        mdaEfsm.getCurrentState();             //Return current state to Driver
    }

    //Method invoked when login operation is called from the driver for Account-2
    public void LOGIN(int y)
    {
        if(y == ((DataStore2) dataStore).getId()){      //Compare the ID entered by user and ID present in datastore
            mdaEfsm.Login();                            //Invoke MDAEFSM Login operation
        } else {
            mdaEfsm.IncorrectLogin();                   //Invoke MDAEFSM IncorrectLogin operation
        }
        mdaEfsm.getCurrentState();              //Return current state to Driver
    }

    //Method invoked when pin operation is called from the driver for Account-2
    public void PIN(int x )
    {
        if( x == ((DataStore2) dataStore).getPin()) {               //Compare the pin entered by user and ID present in datastore
            mdaEfsm.CorrectPinAboveMin();                           //If then invoke MDAEFSM CorrectPinAboveMin operation
        } else {
            mdaEfsm.IncorrectPin(Constants.ACCOUNT2_INCORRECT_PIN_ATTEMPTS);    //If Pin entered is incorrect then invoke MDAEFSM IncorrectPin operation
        }
        mdaEfsm.getCurrentState();              //Return current state to Driver
    }

    //Method invoked when deposit operation is called from the driver for Account-2
    public void DEPOSIT(float d)
    {
        ((DataStore2) dataStore).temp_d = d;    //Store the deposit amount in temporary variable
        mdaEfsm.Deposit();                      //Invoke MDAEFSM Deposit
        mdaEfsm.getCurrentState();              //Return current state to Driver
    }

    //Method invoked when balance operation is called from the driver for Account-2
    public void BALANCE()
    {
        mdaEfsm.Balance();                      //Invoke MDAEFSM Balance
        mdaEfsm.getCurrentState();              //Return current state to Driver
    }

    //Method invoked when logout operation is called from the driver for Account-2
    public void LOGOUT()
    {
        mdaEfsm.Logout();                        //Invoke MDAEFSM Logout
        mdaEfsm.getCurrentState();              //Return current state to Driver
    }

    //Method invoked when withdraw operation is called from the driver for Account-2
    public void WITHDRAW(float w)
    {
        ((DataStore2) dataStore).temp_w = w;            //Store the withdraw amount in temporary variable
        if( ((DataStore2) dataStore).getBalance() > Constants.MIN_ACCOUNT2_BALANCE )    //Check Account balance after amount withdraw
        {
            mdaEfsm.Withdraw();                         //Invoke MDAEFSM Withdraw
            mdaEfsm.AboveMinBalance();                  //Invoke MDAEFSM AboveMinBalance if balance >$0
        }
        else
        {
            mdaEfsm.NoFunds();                  //Invoke MDAEFSM NoFunds
        }
        mdaEfsm.getCurrentState();              //Return current state to Driver
    }

    //Method invoked when suspend operation is called from the driver for Account-2
    public void suspend() {
        mdaEfsm.Suspend();                      //Invoke MDAEFSM Suspend
        mdaEfsm.getCurrentState();              //Return current state to Driver
    }

    //Method invoked when activate operation is called from the driver for Account-2
    public void activate() {
        mdaEfsm.Activate();                      //Invoke MDAEFSM Activate
        mdaEfsm.getCurrentState();              //Return current state to Driver
    }

    //Method invoked when close operation is called from the driver for Account-2
    public void close() {
        mdaEfsm.Close();                        //Invoke MDAEFSM Close
        mdaEfsm.getCurrentState();              //Return current state to Driver
    }
}
