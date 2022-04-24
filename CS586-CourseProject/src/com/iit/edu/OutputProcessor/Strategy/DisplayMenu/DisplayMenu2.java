package com.iit.edu.OutputProcessor.Strategy.DisplayMenu;

public class DisplayMenu2 extends DisplayMenu {

    @Override
    public void DisplayMenu() {
        System.out.println("-----------------------------TRANSACTION MENU FOR ACCOUNT 2 ------------------------------");
        System.out.println("Balance Enquiry");
        System.out.println("Deposit");
        System.out.println("Withdraw");
        System.out.println("Suspend");
        System.out.println("Activate");
        System.out.println("Close");
        System.out.println("Logout");
    }
}
