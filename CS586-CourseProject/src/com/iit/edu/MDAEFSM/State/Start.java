package com.iit.edu.MDAEFSM.State;

import com.iit.edu.Constants;

public class Start extends State {

    @Override
    public void Open() {
        outputProcessor.StoreData();
        mdaEfsm.changeState(Constants.IDLE);
        System.out.println("Login to continue.....");
    }

    @Override
    public void Login() {
        //This method is not reachable for Start state
    }

    @Override
    public void IncorrectLogin() {
        System.out.println("\nWARNING: Account is not opened yet. Login("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void CorrectPinBelowMin() {
        //This method is not reachable for Start state
    }

    @Override
    public void CorrectPinAboveMin() {
        //This method is not reachable for Start state
    }

    @Override
    public void IncorrectPin(int max) {
        System.out.println("\nWARNING: Account is not opened yet. Pin("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Deposit() {
        System.out.println("\nWARNING: Account is not opened yet. Deposit("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void BelowMinBalance() {
        //This method is not reachable for Start state
    }

    @Override
    public void AboveMinBalance() {
        //This method is not reachable for Start state
    }

    @Override
    public void Balance() {
        System.out.println("\nWARNING: Account is not opened yet. Balance("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Logout() {
        System.out.println("\nWARNING: Account is not opened yet. Logout("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Withdraw() {
        System.out.println("\nWARNING: Account is not opened yet. Withdraw("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void WithdrawBelowMinBalance() {
        //This method is not reachable for Start state
    }

    @Override
    public void NoFunds() {
        System.out.println("\nWARNING: Account is not opened yet. Withdraw("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Lock() {
        //This method is not reachable for Start state
    }

    @Override
    public void IncorrectLock() {
        System.out.println("\nWARNING: Account is not opened yet. Lock("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Unlock() {
        //This method is not reachable for Start state
    }

    @Override
    public void IncorrectUnlock() {
        System.out.println("\nWARNING: Account is not opened yet. Unlock("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Suspend() {
        System.out.println("\nWARNING: Account is not opened yet. Suspend("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Activate() {
        System.out.println("\nWARNING: Account is not opened yet. Activate("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Close() {
        System.out.println("\nWARNING: Account is not opened yet. Close("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }
}
