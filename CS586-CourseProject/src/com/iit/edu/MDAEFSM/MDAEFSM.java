package com.iit.edu.MDAEFSM;

import com.iit.edu.Constants;
import com.iit.edu.MDAEFSM.State.*;
import com.iit.edu.OutputProcessor.OutputProcessor;


public class MDAEFSM {
    State stateObject;
    State[] stateList = new State[9];

    public int attempts;

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
            state.setOutputProcessor(outputProcessor);
            state.setMDAEFSM(this);
        }
    }

    public void changeState(int state)
    {
        this.stateObject = stateList[state];
    }

    public void Open()
    {
        stateObject.Open();
        attempts = 0;
    }

    public void Login()
    {
        stateObject.Login();
        attempts = 0;
    }

    public void IncorrectLogin()
    {
        stateObject.IncorrectLogin();
    }

    public void CorrectPinAboveMin()
    {
        stateObject.CorrectPinAboveMin();
    }

    public void CorrectPinBelowMin()
    {
        stateObject.CorrectPinBelowMin();
    }

    public void IncorrectPin(int max)
    {
        stateObject.IncorrectPin(max);
    }

    public void Deposit()
    {
        stateObject.Deposit();
    }

    public void BelowMinBalance()
    {
        stateObject.BelowMinBalance();
    }

    public void AboveMinBalance()
    {
        stateObject.AboveMinBalance();
    }

    public void Balance()
    {
        stateObject.Balance();
    }

    public void Logout()
    {
        stateObject.Logout();
    }

    public void Withdraw()
    {
        stateObject.Withdraw();
    }

    public void WithdrawBelowMinBalance()
    {
        stateObject.WithdrawBelowMinBalance();
    }

    public void NoFunds() {
        stateObject.NoFunds();
    }

    public void Lock() {
        stateObject.Lock();
    }

    public void IncorrectLock(){
        stateObject.IncorrectLock();
    }

    public void Unlock(){
        stateObject.Unlock();
    }

    public void IncorrectUnlock(){
        stateObject.IncorrectUnlock();
    }

    public void Suspend(){
        stateObject.Suspend();
    }

    public void Activate(){
        stateObject.Activate();
    }

    public void Close(){
        stateObject.Close();
    }

    public void getCurrentState(){
        System.out.println("CURRENT STATE: "+ stateObject.getClass().getSimpleName());
    }
}
