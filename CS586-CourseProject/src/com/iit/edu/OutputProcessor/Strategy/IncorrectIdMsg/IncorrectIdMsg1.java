package com.iit.edu.OutputProcessor.Strategy.IncorrectIdMsg;

public class IncorrectIdMsg1 extends IncorrectIdMsg{

    @Override
    public void IncorrectIDMessage()
    {
        System.out.println("WARNING: User ID mismatch! Please try again with a valid ID.....");
    }
}
