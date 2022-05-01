package com.iit.edu.MDAEFSM;

import com.iit.edu.AbstractFactory.AbstractFactory;
import com.iit.edu.MDAEFSM.State.*;

import com.iit.edu.OutputProcessor.OutputProcessor;


public class MDAEFSM {
    AbstractFactory abstractFactory = null;
    public OutputProcessor outputProcessor = null;
    State stateObject = null;
    State[] stateList = new State[9];

    public int attempts;

    public MDAEFSM(AbstractFactory abstractFactory, OutputProcessor outputProcessor) {
        this.abstractFactory = abstractFactory;
        this.outputProcessor = outputProcessor;

        stateList[0] = new Start(this);
        stateList[1] = new Idle(this);
        stateList[2] = new CheckPin(this);
        stateList[3] = new OverDrawn(this);
        stateList[4] = new Ready(this);
        stateList[5] = new S1(this);
        stateList[6] = new Locked(this);
        stateList[7] = new Suspended(this);
        stateList[8] = new Closed(this);
        stateObject = stateList[0];
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
