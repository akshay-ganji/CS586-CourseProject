package com.iit.edu.MDAEFSM;

import com.iit.edu.AbstractFactory.AbstractFactory;
import com.iit.edu.MDAEFSM.State.*;

import com.iit.edu.OutputProcessor.OutputProcessor;


public class MDAEFSM {
    public OutputProcessor outputProcessor = null;

    State Start = new Start(this);
    State Idle = new Idle(this);
    State CheckPin = new CheckPin(this);
    State OverDrawn = new OverDrawn(this);
    State Ready = new Ready(this);
    State S1 = new S1(this);
    State Locked = new Locked(this);
    State Suspended = new Suspended(this);

    AbstractFactory abstractFactory = null;
    State stateObject = null;

    public MDAEFSM(AbstractFactory abstractFactory, OutputProcessor outputProcessor) {
        stateObject = Start;
        this.abstractFactory = abstractFactory;
        this.outputProcessor = outputProcessor;
    }

    public int attempts;

    public void setState(State state)
    {
        this.stateObject = state;
    }

    public State getIdleState() {
        return Idle;
    }

    public State getCheckPinState() {
        return CheckPin;
    }

    public State getOverDrawnState() {
        return OverDrawn;
    }

    public State getReadyState() {
        return Ready;
    }

    public State getS1State() {
        return S1;
    }

    public State getSuspendedState() {
        return Suspended;
    }

    public State getLockedState() {
        return Locked;
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
        System.out.println("\n\nCURRENT STATE: "+ stateObject.getClass().getSimpleName());
    }
}
