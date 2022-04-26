package com.iit.edu.MDAEFSM.State;

public interface State {
        void Open();
        void Login();
        void IncorrectLogin();
        void CorrectPinBelowMin();
        void CorrectPinAboveMin();
        void IncorrectPin(int max);
        void Deposit();
        void BelowMinBalance();
        void AboveMinBalance();
        void Balance();
        void Logout();
        void Withdraw();
        void WithdrawBelowMinBalance();
        void NoFunds();
        void Lock();
        void IncorrectLock();
        void Unlock();
        void IncorrectUnlock();
        void Suspend();
        void Activate();
        void Close();
}
