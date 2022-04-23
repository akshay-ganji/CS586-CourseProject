package com.iit.edu.OutputProcessor.Strategy.MakeWithdraw;

import com.iit.edu.DataStore.DataStore;
import com.iit.edu.DataStore.DataStore1;

public class MakeWithdraw1 extends MakeWithdraw{
    @Override
    public void MakeWithdraw(DataStore ds)
    {
        ((DataStore1)ds).WithdrawFromAccount();
    }
}
