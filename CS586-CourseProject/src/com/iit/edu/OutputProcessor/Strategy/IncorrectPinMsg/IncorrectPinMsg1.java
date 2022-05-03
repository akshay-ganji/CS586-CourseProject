package com.iit.edu.OutputProcessor.Strategy.IncorrectPinMsg;
/*
    STRATEGY PATTERN IMPLEMENTATION
    Strategic implementation class for incorrect pin message for both Account 1 & Account 2
 */
public class IncorrectPinMsg1 extends IncorrectPinMsg{

    @Override
    public void IncorrectPINMessage()
    {
        System.out.println("WARNING: Incorrect PIN entered! Please try again with a valid PIN.....");
    }
}
