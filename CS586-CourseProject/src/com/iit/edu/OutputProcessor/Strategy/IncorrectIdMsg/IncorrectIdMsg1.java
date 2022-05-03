package com.iit.edu.OutputProcessor.Strategy.IncorrectIdMsg;
/*
    STRATEGY PATTERN IMPLEMENTATION
    Strategic implementation class for incorrect ID message for both Account 1 & Account 2
 */
public class IncorrectIdMsg1 extends IncorrectIdMsg{

    @Override
    public void IncorrectIDMessage()
    {
        System.out.println("WARNING: User ID mismatch! Please try again with a valid ID.....");
    }
}
