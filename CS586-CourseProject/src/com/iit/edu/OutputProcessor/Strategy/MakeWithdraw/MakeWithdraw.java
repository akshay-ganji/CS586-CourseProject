package com.iit.edu.OutputProcessor.Strategy.MakeWithdraw;

import com.iit.edu.DataStore.DataStore;
/*
    STRATEGY PATTERN IMPLEMENTATION
    Abstract Strategy Class for making withdrawal from account with one abstract method MakeWithdrawFromAccount
 */
public abstract class MakeWithdraw {
    public abstract void MakeWithdrawFromAccount(DataStore ds);
}
