package com.iit.edu.MDAEFSM.State;

import com.iit.edu.Constants;
import com.iit.edu.MDAEFSM.MDAEFSM;

public class Suspended implements State{

    MDAEFSM mdaEfsm;                                                //Create MDAEFSM Object needed for Suspended State operations

    public Suspended(MDAEFSM mdaEfsm) {
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
        //This method is not reachable for Suspended state
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
        System.out.println("\nWARNING: Account is suspended. Deposit("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void BelowMinBalance() {
        //This method is not reachable for Suspended state
    }

    @Override
    public void AboveMinBalance() {
        //This method is not reachable for Suspended state
    }

    @Override
    public void Balance() {
        mdaEfsm.outputProcessor.DisplayBalance();
    }

    @Override
    public void Logout() {
        System.out.println("\nWARNING: Account is suspended. Logout("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Withdraw() {
        System.out.println("\nWARNING: Account is suspended. Withdraw("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void WithdrawBelowMinBalance() {
        //This method is not reachable for Suspended state
    }

    @Override
    public void NoFunds() {
        //This method is not reachable for Suspended state
    }

    @Override
    public void Lock() {
        //This method is not reachable for Suspended state
    }

    @Override
    public void IncorrectLock() {
        //This method is not reachable for Suspended state
    }

    @Override
    public void Unlock() {
        //This method is not reachable for Suspended state
    }

    @Override
    public void IncorrectUnlock() {
        //This method is not reachable for Suspended state
    }

    @Override
    public void Suspend() {
        System.out.println("\nWARNING: Account is already suspended. Suspend("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Activate() {
        mdaEfsm.changeState(Constants.READY);
    }

    @Override
    public void Close() {
        System.out.println("Account 2 has been terminated");
        System.exit(0);
    }
}
