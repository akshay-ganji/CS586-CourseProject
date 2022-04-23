package com.iit.edu.MDAEFSM.State;

import com.iit.edu.MDAEFSM.MDAEFSM;

public class S1 implements State{

    MDAEFSM mdaEfsm = null;

    public S1(MDAEFSM mdaEfsm) {
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
        mdaEfsm.outputProcessor.MakeDeposit();
    }

    @Override
    public void BelowMinBalance() {
        mdaEfsm.setState(mdaEfsm.getOverDrawnState());
    }

    @Override
    public void AboveMinBalance() {
        mdaEfsm.setState(mdaEfsm.getReadyState());
    }

    @Override
    public void Balance() {

    }

    @Override
    public void Logout() {

    }

    @Override
    public void Withdraw() {

    }

    @Override
    public void WithdrawBelowMinBalance() {
        mdaEfsm.outputProcessor.Penalty();      //ACCOUNT 1
        mdaEfsm.setState(mdaEfsm.getOverDrawnState());
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
