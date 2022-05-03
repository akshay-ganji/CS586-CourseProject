package com.iit.edu.OutputProcessor.Strategy.StoreData;

import com.iit.edu.DataStore.DataStore;
import com.iit.edu.DataStore.DataStore2;
/*
    STRATEGY PATTERN IMPLEMENTATION
    Strategic implementation class for store data for Account2 in Datasource2
 */
public class StoreData2 extends StoreData {

    @Override
    public void StoreData(DataStore ds) {
        ((DataStore2) ds).setBalance();
        ((DataStore2) ds).setPin();
        ((DataStore2) ds).setId();
    }
}
