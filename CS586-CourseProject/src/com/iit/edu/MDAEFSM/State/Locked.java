package com.iit.edu.MDAEFSM.State;

import com.iit.edu.Constants;
import com.iit.edu.MDAEFSM.MDAEFSM;

public class Locked implements State{
    MDAEFSM mdaEfsm;                                            //Create MDAEFSM Object needed for Locked State operations
    public Locked(MDAEFSM mdaEfsm) {
        this.mdaEfsm = mdaEfsm;
    }  //Constructor to initialize MDAEFSM

    @Override
    public void Open() {
        System.out.println("\nWARNING: Account is locked. Open("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Login() {
        System.out.println("\nWARNING: Account is locked. Login("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void IncorrectLogin() {
        System.out.println("\nWARNING: Account is locked. Login("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void CorrectPinBelowMin() {
        System.out.println("\nWARNING: Account is locked. Pin("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void CorrectPinAboveMin() {
        System.out.println("\nWARNING: Account is locked. Pin("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void IncorrectPin(int max) {
        System.out.println("\nWARNING: Account is locked. Pin("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Deposit() {
        System.out.println("\nWARNING: Account is locked. Deposit("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void BelowMinBalance() {
        //This method is not reachable for LOCKED state
    }

    @Override
    public void AboveMinBalance() {
        //This method is not reachable for LOCKED state
    }

    @Override
    public void Balance() {
        System.out.println("\nWARNING: Account is locked. Balance("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Logout() {
        System.out.println("\nWARNING: Account is locked. Logout("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Withdraw() {
        System.out.println("\nWARNING: Account is locked. Withdraw("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void WithdrawBelowMinBalance() {
        //This method is not reachable for LOCKED state
    }

    @Override
    public void NoFunds() {
        //This method is not reachable for LOCKED state
    }

    @Override
    public void Lock() {
        System.out.println("\nWARNING: Account already locked. Lock("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void IncorrectLock() {
        System.out.println("\nWARNING: Account already locked. Lock("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Unlock() {
        mdaEfsm.changeState(Constants.S1);
    }

    @Override
    public void IncorrectUnlock() {
        mdaEfsm.outputProcessor.IncorrectUnlockMsg();
    }

    @Override
    public void Suspend() {
        //This method is not reachable for LOCKED state
    }

    @Override
    public void Activate() {
        //This method is not reachable for LOCKED state
    }

    @Override
    public void Close() {
        //This method is not reachable for LOCKED state
    }
}
