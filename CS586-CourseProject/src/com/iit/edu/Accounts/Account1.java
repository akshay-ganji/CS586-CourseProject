package com.iit.edu.Accounts;

import com.iit.edu.AbstractFactory.AbstractFactory;
import com.iit.edu.Constants;
import com.iit.edu.MDAEFSM.MDAEFSM;
import com.iit.edu.DataStore.*;
import com.iit.edu.OutputProcessor.OutputProcessor;
/*
    Implementation class for Account1 related operations
 */

public class Account1 {

    MDAEFSM mdaEfsm ;                                           //Pointer to MDAEFSM object
    DataStore dataStore;                                        //Pointer to DataStore object
    OutputProcessor outputProcessor = new OutputProcessor();    //Pointer to OutputProcessor object

    public Account1(AbstractFactory abstractFactory) {
        outputProcessor.initializeOutputProcessor(abstractFactory);     //Initialize Outputprocessor
        this.mdaEfsm = new MDAEFSM(outputProcessor);                    //Set MDAEFSM
        this.dataStore = abstractFactory.CreateDataStore();             //Create DataStore (DataStore1)
    }

    //Method invoked when open operation is called from the driver for Account-1
    public void open(int p, int y, int a) {
        ((DataStore1) dataStore).temp_p = p;            //Set pin to temp_p
        ((DataStore1) dataStore).temp_y = y;            //Set login id to temp_y
        ((DataStore1) dataStore).temp_a = a;            //Set account balance to temp_a
        mdaEfsm.Open();                                 //Invoke MDAEFSM Open operation
        mdaEfsm.getCurrentState();                      //Return current state to Driver
    }

    //Method invoked when login operation is called from the driver for Account-1
    public void login(int y) {                                  
        if (y == ((DataStore1) dataStore).getId()) {    //Compare the ID entered by user and ID present in datastore
            mdaEfsm.Login();                            //Invoke MDAEFSM Login operation
        } else {
            mdaEfsm.IncorrectLogin();                   //Invoke MDAEFSM IncorrectLogin operation
        }
        mdaEfsm.getCurrentState();                      //Return current state to Driver
    }

    //Method invoked when pin operation is called from the driver for Account-1
    public void pin(int x) {                                    
        if (x ==  ((DataStore1) dataStore).getPin()) {              //Compare the pin entered by user and ID present in datastore
            if ( ((DataStore1) dataStore).getBalance() > 100)       //Check if the balance is greater than the Min balance requirement for Account-1
                mdaEfsm.CorrectPinAboveMin();                       //If balance>100 then invoke MDAEFSM CorrectPinAboveMin operation
            else
                mdaEfsm.CorrectPinBelowMin();                       //If balance<=100 then invoke MDAEFSM CorrectPinBelowMin operation
        } else {
            mdaEfsm.IncorrectPin(Constants.ACCOUNT1_INCORRECT_PIN_ATTEMPTS);       //If Pin entered is incorrect then invoke MDAEFSM IncorrectPin operation
        }
        mdaEfsm.getCurrentState();                                  //Return current state to Driver 
    }

    //Method invoked when deposit operation is called from the driver for Account-1
    public void deposit(int d) {                                
        ((DataStore1) dataStore).temp_d = d;                        //Store the deposit amount in temporary variable
        mdaEfsm.Deposit();                                          //Invoke MDAEFSM Deposit

        if (((DataStore1) dataStore).getBalance() > Constants.MIN_ACCOUNT1_BALANCE) {   //Check account balance
            mdaEfsm.AboveMinBalance();                                                  //If balance after deposit is above min balance invoke MDAEFSM AboveMinBalance
        } else {
            mdaEfsm.BelowMinBalance();                                                  //If balance after deposit is below min balance invoke MDAEFSM BelowMinBalance
        }
        mdaEfsm.getCurrentState();                                  //Return current state to Driver   
    }

    //Method invoked when balance operation is called from the driver for Account-1
    public void balance() {
        mdaEfsm.Balance();                              //Invoke MDAEFSM Balance
        mdaEfsm.getCurrentState();                      //Return current state to Driver
    }

    //Method invoked when logout operation is called from the driver for Account-1
    public void logout() {
        mdaEfsm.Logout();                         //Invoke MDAEFSM Logout
        mdaEfsm.getCurrentState();                //Return current state to Driver
    }

    //Method invoked when withdraw operation is called from the driver for Account-1
    public void withdraw(int w) {                                           //Store the withdraw amount in temporary variable
        ((DataStore1) dataStore).temp_w = w;                                //Invoke MDAEFSM Withdraw
        mdaEfsm.Withdraw();
        if (((DataStore1) dataStore).getBalance() > Constants.MIN_ACCOUNT1_BALANCE) {       //Check Account balance after amount withdraw
            mdaEfsm.AboveMinBalance();                                      //Invoke MDAEFSM AboveMinBalance if balance >$100
        } else {
            mdaEfsm.WithdrawBelowMinBalance();                              //Invoke MDAEFSM WithdrawBelowMinBalance if balance <=$100
        }
        mdaEfsm.getCurrentState();              //Return current state to Driver
    }

    //Method invoked when lock operation is called from the driver for Account-1
    public void lock(int x) {
        if (x == ((DataStore1) dataStore).getPin()) {          //Check if the lock pin matches the pin in datastore
            mdaEfsm.Lock();                                    //Invoke MDAEFSM Lock if pin matches
        } else {
            mdaEfsm.IncorrectLock();                           //Invoke MDAEFSM IncorrectLock if pin does not match
        }
        mdaEfsm.getCurrentState();              //Return current state to Driver
    }

    //Method invoked when unlock operation is called from the driver for Account-1
    public void unlock(int x) {
        if (x == ((DataStore1) dataStore).getPin()) {       //Check if the unlock pin matches the pin in datastore
            mdaEfsm.Unlock();                               //Invoke MDAEFSM Unlock if pin matches

            if (((DataStore1) dataStore).getBalance() > Constants.MIN_ACCOUNT1_BALANCE) {       //Check account balance
                mdaEfsm.AboveMinBalance();                  //Invoke MDAEFSM AboveMinBalance if balance >$100
            } else {
                mdaEfsm.BelowMinBalance();                 //Invoke MDAEFSM BelowMinBalance if balance <=$100
            }
        } else {
            mdaEfsm.IncorrectUnlock();         //Invoke MDAEFSM IncorrectUnlock if pin does not match
        }
        mdaEfsm.getCurrentState();           //Return current state to Driver
    }
}