package com.iit.edu.MDAEFSM.State;

public interface State {

        public void Open();
        public void Login();
        public void IncorrectLogin();
        public void CorrectPinBelowMin();
        public void CorrectPinAboveMin();
        public void IncorrectPin(int max);
        public void Deposit();
        public void BelowMinBalance();
        public void AboveMinBalance();
        public void Balance();
        public void Logout();
        public void Withdraw();
        public void WithdrawBelowMinBalance();
        public void NoFunds();
        public void Lock();
        public void IncorrectLock();
        public void Unlock();
        public void IncorrectUnlock();
        public void Suspend();
        public void Activate();
        public void Close();
}
