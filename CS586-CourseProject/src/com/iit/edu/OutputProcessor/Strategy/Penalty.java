package com.iit.edu.OutputProcessor.Strategy;

import com.iit.edu.Constants;
import com.iit.edu.DataStore.DataStore;
import com.iit.edu.DataStore.DataStore1;

public class Penalty {
    public void Penalty(DataStore ds)
    {
        ((DataStore1)ds).applyPenalty();
        System.out.println("WARNING: Minimum balance requirement of $" + Constants.MIN_ACCOUNT1_BALANCE+" for Account-1");
        System.out.println("Penalty of $"+Constants.ACCOUNT1_PENALTY+" is applied.");
    }
}
