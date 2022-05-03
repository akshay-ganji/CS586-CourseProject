package com.iit.edu.OutputProcessor.Strategy.Penalty;

import com.iit.edu.DataStore.DataStore;
/*
    STRATEGY PATTERN IMPLEMENTATION
    Abstract Strategy Class for applying penalty with one abstract method ApplyPenalty
 */
public abstract class Penalty {
    public abstract void ApplyPenalty(DataStore ds);
}
