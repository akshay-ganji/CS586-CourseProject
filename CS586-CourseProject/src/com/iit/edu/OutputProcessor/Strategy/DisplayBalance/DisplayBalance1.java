package com.iit.edu.OutputProcessor.Strategy.DisplayBalance;

import com.iit.edu.DataStore.DataStore;
import com.iit.edu.DataStore.DataStore1;
/*
    STRATEGY PATTERN IMPLEMENTATION
    Strategic implementation Class for Display Balance for Account1 Objects
 */
public class DisplayBalance1 extends DisplayBalance{
    @Override
    public void DisplayAccountBalance(DataStore dataStore) {
        System.out.println("Account1: Current Balance is $"+ ((DataStore1) dataStore).getBalance());    //Display Account1 Balance
    }
}