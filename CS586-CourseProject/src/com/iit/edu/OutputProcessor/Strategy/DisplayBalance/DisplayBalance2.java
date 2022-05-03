package com.iit.edu.OutputProcessor.Strategy.DisplayBalance;

import com.iit.edu.DataStore.DataStore;
import com.iit.edu.DataStore.DataStore2;
/*
    STRATEGY PATTERN IMPLEMENTATION
    Strategic implementation Class for Display Balance for Account1 Objects
 */
public class DisplayBalance2 extends DisplayBalance{

    @Override
    public void DisplayAccountBalance(DataStore dataStore) {
        System.out.println("Account 2: Current Balance is $"+ ((DataStore2) dataStore).getBalance());   //Display Account2 Balance
    }
}