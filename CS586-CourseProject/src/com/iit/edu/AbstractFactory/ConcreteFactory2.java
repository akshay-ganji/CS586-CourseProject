package com.iit.edu.AbstractFactory;

import com.iit.edu.DataStore.DataStore;
import com.iit.edu.DataStore.DataStore2;
import com.iit.edu.OutputProcessor.Strategy.DisplayBalance.DisplayBalance;
import com.iit.edu.OutputProcessor.Strategy.DisplayBalance.DisplayBalance2;
import com.iit.edu.OutputProcessor.Strategy.DisplayMenu.DisplayMenu;
import com.iit.edu.OutputProcessor.Strategy.DisplayMenu.DisplayMenu2;
import com.iit.edu.OutputProcessor.Strategy.IncorrectIdMsg.IncorrectIdMsg;
import com.iit.edu.OutputProcessor.Strategy.IncorrectIdMsg.IncorrectIdMsg1;
import com.iit.edu.OutputProcessor.Strategy.IncorrectLockMsg.IncorrectLockMsg;
import com.iit.edu.OutputProcessor.Strategy.IncorrectPinMsg.IncorrectPinMsg;
import com.iit.edu.OutputProcessor.Strategy.IncorrectPinMsg.IncorrectPinMsg1;
import com.iit.edu.OutputProcessor.Strategy.IncorrectUnlockMsg.IncorrectUnlockMsg;
import com.iit.edu.OutputProcessor.Strategy.MakeDeposit.MakeDeposit;
import com.iit.edu.OutputProcessor.Strategy.MakeDeposit.MakeDeposit2;
import com.iit.edu.OutputProcessor.Strategy.MakeWithdraw.MakeWithdraw;
import com.iit.edu.OutputProcessor.Strategy.MakeWithdraw.MakeWithdraw2;
import com.iit.edu.OutputProcessor.Strategy.NoFundsMsg.NoFundsMsg;
import com.iit.edu.OutputProcessor.Strategy.NoFundsMsg.NoFundsMsg1;
import com.iit.edu.OutputProcessor.Strategy.Penalty.Penalty;
import com.iit.edu.OutputProcessor.Strategy.PromptForPin.PromptForPin;
import com.iit.edu.OutputProcessor.Strategy.PromptForPin.PromptForPin1;
import com.iit.edu.OutputProcessor.Strategy.StoreData.StoreData;
import com.iit.edu.OutputProcessor.Strategy.StoreData.StoreData2;
import com.iit.edu.OutputProcessor.Strategy.TooManyAttemptsMsg.TooManyAttemptsMsg;
import com.iit.edu.OutputProcessor.Strategy.TooManyAttemptsMsg.TooManyAttemptsMsg1;

public class ConcreteFactory2 implements AbstractFactory{
    DataStore2 dataStore2 = new DataStore2();                           //Create DataStore2 object for Account2
    StoreData storeData2 = new StoreData2();                            //Create StoreData2 object for Account2
    PromptForPin promptForPin2 = new PromptForPin1();                   //Create PromptForPin object for Account2
    IncorrectIdMsg incorrectIdMsg2 = new IncorrectIdMsg1();             //Create IncorrectIdMsg object for Account2
    IncorrectPinMsg incorrectPinMsg2 = new IncorrectPinMsg1();          //Create IncorrectPinMsg object for Account2
    TooManyAttemptsMsg tooManyAttemptsMsg2 = new TooManyAttemptsMsg1(); //Create TooManyAttemptsMsg object for Account2
    DisplayMenu displayMenu2 = new DisplayMenu2();                      //Create DisplayMenu2 object for Account2
    DisplayBalance displayBalance2 = new DisplayBalance2();             //Create DisplayBalance2 object for Account2
    MakeDeposit makeDeposit2 = new MakeDeposit2();                      //Create MakeDeposit2 object for Account2
    MakeWithdraw makeWithdraw2 = new MakeWithdraw2();                   //Create MakeWithdraw2 object for Account2
    NoFundsMsg noFundsMsg2 = new NoFundsMsg1();                         //Create NoFundsMsg object for Account2

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

    @Override
    public DataStore CreateDataStore() {
        return this.dataStore2;
    }
}