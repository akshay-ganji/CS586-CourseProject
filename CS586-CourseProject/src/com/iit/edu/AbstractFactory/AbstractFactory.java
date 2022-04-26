package com.iit.edu.AbstractFactory;

import com.iit.edu.DataStore.DataStore;
import com.iit.edu.OutputProcessor.Strategy.*;
import com.iit.edu.OutputProcessor.Strategy.DisplayBalance.*;
import com.iit.edu.OutputProcessor.Strategy.DisplayMenu.*;
import com.iit.edu.OutputProcessor.Strategy.MakeDeposit.*;
import com.iit.edu.OutputProcessor.Strategy.MakeWithdraw.*;
import com.iit.edu.OutputProcessor.Strategy.StoreData.*;

public interface AbstractFactory {
    public StoreData CreateStoreData();                     //Method to store data from user input
    public PromptForPin CreatePromptForPin();               //Method to prompt pin from user input
    public IncorrectIdMsg CreateIncorrectIdMessage();       //Method to display error message to user for incorrect login
    public IncorrectPinMsg CreateIncorrectPinMessage();     //Method to display error message to user for incorrect PIN
    public TooManyAttemptsMsg CreateTooManyAttemptsMsg();   //Method to display error message for too many incorrect attempts
    public DisplayMenu CreateDisplayMenu();                 //Method to display menu to user based on account type
    public DisplayBalance CreateDisplayBalance();           //Method to display account balance
    public MakeDeposit CreateMakeDeposit();                 //Method to make deposit for account type
    public MakeWithdraw CreateMakeWithdraw();               //Method to make withdraw for account type
    public Penalty CreatePenalty();                         //Method to make penalty for account type
    public IncorrectLockMsg CreateIncorrectLockMsg();       //Method to display error message for incorrect lock PIN
    public IncorrectUnlockMsg CreateIncorrectUnlockMsg();   //Method to display error message for incorrect unlock PIN
    public NoFundsMsg CreateNoFundsMsg();                   //Method to display error message for no funds in account
    public DataStore getDataStore();                        //Method to get the datastore
}
