package com.iit.edu.OutputProcessor.Strategy.TooManyAttemptsMsg;
/*
    STRATEGY PATTERN IMPLEMENTATION
    Strategic implementation class for too many attempts message for both Account 1 & Account 2
 */
public class TooManyAttemptsMsg1 extends TooManyAttemptsMsg{
    public void TooManyAttemptsMessage()
    {
        System.out.println("WARNING: Too many invalid attempts.Re-login to continue..... ");
    }
}