package com.iit.edu.OutputProcessor;

import com.iit.edu.AbstractFactory.AbstractFactory;
import com.iit.edu.DataStore.DataStore;
import com.iit.edu.OutputProcessor.Strategy.*;
import com.iit.edu.OutputProcessor.Strategy.DisplayBalance.*;
import com.iit.edu.OutputProcessor.Strategy.DisplayMenu.*;
import com.iit.edu.OutputProcessor.Strategy.MakeDeposit.*;
import com.iit.edu.OutputProcessor.Strategy.MakeWithdraw.*;
import com.iit.edu.OutputProcessor.Strategy.StoreData.*;


public class OutputProcessor {
    DataStore dataStore;
    AbstractFactory abstractFactory;

    public OutputProcessor(DataStore dataStore,AbstractFactory abstractFactory) {
        this.dataStore = dataStore;
        this.abstractFactory = abstractFactory;
    }

    public void StoreData()
    {
        StoreData storeData = abstractFactory.CreateStoreData();
        storeData.StoreData(dataStore);
    }

    public void IncorrectIdMsg()
    {
        IncorrectIdMsg incorrectIDMessage = abstractFactory.CreateIncorrectIdMessage();
        incorrectIDMessage.IncorrectIDMessage();
    }

    public void IncorrectPinMsg()
    {
        IncorrectPinMsg incorrectPINMessage = abstractFactory.CreateIncorrectPinMessage();
        incorrectPINMessage.IncorrectPINMessage();
    }

    public void PromptForPin()
    {
        PromptForPin promptForPin = abstractFactory.CreatePromptForPin();
        promptForPin.PromptForPin();
    }

    public void TooManyAttemptsMsg()
    {
        TooManyAttemptsMsg tooManyAttemptsMsg = abstractFactory.CreateTooManyAttemptsMsg();
        tooManyAttemptsMsg.TooManyAttemptsMsg();
    }

    public void DisplayMenu()
    {
        DisplayMenu displayMenu = abstractFactory.CreateDisplayMenu();
        displayMenu.DisplayMenu();
    }

    public void DisplayBalance()
    {
        DisplayBalance displayBalance = abstractFactory.CreateDisplayBalance();
        displayBalance.DisplayBalance(dataStore);
    }

    public void MakeDeposit()
    {
        MakeDeposit makeDeposit = abstractFactory.CreateMakeDeposit();
        makeDeposit.MakeDeposit(dataStore);
    }

    public void MakeWithdraw()
    {
        MakeWithdraw makeWithdraw = abstractFactory.CreateMakeWithdraw();
        makeWithdraw.MakeWithdraw(dataStore);
    }

    public void Penalty()
    {
        Penalty penalty = abstractFactory.CreatePenalty();
        penalty.Penalty(dataStore);
    }

    public void IncorrectLockMsg()
    {
        IncorrectLockMsg incorrectLockMsg = abstractFactory.CreateIncorrectLockMsg();
        incorrectLockMsg.IncorrectLockMsg();
    }

    public void IncorrectUnlockMsg()
    {
        IncorrectUnlockMsg incorrectUnlockMsg = abstractFactory.CreateIncorrectUnlockMsg();
        incorrectUnlockMsg.IncorrectUnlockMsg();
    }

    public void NoFundsMsg()
    {
        NoFundsMsg noFundsMsg = abstractFactory.CreateNoFundsMsg();
        noFundsMsg.NoFundsMsg();
    }
}
