package com.iit.edu;

import com.iit.edu.AbstractFactory.ConcreteFactory1;
import com.iit.edu.Accounts.Account1;
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
        System.out.println("CS586 - DRIVER FOR ACCOUNT CLASS");
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
                        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>> ACCOUNT-1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                        ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
                        OutputProcessor outputProcessor = new OutputProcessor(concreteFactory1.getDataStore(), concreteFactory1);
                        MDAEFSM mdaEfsm = new MDAEFSM(concreteFactory1, outputProcessor);
                        Account1 account1 = new Account1(mdaEfsm, concreteFactory1.getDataStore());

                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("-----------------------------ACCOUNT1 CLASS MENU--------------------------");
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("1. open(int,int,int)");
                        System.out.println("2. login(int)");
                        System.out.println("3. pin(int)");
                        System.out.println("4. deposit(int)");
                        System.out.println("5. withdraw(int)");
                        System.out.println("6. balance()");
                        System.out.println("7. lock(int)");
                        System.out.println("8. unlock(int)");
                        System.out.println("9. logout()");
                        System.out.println("Q. Quit from application demo");
                        System.out.println("--------------------------------------------------------------------------");

                        while (!input.equalsIgnoreCase("Q")) {         //Iterative call to while loop until exit (Option Q)

                            System.out.println("Select Operation:1-open,2-login,3-pin,4-deposit,5-withdraw,6-balance,7-lock,8-unlock,9-logout");

                            input = reader.readLine();

                            switch (input.toUpperCase()) {
                                case "1": {
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

                                case "2": {
                                    System.out.println("Operation: login(int y)");
                                    System.out.println("Enter User Identification Number to login (y):");
                                    int userIdentificationNumber = Integer.parseInt(reader.readLine());

                                    account1.login(userIdentificationNumber);

                                    break;
                                }

                                case "3": {
                                    System.out.println("Operation: pin(int x)");
                                    System.out.println("Enter PIN (x):");
                                    int pin = Integer.parseInt(reader.readLine());

                                    account1.pin(pin);

                                    break;
                                }

                                case "4": {
                                    System.out.println("Operation: deposit(int d)");
                                    System.out.println("Enter amount to be deposited (d):");
                                    int deposit = Integer.parseInt(reader.readLine());

                                    account1.deposit(deposit);

                                    break;
                                }

                                case "5": {
                                    System.out.println("Operation: withdraw(int w)");
                                    System.out.println("Enter amount to be withdrawn (w):");
                                    int withdraw = Integer.parseInt(reader.readLine());

                                    account1.withdraw(withdraw);

                                    break;
                                }

                                case "6": {
                                    System.out.println("Operation: balance()");
                                    System.out.println("Balance Enquiry:");
                                    account1.balance();
                                    break;
                                }

                                case "7": {
                                    System.out.println("Operation: lock(int x)");
                                    System.out.println("Enter PIN to lock account (x):");
                                    int pin = Integer.parseInt(reader.readLine());

                                    account1.lock(pin);

                                    break;
                                }

                                case "8": {
                                    System.out.println("Operation: unlock(int x)");
                                    System.out.println("Enter PIN to unlock account (x):");
                                    int pin = Integer.parseInt(reader.readLine());

                                    account1.unlock(pin);

                                    break;
                                }

                                case "9": {
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
                                    System.out.println("Invalid Choice. Please choose again!!!!");
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