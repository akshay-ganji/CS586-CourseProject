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


public class OutputProcessor {
    private DataStore dataStore;
    private StoreData storeData;
    private IncorrectIdMsg incorrectIDMessage;
    private IncorrectPinMsg incorrectPINMessage;
    private PromptForPin promptForPin;
    private TooManyAttemptsMsg tooManyAttemptsMsg;
    private DisplayMenu displayMenu;
    private DisplayBalance displayBalance;
    private MakeDeposit makeDeposit;
    private MakeWithdraw makeWithdraw;
    private Penalty penalty;
    private IncorrectLockMsg incorrectLockMsg;
    private IncorrectUnlockMsg incorrectUnlockMsg;
    private NoFundsMsg noFundsMsg;

    public void initializeOutputProcessor(AbstractFactory abstractFactory) {
        dataStore = abstractFactory.getDataStore();
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
        promptForPin.PromptForPin();
    }

    public void TooManyAttemptsMsg() {
        tooManyAttemptsMsg.TooManyAttemptsMsg();
    }

    public void DisplayMenu() {
        displayMenu.DisplayMenu();
    }

    public void DisplayBalance() {
        displayBalance.DisplayBalance(dataStore);
    }

    public void MakeDeposit() {
        makeDeposit.MakeDeposit(dataStore);
    }

    public void MakeWithdraw() {
        makeWithdraw.MakeWithdraw(dataStore);
    }

    public void Penalty() {
        penalty.Penalty(dataStore);
    }

    public void IncorrectLockMsg() {
        incorrectLockMsg.IncorrectLockMsg();
    }

    public void IncorrectUnlockMsg() {
        incorrectUnlockMsg.IncorrectUnlockMsg();
    }

    public void NoFundsMsg() {
        noFundsMsg.NoFundsMsg();
    }
}