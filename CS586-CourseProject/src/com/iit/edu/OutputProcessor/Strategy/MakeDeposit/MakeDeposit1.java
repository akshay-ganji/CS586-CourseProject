package com.iit.edu.OutputProcessor.Strategy.MakeDeposit;

import com.iit.edu.DataStore.DataStore;
import com.iit.edu.DataStore.DataStore1;

public class MakeDeposit1 extends MakeDeposit{
    public void MakeDepositToAccount(DataStore ds){
        ((DataStore1)ds).DepositToAccount();
    }
}
