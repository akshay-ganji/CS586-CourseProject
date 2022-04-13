package com.iit.edu.AbstractFactory;

import com.iit.edu.DataStore.DataStore;
import com.iit.edu.DataStore.DataStore2;
import com.iit.edu.OutputProcessor.Strategy.*;
import com.iit.edu.OutputProcessor.Strategy.DisplayBalance.DisplayBalance;
import com.iit.edu.OutputProcessor.Strategy.DisplayMenu.DisplayMenu;
import com.iit.edu.OutputProcessor.Strategy.MakeDeposit.MakeDeposit;
import com.iit.edu.OutputProcessor.Strategy.MakeWithdraw.MakeWithdraw;
import com.iit.edu.OutputProcessor.Strategy.StoreData.StoreData;
import com.iit.edu.OutputProcessor.Strategy.StoreData.StoreData2;

public class ConcreteFactory2 implements AbstractFactory{
    DataStore dataStore2 = new DataStore2();
    StoreData storeData2 = new StoreData2();

    @Override
    public DataStore CreateDataStore() {
        return this.dataStore2;
    }

    @Override
    public StoreData CreateStoreData() {
        return null;
    }

    @Override
    public PromptForPin CreatePromptForPin() {
        return null;
    }

    @Override
    public IncorrectIdMsg CreateIncorrectIdMessage() {
        return null;
    }

    @Override
    public IncorrectPinMsg CreateIncorrectPinMessage() {
        return null;
    }

    @Override
    public TooManyAttemptsMsg CreateTooManyAttemptsMsg() {
        return null;
    }

    @Override
    public DisplayMenu CreateDisplayMenu() {
        return null;
    }

    @Override
    public DisplayBalance CreateDisplayBalance() {
        return null;
    }

    @Override
    public MakeDeposit CreateMakeDeposit() {
        return null;
    }

    @Override
    public MakeWithdraw CreateMakeWithdraw() {
        return null;
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
        return null;
    }
}
