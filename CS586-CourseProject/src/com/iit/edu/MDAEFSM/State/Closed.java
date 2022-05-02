package com.iit.edu.MDAEFSM.State;

import com.iit.edu.Constants;

public class Closed extends State{

    @Override
    public void Open() {
        System.out.println(Constants.CLOSED_MESSAGE);
    }

    @Override
    public void Login() {
        System.out.println(Constants.CLOSED_MESSAGE);
    }

    @Override
    public void IncorrectLogin() {
        System.out.println(Constants.CLOSED_MESSAGE);
    }

    @Override
    public void CorrectPinBelowMin() {
        //This method is not reachable for  Closed state
    }

    @Override
    public void CorrectPinAboveMin() {
        System.out.println(Constants.CLOSED_MESSAGE);
    }

    @Override
    public void IncorrectPin(int max) {
        System.out.println(Constants.CLOSED_MESSAGE);
    }

    @Override
    public void Deposit() {
        System.out.println(Constants.CLOSED_MESSAGE);
    }

    @Override
    public void BelowMinBalance() {
        //This method is not reachable for  Closed state
    }

    @Override
    public void AboveMinBalance() {
        //This method is not reachable for  Closed state
    }

    @Override
    public void Balance() {
        System.out.println(Constants.CLOSED_MESSAGE);
    }

    @Override
    public void Logout() {
        System.out.println(Constants.CLOSED_MESSAGE);
    }

    @Override
    public void Withdraw() {
        System.out.println(Constants.CLOSED_MESSAGE);
    }

    @Override
    public void WithdrawBelowMinBalance() {
        //This method is not reachable for  Closed state
    }

    @Override
    public void NoFunds() {
        //This method is not reachable for  Closed state
    }

    @Override
    public void Lock() {
        //This method is not reachable for  Closed state
    }

    @Override
    public void IncorrectLock() {
        //This method is not reachable for  Closed state
    }

    @Override
    public void Unlock() {
        //This method is not reachable for  Closed state
    }

    @Override
    public void IncorrectUnlock() {
        //This method is not reachable for  Closed state
    }

    @Override
    public void Suspend() {
        System.out.println(Constants.CLOSED_MESSAGE);
    }

    @Override
    public void Activate() {
        System.out.println(Constants.CLOSED_MESSAGE);
    }

    @Override
    public void Close() {
        System.out.println(Constants.CLOSED_MESSAGE);
    }
}