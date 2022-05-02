package com.iit.edu.OutputProcessor.Strategy.MakeDeposit;

import com.iit.edu.DataStore.DataStore;
import com.iit.edu.DataStore.DataStore2;

public class MakeDeposit2 extends MakeDeposit{
    public void MakeDepositToAccount(DataStore ds){
        ((DataStore2)ds).DepositToAccount();
    }
}
