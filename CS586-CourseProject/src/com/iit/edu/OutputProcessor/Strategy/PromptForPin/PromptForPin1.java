package com.iit.edu.OutputProcessor.Strategy.PromptForPin;
/*
    STRATEGY PATTERN IMPLEMENTATION
    Strategic implementation class for prompt for PIN message for both Account 1 & Account 2
 */
public class PromptForPin1 extends PromptForPin{
    public void PromptForPinMessage()
    {
        System.out.println("Please enter the user PIN to login to system.");
    }
}
