package com.iit.edu.MDAEFSM.State;

import com.iit.edu.MDAEFSM.MDAEFSM;

public class Suspended implements State{

    MDAEFSM mdaEfsm = null;

    public Suspended(MDAEFSM mdaEfsm) {
        this.mdaEfsm = mdaEfsm;
    }


    @Override
    public void Open() {

    }

    @Override
    public void Login() {

    }

    @Override
    public void IncorrectLogin() {

    }

    @Override
    public void CorrectPinBelowMin() {

    }

    @Override
    public void CorrectPinAboveMin() {

    }

    @Override
    public void IncorrectPin(int max) {

    }

    @Override
    public void Deposit() {

    }

    @Override
    public void BelowMinBalance() {

    }

    @Override
    public void AboveMinBalance() {

    }

    @Override
    public void Balance() {
        mdaEfsm.outputProcessor.DisplayBalance();
    }

    @Override
    public void Logout() {

    }

    @Override
    public void Withdraw() {

    }

    @Override
    public void WithdrawBelowMinBalance() {

    }

    @Override
    public void NoFunds() {

    }

    @Override
    public void Lock() {

    }

    @Override
    public void IncorrectLock() {

    }

    @Override
    public void Unlock() {

    }

    @Override
    public void IncorrectUnlock() {

    }

    @Override
    public void Suspend() {

    }

    @Override
    public void Activate() {
        mdaEfsm.setState(mdaEfsm.getReadyState());
    }

    @Override
    public void Close() {
        System.out.println("Account Terminated");
        System.exit(0);
    }
}