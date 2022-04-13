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
        System.out.println("CS587 - DRIVER FOR ACCOUNT CLASS");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("1. Account 1");
        System.out.println("2. Account 2");
        System.out.println("Q. Quit Driver");
    }

    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //Initialize reader for input

        int returnStatus;
        String input = Constants.START;
        String previousAccountStatus;

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


                        while (!input.equalsIgnoreCase("Q")) {         //Iterative call to while loop until exit (Option Q)
                            outputProcessor.DisplayMenu();
                            System.out.println("Enter your choice>>>>");
                            input = reader.readLine();

                            switch (input.toUpperCase()) {
                                case "1": {
                                    System.out.println("Enter User Identification Number:");
                                    int userIdentificationNumber = Integer.parseInt(reader.readLine());

                                    System.out.println("Enter PIN:");
                                    int pin = Integer.parseInt(reader.readLine());

                                    System.out.println("Enter Opening Balance ($):");
                                    int openingBalance = Integer.parseInt(reader.readLine());

                                    account1.open(pin, userIdentificationNumber, openingBalance);

                                    break;
                                }

                                case "2": {
                                    System.out.println("Enter Login Identification Number:");
                                    int userIdentificationNumber = Integer.parseInt(reader.readLine());

                                    account1.login(userIdentificationNumber);

                                    break;
                                }

                                case "3": {
                                    System.out.println("Enter PIN:");
                                    int pin = Integer.parseInt(reader.readLine());

                                    account1.pin(pin);

                                    break;
                                }

                                case "4": {
                                    System.out.println("Enter amount to be deposited:");
                                    int deposit = Integer.parseInt(reader.readLine());

                                    account1.deposit(deposit);

                                    break;
                                }

                                case "5": {
                                    System.out.println("Enter amount to be withdrawn:");
                                    int withdraw = Integer.parseInt(reader.readLine());

                                    account1.withdraw(withdraw);

                                    break;
                                }

                                case "6": {
                                    System.out.println("Balance Enquiry:");
                                    account1.balance();
                                    break;
                                }

                                case "7": {
                                    System.out.println("Enter PIN to lock account:");
                                    int pin = Integer.parseInt(reader.readLine());

                                    account1.lock(pin);

                                    break;
                                }

                                case "8": {
                                    System.out.println("Enter PIN to unlock account:");
                                    int pin = Integer.parseInt(reader.readLine());

                                    account1.unlock(pin);

                                    break;
                                }

                                case "9": {
                                    System.out.println("Logout of Account:");
                                    account1.logout();
                                    break;
                                }

                                default: {
                                    System.out.println("Invalid Input. Please choose again!!!!");
                                    break;
                                }
                            }
                        }
                    }
                    default: {
                        System.out.println("Invalid Input. Please choose again!!!!");
                        break;
                    }
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Invalid input: " + numberFormatException.getMessage());
            }
        }
    }
}
