package com.iit.edu.OutputProcessor.Strategy.DisplayMenu;

public class DisplayMenu1 extends DisplayMenu {

    @Override
    public void DisplayAccountMenu() {
        System.out.println("-----------------------------TRANSACTION MENU FOR ACCOUNT 1 ------------------------------");
        System.out.println("Balance Enquiry");
        System.out.println("Deposit");
        System.out.println("Withdraw");
        System.out.println("Lock");
        System.out.println("Unlock");
        System.out.println("Logout");
    }
}
