package com.iit.edu.MDAEFSM.State;

import com.iit.edu.MDAEFSM.MDAEFSM;
import com.iit.edu.OutputProcessor.OutputProcessor;
/*
    STATE PATTERN IMPLEMENTATION
    Abstract class for all state operations
 */
public abstract class State {
        OutputProcessor outputProcessor;
        MDAEFSM mdaEfsm;

        public abstract void Open();
        public abstract void Login();
        public abstract void IncorrectLogin();
        public abstract void CorrectPinBelowMin();
        public abstract void CorrectPinAboveMin();
        public abstract void IncorrectPin(int max);
        public abstract void Deposit();
        public abstract void BelowMinBalance();
        public abstract void AboveMinBalance();
        public abstract void Balance();
        public abstract void Logout();
        public abstract void Withdraw();
        public abstract void WithdrawBelowMinBalance();
        public abstract void NoFunds();
        public abstract void Lock();
        public abstract void IncorrectLock();
        public abstract void Unlock();
        public abstract void IncorrectUnlock();
        public abstract void Suspend();
        public abstract void Activate();
        public abstract void Close();

        public void setOutputProcessor(OutputProcessor outputProcessor){
                this.outputProcessor = outputProcessor;
        }

        public void setMDAEFSM(MDAEFSM mdaEfsm){
                this.mdaEfsm = mdaEfsm;
        }
}
