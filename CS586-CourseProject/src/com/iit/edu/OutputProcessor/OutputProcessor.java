package com.iit.edu.OutputProcessor;

import com.iit.edu.AbstractFactory.AbstractFactory;
import com.iit.edu.AbstractFactory.ConcreteFactory1;
import com.iit.edu.DataStore.DataStore;
import com.iit.edu.OutputProcessor.Strategy.*;
import com.iit.edu.OutputProcessor.Strategy.DisplayBalance.*;
import com.iit.edu.OutputProcessor.Strategy.DisplayMenu.*;
import com.iit.edu.OutputProcessor.Strategy.MakeDeposit.*;
import com.iit.edu.OutputProcessor.Strategy.MakeWithdraw.*;
import com.iit.edu.OutputProcessor.Strategy.StoreData.*;


public class OutputProcessor {
    DataStore dataStore = null;
    AbstractFactory abstractFactory = null;

    public OutputProcessor(DataStore dataStore,AbstractFactory abstractFactory) {
        this.dataStore = dataStore;
        this.abstractFactory = abstractFactory;
    }

    public void StoreData()
    {
        System.out.println("\n OUTPUT:: Action StoreData");
        StoreData storeData = abstractFactory.CreateStoreData();

        storeData.StoreData(dataStore);
    }

    public void IncorrectIdMsg()
    {
        System.out.println("\n OUTPUT:: Action IncorrectIDMessage");
        IncorrectIdMsg incorrectIDMessage = abstractFactory.CreateIncorrectIdMessage();
        incorrectIDMessage.IncorrectIDMessage();
    }

    public void IncorrectPinMsg()
    {
        System.out.println("\n OUTPUT:: Action IncorrectPINMessage");
        IncorrectPinMsg incorrectPINMessage = abstractFactory.CreateIncorrectPinMessage();
        incorrectPINMessage.IncorrectPINMessage();
    }

    public void PromptForPin()
    {
        System.out.println("\n OUTPUT:: Action PromptForPin");
        PromptForPin promptForPin = abstractFactory.CreatePromptForPin();
        promptForPin.PromptForPin();
    }

    public void TooManyAttemptsMsg()
    {
        System.out.println("\n OUTPUT:: Action TooManyAttemptsMsg");
        TooManyAttemptsMsg tooManyAttemptsMsg = abstractFactory.CreateTooManyAttemptsMsg();
        tooManyAttemptsMsg.TooManyAttemptsMsg();
    }

    public void DisplayMenu()
    {
        System.out.println("\n OUTPUT:: Action DisplayMenu");
        DisplayMenu displayMenu = abstractFactory.CreateDisplayMenu();
        displayMenu.DisplayMenu();
    }

    public void DisplayBalance()
    {
        System.out.println("\n OUTPUT:: Action DisplayBalance");
        DisplayBalance displayBalance = abstractFactory.CreateDisplayBalance();
        displayBalance.DisplayBalance(dataStore);
    }

    public void MakeDeposit()
    {
        System.out.println("\n OUTPUT:: Action MakeDeposit ");
        MakeDeposit makeDeposit = abstractFactory.CreateMakeDeposit();
        makeDeposit.MakeDeposit(dataStore);
    }

    public void MakeWithdraw()
    {
        System.out.println("\n OUTPUT:: Action MakeWithdraw ");
        MakeWithdraw makeWithdraw = abstractFactory.CreateMakeWithdraw();
        makeWithdraw.MakeWithdraw(dataStore);
    }

    public void Penalty()
    {
        System.out.println("\n OUTPUT:: Action Penalty ");
        Penalty penalty = abstractFactory.CreatePenalty();
        penalty.Penalty(dataStore);
    }

    public void IncorrectLockMsg()
    {
        System.out.println("\n OUTPUT:: Action IncorrectLockMsg ");
        IncorrectLockMsg incorrectLockMsg = abstractFactory.CreateIncorrectLockMsg();
        incorrectLockMsg.IncorrectLockMsg();
    }

    public void IncorrectUnlockMsg()
    {
        System.out.println("\n OUTPUT:: Action IncorrectUnlockMsg ");
        IncorrectUnlockMsg incorrectUnlockMsg = abstractFactory.CreateIncorrectUnlockMsg();
        incorrectUnlockMsg.IncorrectUnlockMsg();
    }

    public void NoFundsMsg()
    {
        System.out.println("\n OUTPUT:: Action NoFundsMsg ");
        NoFundsMsg noFundsMsg = abstractFactory.CreateNoFundsMsg();
        noFundsMsg.NoFundsMsg();
    }
}
