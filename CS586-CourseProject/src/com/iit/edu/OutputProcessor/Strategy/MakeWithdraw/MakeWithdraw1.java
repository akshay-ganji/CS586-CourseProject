package com.iit.edu.OutputProcessor.Strategy.MakeWithdraw;

import com.iit.edu.DataStore.DataStore;
import com.iit.edu.DataStore.DataStore1;
/*
    STRATEGY PATTERN IMPLEMENTATION
    Strategic implementation class for make withdraw operation for Account1
 */
public class MakeWithdraw1 extends MakeWithdraw{
    @Override
    public void MakeWithdrawFromAccount(DataStore ds)
    {
        ((DataStore1)ds).WithdrawFromAccount();
    }
}
