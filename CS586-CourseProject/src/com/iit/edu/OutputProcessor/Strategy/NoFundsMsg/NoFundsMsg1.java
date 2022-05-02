package com.iit.edu.OutputProcessor.Strategy.NoFundsMsg;

public class NoFundsMsg1 extends NoFundsMsg {

    @Override
    public void NoFundsMsg() {
        System.out.println("WARNING: No eligible funds available for transaction. Please deposit to account.");
    }
}
