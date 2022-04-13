package com.iit.edu.OutputProcessor.Strategy.StoreData;

import com.iit.edu.DataStore.DataStore;
import com.iit.edu.DataStore.DataStore1;

public class StoreData1 extends StoreData {

    @Override
    public void StoreData(DataStore ds) {
        ((DataStore1) ds).setBalance();
        ((DataStore1) ds).setPin();
        ((DataStore1) ds).setId();
    }
}
