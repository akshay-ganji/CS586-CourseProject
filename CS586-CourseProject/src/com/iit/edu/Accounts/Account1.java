package com.iit.edu.Accounts;

import com.iit.edu.Constants;
import com.iit.edu.MDAEFSM.MDAEFSM;
import com.iit.edu.DataStore.*;

public class Account1 {

        MDAEFSM mdaEfsm = null;
        DataStore dataStore = null;

        public Account1(MDAEFSM mdaEfsm, DataStore dataStore)
        {
            this.mdaEfsm = mdaEfsm;
            this.dataStore = dataStore;
        }

        public void open(int p,int y,int a)
        {
            ((DataStore1) dataStore).temp_p = p;
            ((DataStore1) dataStore).temp_y = y;
            ((DataStore1) dataStore).temp_a = a;
            mdaEfsm.Open();
        }

        public void login(int y)
        {
            if(y == ((DataStore1) dataStore).getId() )
            mdaEfsm.Login();
            else
            mdaEfsm.IncorrectLogin();
        }

        public void pin(int x )
        {
            if( x == ((DataStore1) dataStore).getPin() )
            {
                if( ((DataStore1) dataStore).getBalance() > 100 )
                    mdaEfsm.CorrectPinAboveMin();
                else
                    mdaEfsm.CorrectPinBelowMin();
            }
            else
            {
                mdaEfsm.IncorrectPin(3);
            }
        }

        public void deposit(int d)
        {
            ((DataStore1) dataStore).temp_d = d;
            mdaEfsm.Deposit();

            if( ((DataStore1) dataStore).getBalance() > Constants.MIN_ACCOUNT1_BALANCE)
            {
                mdaEfsm.AboveMinBalance();
            } else {
                mdaEfsm.BelowMinBalance();
            }
        }

        public void balance()
        {
            mdaEfsm.Balance();
        }

        public void logout()
        {
            mdaEfsm.Logout();
        }

        public void withdraw(int w)
        {
            ((DataStore1) dataStore).temp_w = w;
            mdaEfsm.Withdraw();

            if( ((DataStore1) dataStore).getBalance() > Constants.MIN_ACCOUNT1_BALANCE )
            {
                mdaEfsm.AboveMinBalance();
            }
            else
            {
                mdaEfsm.WithdrawBelowMinBalance();
            }
        }

        public void lock(int x) {
            System.out.println(((DataStore1) dataStore).getPin());
            if (x == ((DataStore1) dataStore).getPin()) {
                mdaEfsm.Lock();
                mdaEfsm.getCurrentState();
            } else {
                mdaEfsm.IncorrectLock();
                mdaEfsm.getCurrentState();
            }
        }

       public void unlock(int x)
        {
            if( x == (((DataStore1) dataStore).getPin() ) )
            {
                mdaEfsm.Unlock();

                if( ((DataStore1) dataStore).getBalance() > Constants.MIN_ACCOUNT1_BALANCE )
                {
                    mdaEfsm.AboveMinBalance();
                }
                else
                {
                    mdaEfsm.BelowMinBalance();
                }
            }
            else
                mdaEfsm.IncorrectUnlock();

        }
}
