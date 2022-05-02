package com.iit.edu.MDAEFSM.State;

import com.iit.edu.Constants;

public class CheckPin extends State {

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
        outputProcessor.DisplayMenu();
        mdaEfsm.changeState(Constants.OVERDRAWN);
    }

    @Override
    public void CorrectPinAboveMin() {
        outputProcessor.DisplayMenu();
        mdaEfsm.changeState(Constants.READY);

    }

    @Override
    public void IncorrectPin(int max) {
        if(mdaEfsm.attempts < max)
        {
            mdaEfsm.attempts ++;
            outputProcessor.IncorrectPinMsg();
        }else if(mdaEfsm.attempts==max){
            outputProcessor.IncorrectPinMsg();
            outputProcessor.TooManyAttemptsMsg();
            mdaEfsm.changeState(Constants.IDLE);
        }
    }

    @Override
    public void Deposit() {
        System.out.println("\nWARNING: Validate PIN needed. Deposit("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void BelowMinBalance() {
        //This method is not reachable for CHECK_PIN state
    }

    @Override
    public void AboveMinBalance() {
        //This method is not reachable for CHECK_PIN state
    }

    @Override
    public void Balance() {
        System.out.println("\nWARNING: Validate PIN needed. Balance("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Logout() {
        mdaEfsm.changeState(Constants.IDLE);
    }

    @Override
    public void Withdraw() {
        System.out.println("\nWARNING: Validate PIN needed. Withdraw("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void WithdrawBelowMinBalance() {
        //This method is not reachable for CHECK_PIN state
    }

    @Override
    public void NoFunds() {
        //This method is not reachable for CHECK_PIN state
    }

    @Override
    public void Lock() {
        System.out.println("\nWARNING: Validate PIN needed. Lock("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void IncorrectLock() {
        System.out.println("\nWARNING: Validate PIN needed. Lock("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Unlock() {
        System.out.println("\nWARNING: Validate PIN needed. Unlock("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void IncorrectUnlock() {
        System.out.println("\nWARNING: Validate PIN needed. Unlock("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Suspend() {
        System.out.println("\nWARNING: Validate PIN needed. Suspend("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Activate() {
        System.out.println("\nWARNING: Validate PIN needed. Activate("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }

    @Override
    public void Close() {
        System.out.println("\nWARNING: Validate PIN needed. Close("+ Constants.OPERATION_NOT_SUPPORTED+ ")!!!");
    }
}
