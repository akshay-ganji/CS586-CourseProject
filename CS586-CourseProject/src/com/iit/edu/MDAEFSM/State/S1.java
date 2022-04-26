package com.iit.edu.MDAEFSM.State;

import com.iit.edu.Constants;
import com.iit.edu.MDAEFSM.MDAEFSM;

public class S1 implements State{

    MDAEFSM mdaEfsm;                                               //Create MDAEFSM Object needed for S1 State operations

    public S1(MDAEFSM mdaEfsm) {
        this.mdaEfsm = mdaEfsm;
    }       //Constructor to initialize MDAEFSM

    @Override
    public void Open() {
        //This method is not reachable for S1 state
    }

    @Override
    public void Login() {
        //This method is not reachable for S1 state
    }

    @Override
    public void IncorrectLogin() {
        //This method is not reachable for S1 state
    }

    @Override
    public void CorrectPinBelowMin() {
        //This method is not reachable for S1 state
    }

    @Override
    public void CorrectPinAboveMin() {
        //This method is not reachable for S1 state
    }

    @Override
    public void IncorrectPin(int max) {
        //This method is not reachable for S1 state
    }

    @Override
    public void Deposit() {
        mdaEfsm.outputProcessor.MakeDeposit();
    }

    @Override
    public void BelowMinBalance() {
        mdaEfsm.changeState(Constants.OVERDRAWN);
    }

    @Override
    public void AboveMinBalance() {
        mdaEfsm.changeState(Constants.READY);
    }

    @Override
    public void Balance() {
        //This method is not reachable for S1 state
    }

    @Override
    public void Logout() {
        //This method is not reachable for S1 state
    }

    @Override
    public void Withdraw() {
        //This method is not reachable for S1 state
    }

    @Override
    public void WithdrawBelowMinBalance() {
        mdaEfsm.outputProcessor.Penalty();      //ACCOUNT 1
        mdaEfsm.changeState(Constants.OVERDRAWN);
    }

    @Override
    public void NoFunds() {
        //This method is not reachable for S1 state
    }

    @Override
    public void Lock() {
        //This method is not reachable for S1 state
    }

    @Override
    public void IncorrectLock() {
        //This method is not reachable for S1 state
    }

    @Override
    public void Unlock() {
        //This method is not reachable for S1 state
    }

    @Override
    public void IncorrectUnlock() {
        //This method is not reachable for S1 state
    }

    @Override
    public void Suspend() {
        //This method is not reachable for S1 state
    }

    @Override
    public void Activate() {
        //This method is not reachable for S1 state
    }

    @Override
    public void Close() {
        //This method is not reachable for S1 state
    }
}
