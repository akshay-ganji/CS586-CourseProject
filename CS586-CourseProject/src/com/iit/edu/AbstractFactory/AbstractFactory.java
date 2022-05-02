package com.iit.edu.AbstractFactory;

import com.iit.edu.DataStore.DataStore;
import com.iit.edu.OutputProcessor.Strategy.DisplayBalance.*;
import com.iit.edu.OutputProcessor.Strategy.DisplayMenu.*;
import com.iit.edu.OutputProcessor.Strategy.IncorrectIdMsg.IncorrectIdMsg;
import com.iit.edu.OutputProcessor.Strategy.IncorrectLockMsg.IncorrectLockMsg;
import com.iit.edu.OutputProcessor.Strategy.IncorrectPinMsg.IncorrectPinMsg;
import com.iit.edu.OutputProcessor.Strategy.IncorrectUnlockMsg.IncorrectUnlockMsg;
import com.iit.edu.OutputProcessor.Strategy.MakeDeposit.*;
import com.iit.edu.OutputProcessor.Strategy.MakeWithdraw.*;
import com.iit.edu.OutputProcessor.Strategy.NoFundsMsg.NoFundsMsg;
import com.iit.edu.OutputProcessor.Strategy.Penalty.Penalty;
import com.iit.edu.OutputProcessor.Strategy.PromptForPin.PromptForPin;
import com.iit.edu.OutputProcessor.Strategy.StoreData.*;
import com.iit.edu.OutputProcessor.Strategy.TooManyAttemptsMsg.TooManyAttemptsMsg;

public interface AbstractFactory {
    StoreData CreateStoreData();                     //Method to store data from user input
    PromptForPin CreatePromptForPin();               //Method to prompt pin from user input
    IncorrectIdMsg CreateIncorrectIdMessage();       //Method to display error message to user for incorrect login
    IncorrectPinMsg CreateIncorrectPinMessage();     //Method to display error message to user for incorrect PIN
    TooManyAttemptsMsg CreateTooManyAttemptsMsg();   //Method to display error message for too many incorrect attempts
    DisplayMenu CreateDisplayMenu();                 //Method to display menu to user based on account type
    DisplayBalance CreateDisplayBalance();           //Method to display account balance
    MakeDeposit CreateMakeDeposit();                 //Method to make deposit for account type
    MakeWithdraw CreateMakeWithdraw();               //Method to make withdraw for account type
    Penalty CreatePenalty();                         //Method to make penalty for account type
    IncorrectLockMsg CreateIncorrectLockMsg();       //Method to display error message for incorrect lock PIN
    IncorrectUnlockMsg CreateIncorrectUnlockMsg();   //Method to display error message for incorrect unlock PIN
    NoFundsMsg CreateNoFundsMsg();                   //Method to display error message for no funds in account
    DataStore getDataStore();                        //Method to get the datastore
}
