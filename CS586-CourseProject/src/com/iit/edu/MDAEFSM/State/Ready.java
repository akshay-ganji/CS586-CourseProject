package com.iit.edu.MDAEFSM.State;

import com.iit.edu.MDAEFSM.MDAEFSM;

public class Ready implements State{
    MDAEFSM mdaEfsm = null;

    public Ready(MDAEFSM mdaEfsm) {
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
        mdaEfsm.setState(mdaEfsm.getIdleState());
    }

    @Override
    public void Withdraw() {
        mdaEfsm.outputProcessor.MakeWithdraw();
        mdaEfsm.setState(mdaEfsm.getS1State());
    }

    @Override
    public void WithdrawBelowMinBalance() {

    }

    @Override
    public void NoFunds() {
        mdaEfsm.outputProcessor.NoFundsMsg();
    }

    @Override
    public void Lock() {
        mdaEfsm.setState(mdaEfsm.getLockedState());
    }

    @Override
    public void IncorrectLock() {
        mdaEfsm.outputProcessor.IncorrectLockMsg();
    }

    @Override
    public void Unlock() {

    }

    @Override
    public void IncorrectUnlock() {

    }

    @Override
    public void Suspend() {
        mdaEfsm.setState(mdaEfsm.getSuspendedState());
    }

    @Override
    public void Activate() {

    }

    @Override
    public void Close() {

    }
}
