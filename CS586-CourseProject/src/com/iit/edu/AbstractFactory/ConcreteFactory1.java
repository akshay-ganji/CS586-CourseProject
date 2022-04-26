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
    DataStore1 dataStore1 = new DataStore1();                           //Create DataStore1 object for Account1
    StoreData storeData1 = new StoreData1();                            //Create StoreData1 object for Account1
    PromptForPin promptForPin1 = new PromptForPin();                    //Create PromptForPin object for Account1
    IncorrectIdMsg incorrectIdMsg1 = new IncorrectIdMsg();              //Create IncorrectIdMsg object for Account1
    IncorrectPinMsg incorrectPinMsg1 = new IncorrectPinMsg();           //Create IncorrectPinMsg object for Account1
    TooManyAttemptsMsg tooManyAttemptsMsg1 = new TooManyAttemptsMsg();  //Create TooManyAttemptsMsg object for Account1
    DisplayMenu displayMenu1 = new DisplayMenu1();                      //Create DisplayMenu1 object for Account1
    DisplayBalance displayBalance1 = new DisplayBalance1();             //Create DisplayBalance1 object for Account1
    MakeDeposit makeDeposit1 = new MakeDeposit1();                      //Create MakeDeposit1 object for Account1
    MakeWithdraw makeWithdraw1 = new MakeWithdraw1();                   //Create MakeWithdraw1 object for Account1
    Penalty penalty1 = new Penalty();                                   //Create Penalty object for Account1
    IncorrectLockMsg incorrectLockMsg1 = new IncorrectLockMsg();        //Create IncorrectLockMsg object for Account1
    IncorrectUnlockMsg incorrectUnlockMsg1 = new IncorrectUnlockMsg();  //Create IncorrectUnlockMsg object for Account1
    NoFundsMsg noFundsMsg1 = new NoFundsMsg();                          //Create NoFundsMsg object for Account1

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

    @Override
    public DataStore getDataStore() {
        return this.dataStore1;
    }
}