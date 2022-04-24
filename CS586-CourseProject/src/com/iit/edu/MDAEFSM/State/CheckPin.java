package com.iit.edu.MDAEFSM.State;

import com.iit.edu.MDAEFSM.MDAEFSM;

public class CheckPin implements State {
    MDAEFSM mdaEfsm = null;
    public CheckPin(MDAEFSM mdaEfsm) {
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
        mdaEfsm.outputProcessor.DisplayMenu();
        mdaEfsm.setState(mdaEfsm.getOverDrawnState());
    }

    @Override
    public void CorrectPinAboveMin() {
        mdaEfsm.outputProcessor.DisplayMenu();
        mdaEfsm.setState(mdaEfsm.getReadyState());

    }

    @Override
    public void IncorrectPin(int max) {
        if(mdaEfsm.attempts < max)
        {
            mdaEfsm.attempts ++;
            mdaEfsm.outputProcessor.IncorrectPinMsg();
        }else if(mdaEfsm.attempts==max){
            mdaEfsm.outputProcessor.IncorrectPinMsg();
            mdaEfsm.outputProcessor.TooManyAttemptsMsg();
            mdaEfsm.setState(mdaEfsm.getIdleState());
        }
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
