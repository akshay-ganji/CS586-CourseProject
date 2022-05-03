package com.iit.edu.OutputProcessor.Strategy.MakeWithdraw;

import com.iit.edu.DataStore.DataStore;
import com.iit.edu.DataStore.DataStore2;
/*
    STRATEGY PATTERN IMPLEMENTATION
    Strategic implementation class for make withdraw operation for Account2
 */
public class MakeWithdraw2 extends MakeWithdraw{
    @Override
    public void MakeWithdrawFromAccount(DataStore ds)
    {
        ((DataStore2)ds).WithdrawFromAccount();
    }
}
