package com.iit.edu.MDAEFSM.State;

import com.iit.edu.Constants;
import com.iit.edu.MDAEFSM.MDAEFSM;

public class OverDrawn implements State{
    MDAEFSM mdaEfsm;                                                //Create MDAEFSM Object needed for Overdrawn State operations
    public OverDrawn(MDAEFSM mdaEfsm) {
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
        System.out.println("\nWARNING: Account is already logged in. Pin("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void CorrectPinAboveMin() {
        //This method is not reachable for OVERDRAWN state
    }

    @Override
    public void IncorrectPin(int max) {
        System.out.println("\nWARNING: Account is already logged in. Pin("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Deposit() {
      mdaEfsm.outputProcessor.MakeDeposit();
      mdaEfsm.changeState(Constants.S1);
    }

    @Override
    public void BelowMinBalance() {
        //This method is not reachable for OVERDRAWN state
    }

    @Override
    public void AboveMinBalance() {
        //This method is not reachable for OVERDRAWN state
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
        mdaEfsm.outputProcessor.NoFundsMsg();
    }

    @Override
    public void WithdrawBelowMinBalance() {
        //This method is not reachable for OVERDRAWN state
    }

    @Override
    public void NoFunds() {
        //This method is not reachable for OVERDRAWN state
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
        System.out.println("\nWARNING: Account is not in locked state. Unlock("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void IncorrectUnlock() {
        System.out.println("\nWARNING: Account is not in locked state. Unlock("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Suspend() {
        //This method is not reachable for OVERDRAWN state
    }

    @Override
    public void Activate() {
        //This method is not reachable for OVERDRAWN state
    }

    @Override
    public void Close() {
        //This method is not reachable for OVERDRAWN state
    }
}
