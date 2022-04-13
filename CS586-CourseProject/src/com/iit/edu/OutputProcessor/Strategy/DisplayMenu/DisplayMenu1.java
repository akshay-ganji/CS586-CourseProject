package com.iit.edu.OutputProcessor.Strategy.DisplayMenu;

public class DisplayMenu1 extends DisplayMenu {

    @Override
    public void DisplayMenu() {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("-------------------------------ACCOUNT1 CLASS-----------------------------");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("1. Open Account");
        System.out.println("2. Login to Account");
        System.out.println("3. PIN");
        System.out.println("4. Deposit to Account");
        System.out.println("5. Withdraw from Account");
        System.out.println("6. Balance Enquiry");
        System.out.println("7. Lock");
        System.out.println("8. Unlock");
        System.out.println("9. Logout");
        System.out.println("X. Quit from Account 1");
        System.out.println("--------------------------------------------------------------------------");
    }
}
