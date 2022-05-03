package com.iit.edu.MDAEFSM;

import com.iit.edu.Constants;
import com.iit.edu.MDAEFSM.State.*;
import com.iit.edu.OutputProcessor.OutputProcessor;
/*
                                        STATE PATTERN IMPLEMENTATION
    1. MDA-EFSM Events are listed in this class and binds the operation calls to model driven events from Account1 or Account2 objects

    2. Acts as a context class for the decentralized implementation of State Pattern for the state objects
 */

public class MDAEFSM {
    State stateObject;                      //Pointer to stateObject
    State[] stateList = new State[9];       //List of states

    public int attempts;                    //MDA-EFSM variable to track attempts of incorrect PIN entered

    public MDAEFSM(OutputProcessor outputProcessor) {
        stateList[0] = new Start();
        stateList[1] = new Idle();
        stateList[2] = new CheckPin();
        stateList[3] = new OverDrawn();
        stateList[4] = new Ready();
        stateList[5] = new S1();
        stateList[6] = new Locked();
        stateList[7] = new Suspended();
        stateList[8] = new Closed();
        stateObject = stateList[Constants.START];

        for(State state: stateList){
            state.setOutputProcessor(outputProcessor);      //Bind the outputprocessor initialized to all the states
            state.setMDAEFSM(this);                         //Bind the mdaEfsm object initialized to all the states
        }
    }

    //Decentralized state pattern uses this method to change state dynamically in between operations
    public void changeState(int state)
    {
        this.stateObject = stateList[state];
    }

    public void Open()
    {
        stateObject.Open();      //invoke respective state operation for Open
        attempts = 0;           //initialize attempts to 0 for new account created
    }

    public void Login()
    {
        stateObject.Login();      //invoke respective state operation for Login
        attempts = 0;             //initialize attempts to 0 for new login
    }

    public void IncorrectLogin()
    {
        stateObject.IncorrectLogin();       //invoke respective state operation for IncorrectLogin
    }

    public void CorrectPinAboveMin()
    {
        stateObject.CorrectPinAboveMin();       //invoke respective state operation for CorrectPinAboveMin
    }

    public void CorrectPinBelowMin()
    {
        stateObject.CorrectPinBelowMin();       //invoke respective state operation for CorrectPinBelowMin
    }

    public void IncorrectPin(int max)
    {
        stateObject.IncorrectPin(max);             //invoke respective state operation for IncorrectPin
    }

    public void Deposit()
    {
        stateObject.Deposit();                 //invoke respective state operation for Deposit
    }

    public void BelowMinBalance()
    {
        stateObject.BelowMinBalance();     //invoke respective state operation for BelowMinBalance
    }

    public void AboveMinBalance()
    {
        stateObject.AboveMinBalance();       //invoke respective state operation for AboveMinBalance
    }

    public void Balance()
    {
        stateObject.Balance();            //invoke respective state operation for Balance
    }

    public void Logout()
    {
        stateObject.Logout();       //invoke respective state operation for Logout
    }

    public void Withdraw()
    {
        stateObject.Withdraw();     //invoke respective state operation for Withdraw
    }

    public void WithdrawBelowMinBalance()
    {
        stateObject.WithdrawBelowMinBalance();      //invoke respective state operation for WithdrawBelowMinBalance
    }

    public void NoFunds() {
        stateObject.NoFunds();              //invoke respective state operation for NoFunds
    }

    public void Lock() {
        stateObject.Lock();          //invoke respective state operation for Lock
    }

    public void IncorrectLock(){
        stateObject.IncorrectLock();       //invoke respective state operation for IncorrectLock
    }

    public void Unlock(){
        stateObject.Unlock();           //invoke respective state operation for Unlock
    }

    public void IncorrectUnlock(){
        stateObject.IncorrectUnlock();  //invoke respective state operation for IncorrectUnlock
    }

    public void Suspend(){
        stateObject.Suspend();           //invoke respective state operation for Suspend
    }

    public void Activate(){
        stateObject.Activate();      //invoke respective state operation for Activate
    }

    public void Close(){
        stateObject.Close();          //invoke respective state operation for Close
    }

    //Custom helper method implemented to track the current status of the driver operations
    public void getCurrentState(){
        System.out.println("CURRENT STATE: "+ stateObject.getClass().getSimpleName());
    }
}
