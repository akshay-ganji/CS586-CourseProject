package com.iit.edu.MDAEFSM.State;

import com.iit.edu.Constants;
import com.iit.edu.MDAEFSM.MDAEFSM;

public class Idle implements State{
    MDAEFSM mdaEfsm;                                            //Create MDAEFSM Object needed for Idle State operations
    public Idle(MDAEFSM mdaEfsm) {
        this.mdaEfsm = mdaEfsm;
    }    //Constructor to initialize MDAEFSM

    @Override
    public void Open() {
        System.out.println("\nWARNING: Account is already opened. Open("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Login() {
        mdaEfsm.attempts = 0;
        mdaEfsm.outputProcessor.PromptForPin();
        mdaEfsm.changeState(Constants.CHECKPIN);
    }

    @Override
    public void IncorrectLogin() {
        mdaEfsm.outputProcessor.IncorrectIdMsg();
    }

    @Override
    public void CorrectPinBelowMin() {
        System.out.println("\nWARNING: Login needed. Pin("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void CorrectPinAboveMin() {
        System.out.println("\nWARNING: Login needed. Pin("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void IncorrectPin(int max) {
        System.out.println("\nWARNING: Login needed. Pin("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Deposit() {
        System.out.println("\nWARNING: Login needed. Deposit("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void BelowMinBalance() {
        //This method is not reachable for IDLE state
    }

    @Override
    public void AboveMinBalance() {
        //This method is not reachable for IDLE state
    }

    @Override
    public void Balance() {
        System.out.println("\nWARNING: Login needed. Balance("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Logout() {
        System.out.println("\nWARNING: Login needed. Logout("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Withdraw() {
        System.out.println("\nWARNING: Login needed. Withdraw("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void WithdrawBelowMinBalance() {
        //This method is not reachable for IDLE state
    }

    @Override
    public void NoFunds() {
        //This method is not reachable for IDLE state
    }

    @Override
    public void Lock() {
        System.out.println("\nWARNING: Login needed. Lock("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void IncorrectLock() {
        //This method is not reachable for IDLE state
    }

    @Override
    public void Unlock() {
        System.out.println("\nWARNING: Login needed. Unlock("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void IncorrectUnlock() {
        //This method is not reachable for IDLE state
    }

    @Override
    public void Suspend() {
        System.out.println("\nWARNING: Login needed. Suspend("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Activate() {
        System.out.println("\nWARNING: Login needed. Activate("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Close() {
        System.out.println("\nWARNING: Login needed. Close("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }
}
