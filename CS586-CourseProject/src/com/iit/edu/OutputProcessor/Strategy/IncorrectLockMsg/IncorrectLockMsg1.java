package com.iit.edu.OutputProcessor.Strategy.IncorrectLockMsg;

public class IncorrectLockMsg1 extends IncorrectLockMsg {

    @Override
    public void IncorrectLockMsg() {
        System.out.println("WARNING: Incorrect PIN entered for Lock. Please try again.... ");
    }
}