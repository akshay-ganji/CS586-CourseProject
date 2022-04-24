package com.iit.edu;

import com.iit.edu.AbstractFactory.ConcreteFactory1;
import com.iit.edu.AbstractFactory.ConcreteFactory2;
import com.iit.edu.Accounts.Account1;
import com.iit.edu.Accounts.Account2;
import com.iit.edu.MDAEFSM.MDAEFSM;
import com.iit.edu.OutputProcessor.OutputProcessor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {

    /**
     * This method is used to display the command line arguments for the application
     */
    public static void AccountTypeMessage() {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("              CS586 - DRIVER FOR ACCOUNT CLASS OPERATIONS                 ");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("1. ACCOUNT 1");
        System.out.println("2. ACCOUNT 2");
        System.out.println("Q. Quit Driver");
    }

    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //Initialize reader for input

        String input = Constants.START;
        AccountTypeMessage();

        while (!input.equalsIgnoreCase("Q")) {         //Iterative call to while loop until exit (Option Q)

            System.out.println("Enter your choice>>>>");
            input = reader.readLine();

            try {
                switch (input) {
                    //Method handler for Account Open
                    case "1": {
                        ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
                        OutputProcessor outputProcessor = new OutputProcessor(concreteFactory1.getDataStore(), concreteFactory1);
                        MDAEFSM mdaEfsm = new MDAEFSM(concreteFactory1, outputProcessor);
                        Account1 account1 = new Account1(mdaEfsm, concreteFactory1.getDataStore());

                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("                            ACCOUNT1 CLASS MENU                           ");
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("0. open(int,int,int)");
                        System.out.println("1. login(int)");
                        System.out.println("2. pin(int)");
                        System.out.println("3. deposit(int)");
                        System.out.println("4. withdraw(int)");
                        System.out.println("5. balance()");
                        System.out.println("6. lock(int)");
                        System.out.println("7. unlock(int)");
                        System.out.println("8. logout()");
                        System.out.println("Q. Quit from application demo");
                        System.out.println("--------------------------------------------------------------------------");

                        while (!input.equalsIgnoreCase("Q")) {         //Iterative call to while loop until exit (Option Q)

                            System.out.println("Select Operation:0-open,1-login,2-pin,3-deposit,4-withdraw,5-balance,6-lock,7-unlock,8-logout");

                            input = reader.readLine();

                            switch (input.toUpperCase()) {
                                case "0": {
                                    System.out.println("Operation: open(int p, int y, int a)");
                                    System.out.println("Enter User Identification Number (y):");
                                    int userIdentificationNumber = Integer.parseInt(reader.readLine());

                                    System.out.println("Enter PIN (p):");
                                    int pin = Integer.parseInt(reader.readLine());

                                    System.out.println("Enter Opening Balance (a):");
                                    int openingBalance = Integer.parseInt(reader.readLine());

                                    account1.open(pin, userIdentificationNumber, openingBalance);

                                    break;
                                }

                                case "1": {
                                    System.out.println("Operation: login(int y)");
                                    System.out.println("Enter User Identification Number to login (y):");
                                    int userIdentificationNumber = Integer.parseInt(reader.readLine());

                                    account1.login(userIdentificationNumber);

                                    break;
                                }

                                case "2": {
                                    System.out.println("Operation: pin(int x)");
                                    System.out.println("Enter PIN (x):");
                                    int pin = Integer.parseInt(reader.readLine());

                                    account1.pin(pin);

                                    break;
                                }

                                case "3": {
                                    System.out.println("Operation: deposit(int d)");
                                    System.out.println("Enter amount to be deposited (d):");
                                    int deposit = Integer.parseInt(reader.readLine());

                                    account1.deposit(deposit);

                                    break;
                                }

                                case "4": {
                                    System.out.println("Operation: withdraw(int w)");
                                    System.out.println("Enter amount to be withdrawn (w):");
                                    int withdraw = Integer.parseInt(reader.readLine());

                                    account1.withdraw(withdraw);

                                    break;
                                }

                                case "5": {
                                    System.out.println("Operation: balance()");
                                    System.out.println("Balance Enquiry:");
                                    account1.balance();
                                    break;
                                }

                                case "6": {
                                    System.out.println("Operation: lock(int x)");
                                    System.out.println("Enter PIN to lock account (x):");
                                    int pin = Integer.parseInt(reader.readLine());

                                    account1.lock(pin);

                                    break;
                                }

                                case "7": {
                                    System.out.println("Operation: unlock(int x)");
                                    System.out.println("Enter PIN to unlock account (x):");
                                    int pin = Integer.parseInt(reader.readLine());

                                    account1.unlock(pin);

                                    break;
                                }

                                case "8": {
                                    System.out.println("Operation: logout()");
                                    System.out.println("Logout of Account:");
                                    account1.logout();
                                    break;
                                }

                                case "Q" :
                                {
                                    System.out.println("Exiting Account 1 Operations");
                                    break;
                                }

                                default: {
                                    System.out.println("Invalid Choice for Account 1. Please choose again!!!!");
                                    break;
                                }
                            }
                        }
                    }

                    case "2": {
                        ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();
                        OutputProcessor outputProcessor = new OutputProcessor(concreteFactory2.getDataStore(), concreteFactory2);
                        MDAEFSM mdaEfsm = new MDAEFSM(concreteFactory2, outputProcessor);
                        Account2 account2 = new Account2(mdaEfsm, concreteFactory2.getDataStore());

                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("                            ACCOUNT2 CLASS MENU                           ");
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("0. OPEN(int,int,float)");
                        System.out.println("1. LOGIN(int)");
                        System.out.println("2. PIN(int)");
                        System.out.println("3. DEPOSIT(float)");
                        System.out.println("4. WITHDRAW(float)");
                        System.out.println("5. BALANCE()");
                        System.out.println("6. LOGOUT()");
                        System.out.println("7. suspend()");
                        System.out.println("8. activate()");
                        System.out.println("9. close()");
                        System.out.println("Q. Quit from application demo");
                        System.out.println("--------------------------------------------------------------------------");

                        while (!input.equalsIgnoreCase("Q")) {         //Iterative call to while loop until exit (Option Q)

                            System.out.println("Select Operation:0-OPEN,1-LOGIN,2-PIN,3-DEPOSIT,4-WITHDRAW,5-BALANCE,6-LOGOUT,7-suspend,8-activate,9-close");

                            input = reader.readLine();

                            switch (input.toUpperCase()) {
                                case "0": {
                                    System.out.println("Operation: OPEN(int p, int y, float a)");
                                    System.out.println("Enter User Identification Number (y):");
                                    int userIdentificationNumber = Integer.parseInt(reader.readLine());

                                    System.out.println("Enter PIN (p):");
                                    int pin = Integer.parseInt(reader.readLine());

                                    System.out.println("Enter Opening Balance (a):");
                                    float openingBalance = Float.parseFloat(reader.readLine());

                                    account2.OPEN(pin, userIdentificationNumber, openingBalance);

                                    break;
                                }

                                case "1": {
                                    System.out.println("Operation: LOGIN(int y)");
                                    System.out.println("Enter User Identification Number to login (y):");
                                    int userIdentificationNumber = Integer.parseInt(reader.readLine());

                                    account2.LOGIN(userIdentificationNumber);

                                    break;
                                }

                                case "2": {
                                    System.out.println("Operation: PIN(int x)");
                                    System.out.println("Enter PIN (x):");
                                    int pin = Integer.parseInt(reader.readLine());

                                    account2.PIN(pin);

                                    break;
                                }

                                case "3": {
                                    System.out.println("Operation: DEPOSIT(float d)");
                                    System.out.println("Enter amount to be deposited (d):");
                                    float deposit = Float.parseFloat(reader.readLine());

                                    account2.DEPOSIT(deposit);

                                    break;
                                }

                                case "4": {
                                    System.out.println("Operation: WITHDRAW(float w)");
                                    System.out.println("Enter amount to be withdrawn (w):");
                                    float withdraw = Float.parseFloat(reader.readLine());

                                    account2.WITHDRAW(withdraw);

                                    break;
                                }

                                case "5": {
                                    System.out.println("Operation: BALANCE()");
                                    System.out.println("Balance Enquiry:");
                                    account2.BALANCE();
                                    break;
                                }

                                case "6": {
                                    System.out.println("Operation: LOGOUT()");
                                    System.out.println("Logout of Account 2:");
                                    account2.LOGOUT();
                                    break;
                                }

                                case "7": {
                                    System.out.println("Operation: suspend()");
                                    System.out.println("Suspend Account 2 temporarily...");
                                    account2.suspend();
                                    break;
                                }

                                case "8": {
                                    System.out.println("Operation: activate()");
                                    System.out.println("Activate Account 2 from suspended state");
                                    account2.activate();
                                    break;
                                }

                                case "9": {
                                    System.out.println("Operation: close()");
                                    System.out.println("Close Account 2:");
                                    account2.close();
                                    break;
                                }

                                case "Q" :
                                {
                                    System.out.println("Exiting Account 2 Operations");
                                    break;
                                }

                                default: {
                                    System.out.println("Invalid Choice for Account 2. Please choose again!!!!");
                                    break;
                                }
                            }
                        }
                    }

                    case "Q" :
                    {
                        System.out.println("Exiting Test Driver. Please run again!!!!");
                        break;
                    }

                    default: {
                        System.out.println("Exiting Test Driver. Please run again!!!!");
                        break;
                    }
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Invalid input: " + numberFormatException.getMessage());
            }
        }
    }
}