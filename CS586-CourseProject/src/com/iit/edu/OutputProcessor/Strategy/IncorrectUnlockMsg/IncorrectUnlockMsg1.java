package com.iit.edu.OutputProcessor.Strategy.IncorrectUnlockMsg;
/*
    STRATEGY PATTERN IMPLEMENTATION
    Strategic implementation class for incorrect unlock message for both Account 1 & Account 2
 */
public class IncorrectUnlockMsg1 extends IncorrectUnlockMsg{
    @Override
    public void IncorrectUnlockMessage() {
        System.out.println("WARNING:  Incorrect PIN entered for Unlock. Please try again.... ");
    }
}
