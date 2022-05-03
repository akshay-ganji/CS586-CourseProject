package com.iit.edu.OutputProcessor;

import com.iit.edu.AbstractFactory.AbstractFactory;
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

/*
    STRATEGY PATTERN IMPLEMENTATION
    Outprocessor for the MDA-EFSM Architecture
    Implements Strategy Pattern of design to bind the required Actions in the concrete factories specific to Account types
 */
public class OutputProcessor {
    private DataStore dataStore;                        //pointer to DataStore object
    private StoreData storeData;                        //pointer to StoreData object
    private IncorrectIdMsg incorrectIDMessage;          //pointer to IncorrectIdMsg object
    private IncorrectPinMsg incorrectPINMessage;        //pointer to IncorrectPinMsg object
    private PromptForPin promptForPin;                  //pointer to PromptForPin object
    private TooManyAttemptsMsg tooManyAttemptsMsg;      //pointer to TooManyAttemptsMsg object
    private DisplayMenu displayMenu;                    //pointer to DisplayMenu object
    private DisplayBalance displayBalance;              //pointer to DisplayBalance object
    private MakeDeposit makeDeposit;                    //pointer to MakeDeposit object
    private MakeWithdraw makeWithdraw;                  //pointer to MakeWithdraw object
    private Penalty penalty;                            //pointer to Penalty object
    private IncorrectLockMsg incorrectLockMsg;          //pointer to IncorrectLockMsg object
    private IncorrectUnlockMsg incorrectUnlockMsg;      //pointer to IncorrectUnlockMsg object
    private NoFundsMsg noFundsMsg;                      //pointer to NoFundsMsg object


    //Method to initialize outputprocessor with the binding from abstract factory
    public void initializeOutputProcessor(AbstractFactory abstractFactory) {
        dataStore = abstractFactory.CreateDataStore();
        storeData = abstractFactory.CreateStoreData();
        incorrectIDMessage = abstractFactory.CreateIncorrectIdMessage();
        incorrectPINMessage = abstractFactory.CreateIncorrectPinMessage();
        promptForPin = abstractFactory.CreatePromptForPin();
        tooManyAttemptsMsg = abstractFactory.CreateTooManyAttemptsMsg();
        displayMenu = abstractFactory.CreateDisplayMenu();
        displayBalance = abstractFactory.CreateDisplayBalance();
        makeDeposit = abstractFactory.CreateMakeDeposit();
        makeWithdraw = abstractFactory.CreateMakeWithdraw();
        penalty = abstractFactory.CreatePenalty();
        incorrectLockMsg = abstractFactory.CreateIncorrectLockMsg();
        incorrectUnlockMsg = abstractFactory.CreateIncorrectUnlockMsg();
        noFundsMsg = abstractFactory.CreateNoFundsMsg();
    }

    public void StoreData() {
        storeData.StoreData(dataStore);
    }

    public void IncorrectIdMsg() {
        incorrectIDMessage.IncorrectIDMessage();
    }

    public void IncorrectPinMsg() {
        incorrectPINMessage.IncorrectPINMessage();
    }

    public void PromptForPin() {
        promptForPin.PromptForPinMessage();
    }

    public void TooManyAttemptsMsg() {
        tooManyAttemptsMsg.TooManyAttemptsMessage();
    }

    public void DisplayMenu() {
        displayMenu.DisplayAccountMenu();
    }

    public void DisplayBalance() {
        displayBalance.DisplayAccountBalance(dataStore);
    }

    public void MakeDeposit() {
        makeDeposit.MakeDepositToAccount(dataStore);
    }

    public void MakeWithdraw() {
        makeWithdraw.MakeWithdrawFromAccount(dataStore);
    }

    public void Penalty() {
        penalty.ApplyPenalty(dataStore);
    }

    public void IncorrectLockMsg() {
        incorrectLockMsg.IncorrectLockMessage();
    }

    public void IncorrectUnlockMsg() {
        incorrectUnlockMsg.IncorrectUnlockMessage();
    }

    public void NoFundsMsg() {
        noFundsMsg.NoFundsMessage();
    }
}