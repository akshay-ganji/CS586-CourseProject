package com.iit.edu.OutputProcessor.Strategy.DisplayMenu;

public class DisplayMenu2 extends DisplayMenu {

    @Override
    public void DisplayMenu() {
        System.out.println("    Account 2" );
        System.out.println("...........................");
        System.out.println("Transaction Menu:");
        System.out.println("   Balance " );
        System.out.println("   Deposit " );
        System.out.println("   Withdraw " );
        System.out.println("Account Menu");
        System.out.println("   Lock " );
        System.out.println("   Unlock");
        System.out.println("   Logout " );
    }
}
