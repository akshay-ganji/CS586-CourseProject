package com.iit.edu.OutputProcessor.Strategy.NoFundsMsg;
/*
    STRATEGY PATTERN IMPLEMENTATION
    Strategic implementation class for no funds message for both Account 1 & Account 2
 */
public class NoFundsMsg1 extends NoFundsMsg {

    @Override
    public void NoFundsMessage() {
        System.out.println("WARNING: No eligible funds available for transaction. Please deposit to account.");
    }
}
