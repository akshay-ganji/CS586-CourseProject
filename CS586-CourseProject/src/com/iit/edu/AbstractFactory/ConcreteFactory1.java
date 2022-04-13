package com.iit.edu.AbstractFactory;

import com.iit.edu.DataStore.DataStore;
import com.iit.edu.DataStore.DataStore1;
import com.iit.edu.OutputProcessor.Strategy.*;
import com.iit.edu.OutputProcessor.Strategy.DisplayBalance.*;
import com.iit.edu.OutputProcessor.Strategy.DisplayMenu.*;
import com.iit.edu.OutputProcessor.Strategy.MakeDeposit.*;
import com.iit.edu.OutputProcessor.Strategy.MakeWithdraw.*;
import com.iit.edu.OutputProcessor.Strategy.StoreData.StoreData;
import com.iit.edu.OutputProcessor.Strategy.StoreData.StoreData1;

public class ConcreteFactory1 implements AbstractFactory{
    DataStore dataStore1 = new DataStore1();
    StoreData storeData1 = new StoreData1();
    PromptForPin promptForPin1 = new PromptForPin();
    IncorrectIdMsg incorrectIdMsg1 = new IncorrectIdMsg();
    IncorrectPinMsg incorrectPinMsg1 = new IncorrectPinMsg();
    TooManyAttemptsMsg tooManyAttemptsMsg1 = new TooManyAttemptsMsg();
    DisplayMenu displayMenu1 = new DisplayMenu1();
    DisplayBalance displayBalance1 = new DisplayBalance1();
    MakeDeposit makeDeposit1 = new MakeDeposit1();
    MakeWithdraw makeWithdraw1 = new MakeWithdraw1();
    Penalty penalty1 = new Penalty();
    IncorrectLockMsg incorrectLockMsg1 = new IncorrectLockMsg();
    IncorrectUnlockMsg incorrectUnlockMsg1 = new IncorrectUnlockMsg();
    NoFundsMsg noFundsMsg1 = new NoFundsMsg();


    @Override
    public DataStore CreateDataStore() {
        return this.dataStore1;
    }

    @Override
    public StoreData CreateStoreData() {
        return this.storeData1;
    }

    @Override
    public PromptForPin CreatePromptForPin() {
        return this.promptForPin1;
    }

    @Override
    public IncorrectIdMsg CreateIncorrectIdMessage() {
        return this.incorrectIdMsg1;
    }

    @Override
    public IncorrectPinMsg CreateIncorrectPinMessage() {
        return this.incorrectPinMsg1;
    }

    @Override
    public TooManyAttemptsMsg CreateTooManyAttemptsMsg() {
        return this.tooManyAttemptsMsg1;
    }

    @Override
    public DisplayMenu CreateDisplayMenu() {
        return this.displayMenu1;
    }

    @Override
    public DisplayBalance CreateDisplayBalance() {
        return this.displayBalance1;
    }

    @Override
    public MakeDeposit CreateMakeDeposit() { return this.makeDeposit1; }

    @Override
    public MakeWithdraw CreateMakeWithdraw() { return this.makeWithdraw1; }

    @Override
    public Penalty CreatePenalty() {
        return this.penalty1;
    }

    @Override
    public IncorrectLockMsg CreateIncorrectLockMsg() {
        return this.incorrectLockMsg1;
    }

    @Override
    public IncorrectUnlockMsg CreateIncorrectUnlockMsg() {
        return this.incorrectUnlockMsg1;
    }

    @Override
    public NoFundsMsg CreateNoFundsMsg() {
        return this.noFundsMsg1;
    }

    public DataStore getDataStore() {
        return this.dataStore1;
    }
}
