package com.iit.edu.OutputProcessor.Strategy.MakeDeposit;

import com.iit.edu.DataStore.DataStore;
/*
    STRATEGY PATTERN IMPLEMENTATION
    Abstract Strategy Class for making deposit to account with one abstract method MakeDepositToAccount
 */
public abstract class MakeDeposit {
    public abstract void MakeDepositToAccount(DataStore ds);

}
