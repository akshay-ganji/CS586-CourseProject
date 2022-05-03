package com.iit.edu.OutputProcessor.Strategy.IncorrectLockMsg;
/*
    STRATEGY PATTERN IMPLEMENTATION
    Strategic implementation class for incorrect lock message for Account1
 */
public class IncorrectLockMsg1 extends IncorrectLockMsg {

    @Override
    public void IncorrectLockMessage() {
        System.out.println("WARNING: Incorrect PIN entered for Lock. Please try again.... ");
    }
}
