package com.iit.edu.OutputProcessor.Strategy;

import com.iit.edu.DataStore.DataStore;
import com.iit.edu.DataStore.DataStore1;

public class Penalty {
    public void Penalty(DataStore ds)
    {
        ((DataStore1)ds).applyPenalty();
        System.out.println("Account 1:: There is a minimum balance requirement of $100. Penalty of $15 is applied.");
        System.out.println("Account 1:: After taking Penalty, Balance is $" + ((DataStore1)ds).getBalance() );
    }

}
