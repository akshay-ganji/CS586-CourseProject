package com.iit.edu.OutputProcessor.Strategy.IncorrectUnlockMsg;

public class IncorrectUnlockMsg1 extends IncorrectUnlockMsg{
    @Override
    public void IncorrectUnlockMessage() {
        System.out.println("WARNING:  Incorrect PIN entered for Unlock. Please try again.... ");
    }
}
