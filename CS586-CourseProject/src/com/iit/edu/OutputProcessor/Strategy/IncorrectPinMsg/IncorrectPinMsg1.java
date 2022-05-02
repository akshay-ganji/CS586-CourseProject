package com.iit.edu.OutputProcessor.Strategy.IncorrectPinMsg;

public class IncorrectPinMsg1 extends IncorrectPinMsg{

    @Override
    public void IncorrectPINMessage()
    {
        System.out.println("WARNING: Incorrect PIN entered! Please try again with a valid PIN.....");
    }
}
