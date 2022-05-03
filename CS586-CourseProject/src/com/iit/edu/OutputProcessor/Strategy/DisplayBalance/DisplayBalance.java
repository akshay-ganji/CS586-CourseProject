package com.iit.edu.OutputProcessor.Strategy.DisplayBalance;

import com.iit.edu.DataStore.DataStore;
/*
    STRATEGY PATTERN IMPLEMENTATION
    Abstract Strategy Class for Display Balance with one abstract method DisplayBalance
 */
public abstract class DisplayBalance {
    public abstract void DisplayAccountBalance(DataStore dataStore);
}