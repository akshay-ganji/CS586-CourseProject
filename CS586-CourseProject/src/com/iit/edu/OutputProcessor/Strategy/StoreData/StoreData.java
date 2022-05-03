package com.iit.edu.OutputProcessor.Strategy.StoreData;

import com.iit.edu.DataStore.DataStore;
/*
    STRATEGY PATTERN IMPLEMENTATION
    Abstract Strategy Class for storing data to datastore with one abstract method StoreData
 */
public abstract class StoreData {
     public abstract void StoreData(DataStore ds);
}
