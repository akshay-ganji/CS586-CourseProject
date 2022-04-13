package com.iit.edu.OutputProcessor.Strategy.MakeWithdraw;

import com.iit.edu.DataStore.DataStore;
import com.iit.edu.DataStore.DataStore2;

public class MakeWithdraw2 extends MakeWithdraw{
    @Override
    public void MakeWithdraw(DataStore ds)
    {
        ((DataStore2)ds).WithdrawFromAccount();
        System.out.println("Account 2:: After Withdraw Balance is $" + ((DataStore2)ds).getBalance() );
    }
}
