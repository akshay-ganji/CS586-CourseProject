package com.iit.edu.OutputProcessor.Strategy.DisplayBalance;

import com.iit.edu.DataStore.DataStore;
import com.iit.edu.DataStore.DataStore1;

public class DisplayBalance1 extends DisplayBalance{
    @Override
    public void DisplayBalance(DataStore dataStore) {
        System.out.println("Account1: Current Balance is $"+ ((DataStore1) dataStore).getBalance());
    }
}
