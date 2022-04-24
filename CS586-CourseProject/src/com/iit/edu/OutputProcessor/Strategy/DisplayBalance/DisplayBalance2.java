package com.iit.edu.OutputProcessor.Strategy.DisplayBalance;

import com.iit.edu.DataStore.DataStore;
import com.iit.edu.DataStore.DataStore1;
import com.iit.edu.DataStore.DataStore2;

public class DisplayBalance2 extends DisplayBalance{

    @Override
    public void DisplayBalance(DataStore dataStore) {
        System.out.println("Current Balance is $"+ ((DataStore2) dataStore).getBalance());
    }
}
