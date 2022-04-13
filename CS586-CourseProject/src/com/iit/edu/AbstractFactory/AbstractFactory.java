package com.iit.edu.AbstractFactory;

import com.iit.edu.DataStore.DataStore;
import com.iit.edu.OutputProcessor.Strategy.*;
import com.iit.edu.OutputProcessor.Strategy.DisplayBalance.*;
import com.iit.edu.OutputProcessor.Strategy.DisplayMenu.*;
import com.iit.edu.OutputProcessor.Strategy.MakeDeposit.*;
import com.iit.edu.OutputProcessor.Strategy.MakeWithdraw.*;
import com.iit.edu.OutputProcessor.Strategy.StoreData.*;

public interface AbstractFactory {
    public DataStore CreateDataStore();
    public StoreData CreateStoreData();
    public PromptForPin CreatePromptForPin();
    public IncorrectIdMsg CreateIncorrectIdMessage();
    public IncorrectPinMsg CreateIncorrectPinMessage();
    public TooManyAttemptsMsg CreateTooManyAttemptsMsg();
    public DisplayMenu CreateDisplayMenu();
    public DisplayBalance CreateDisplayBalance();
    public MakeDeposit CreateMakeDeposit();
    public MakeWithdraw CreateMakeWithdraw();
    public Penalty CreatePenalty();
    public IncorrectLockMsg CreateIncorrectLockMsg();
    public IncorrectUnlockMsg CreateIncorrectUnlockMsg();
    public NoFundsMsg CreateNoFundsMsg();
}
