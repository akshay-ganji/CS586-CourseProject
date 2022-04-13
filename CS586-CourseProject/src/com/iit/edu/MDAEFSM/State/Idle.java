package com.iit.edu.MDAEFSM.State;

import com.iit.edu.MDAEFSM.MDAEFSM;

public class Idle implements State{
    MDAEFSM mdaEfsm = null;
    public Idle(MDAEFSM mdaEfsm) {
        this.mdaEfsm = mdaEfsm;
    }

    @Override
    public void Open() {
        //No code here for Idle State
    }

    @Override
    public void Login() {
        mdaEfsm.attempts = 0;
        mdaEfsm.outputProcessor.PromptForPin();
        mdaEfsm.setState(mdaEfsm.getCheckPinState());
    }

    @Override
    public void IncorrectLogin() {
        mdaEfsm.outputProcessor.IncorrectIdMsg();

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

    }

    @Override
    public void Logout() {
        mdaEfsm.setState(mdaEfsm.getIdleState());
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

    }

    @Override
    public void Close() {

    }
}
