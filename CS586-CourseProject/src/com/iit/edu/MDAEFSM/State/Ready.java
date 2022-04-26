package com.iit.edu.MDAEFSM.State;

import com.iit.edu.Constants;
import com.iit.edu.MDAEFSM.MDAEFSM;

public class Ready implements State{
    MDAEFSM mdaEfsm;                                            //Create MDAEFSM Object needed for Ready State operations

    public Ready(MDAEFSM mdaEfsm) {     //Constructor to initialize MDAEFSM
        this.mdaEfsm = mdaEfsm;
    }   //Constructor to initialize MDAEFSM

    @Override
    public void Open() {
        System.out.println("\nWARNING: Account is already opened. Open("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Login() {
        System.out.println("\nWARNING: Account is already logged in. Login("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void IncorrectLogin() {
        System.out.println("\nWARNING: Account is already logged in. Login("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void CorrectPinBelowMin() {
        //This method is not reachable for READY state
    }

    @Override
    public void CorrectPinAboveMin() {
        System.out.println("\nWARNING: Account is already logged in. Pin("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void IncorrectPin(int max) {
        System.out.println("\nWARNING: Account is already logged in. Pin("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Deposit() {
        mdaEfsm.outputProcessor.MakeDeposit();
    }

    @Override
    public void BelowMinBalance() {
        //This method is not reachable for READY state
    }

    @Override
    public void AboveMinBalance() {
        //This method is not reachable for READY state
    }

    @Override
    public void Balance() {
        mdaEfsm.outputProcessor.DisplayBalance();
    }

    @Override
    public void Logout() {
        mdaEfsm.changeState(Constants.IDLE);
    }

    @Override
    public void Withdraw() {
        mdaEfsm.outputProcessor.MakeWithdraw();
        mdaEfsm.changeState(Constants.S1);
    }

    @Override
    public void WithdrawBelowMinBalance() {
        //This method is not reachable for READY state
    }

    @Override
    public void NoFunds() {
        mdaEfsm.outputProcessor.NoFundsMsg();
    }

    @Override
    public void Lock() {
        mdaEfsm.changeState(Constants.LOCKED);
    }

    @Override
    public void IncorrectLock() {
        mdaEfsm.outputProcessor.IncorrectLockMsg();
    }

    @Override
    public void Unlock() {
        System.out.println("\nWARNING: Account is already unlocked. Unlock("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void IncorrectUnlock() {
        System.out.println("\nWARNING: Account is already unlocked. Unlock("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Suspend() {
        mdaEfsm.changeState(Constants.SUSPENDED);
    }

    @Override
    public void Activate() {
        System.out.println("\nWARNING: Account is not suspended. Activate("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Close() {
        System.out.println("\nWARNING: Account is not suspended. Close("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }
}
