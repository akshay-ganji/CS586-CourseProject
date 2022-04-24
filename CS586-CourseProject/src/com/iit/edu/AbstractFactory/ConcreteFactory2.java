package com.iit.edu.AbstractFactory;

import com.iit.edu.DataStore.DataStore;
import com.iit.edu.DataStore.DataStore2;
import com.iit.edu.OutputProcessor.Strategy.*;
import com.iit.edu.OutputProcessor.Strategy.DisplayBalance.DisplayBalance;
import com.iit.edu.OutputProcessor.Strategy.DisplayBalance.DisplayBalance2;
import com.iit.edu.OutputProcessor.Strategy.DisplayMenu.DisplayMenu;
import com.iit.edu.OutputProcessor.Strategy.DisplayMenu.DisplayMenu2;
import com.iit.edu.OutputProcessor.Strategy.MakeDeposit.MakeDeposit;
import com.iit.edu.OutputProcessor.Strategy.MakeDeposit.MakeDeposit2;
import com.iit.edu.OutputProcessor.Strategy.MakeWithdraw.MakeWithdraw;
import com.iit.edu.OutputProcessor.Strategy.MakeWithdraw.MakeWithdraw2;
import com.iit.edu.OutputProcessor.Strategy.StoreData.StoreData;
import com.iit.edu.OutputProcessor.Strategy.StoreData.StoreData2;

public class ConcreteFactory2 implements AbstractFactory{
    DataStore dataStore2 = new DataStore2();
    StoreData storeData2 = new StoreData2();
    PromptForPin promptForPin2 = new PromptForPin();
    IncorrectIdMsg incorrectIdMsg2 = new IncorrectIdMsg();
    IncorrectPinMsg incorrectPinMsg2 = new IncorrectPinMsg();
    TooManyAttemptsMsg tooManyAttemptsMsg2 = new TooManyAttemptsMsg();
    DisplayMenu displayMenu2 = new DisplayMenu2();
    DisplayBalance displayBalance2 = new DisplayBalance2();
    MakeDeposit makeDeposit2 = new MakeDeposit2();
    MakeWithdraw makeWithdraw2 = new MakeWithdraw2();
    NoFundsMsg noFundsMsg2 = new NoFundsMsg();

    @Override
    public DataStore CreateDataStore() {
        return this.dataStore2;
    }

    @Override
    public StoreData CreateStoreData() {
        return this.storeData2;
    }

    @Override
    public PromptForPin CreatePromptForPin() {
        return this.promptForPin2;
    }

    @Override
    public IncorrectIdMsg CreateIncorrectIdMessage() {
        return this.incorrectIdMsg2;
    }

    @Override
    public IncorrectPinMsg CreateIncorrectPinMessage() {
        return this.incorrectPinMsg2;
    }

    @Override
    public TooManyAttemptsMsg CreateTooManyAttemptsMsg() {
        return this.tooManyAttemptsMsg2;
    }

    @Override
    public DisplayMenu CreateDisplayMenu() {
        return this.displayMenu2;
    }

    @Override
    public DisplayBalance CreateDisplayBalance() {
        return this.displayBalance2;
    }

    @Override
    public MakeDeposit CreateMakeDeposit() {
        return this.makeDeposit2;
    }

    @Override
    public MakeWithdraw CreateMakeWithdraw() {
        return this.makeWithdraw2;
    }

    @Override
    public Penalty CreatePenalty() {
        return null;
    }

    @Override
    public IncorrectLockMsg CreateIncorrectLockMsg() {
        return null;
    }

    @Override
    public IncorrectUnlockMsg CreateIncorrectUnlockMsg() {
        return null;
    }

    @Override
    public NoFundsMsg CreateNoFundsMsg() {
        return this.noFundsMsg2;
    }

    public DataStore getDataStore() {
        return this.dataStore2;
    }
}
