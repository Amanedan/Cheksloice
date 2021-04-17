package com.amanedan;

import java.util.Scanner;

public class Main {
    static double accountBalance = 5000;
    //user input
    static Scanner userInput = new Scanner(System.in);
    //withdraw
    static double accountWithdraw(double x){
        double newAccountBalance = accountBalance - x;
        accountBalance = newAccountBalance;
        return accountBalance;
    }
    //deposit
    static double accountDeposit(double x){
        double newAccountBalance = accountBalance + x;
        accountBalance = newAccountBalance;
        return accountBalance;
    }
    public static void main(String[] args) {

        //starts app with a number command
        boolean running = false;
        int startCommand = userInput.nextInt();
        if(startCommand == 0){
            running = true;
        }else{
            System.out.println("not running");
        }
        while(running){
            //menu
            System.out.println("=============================");
            System.out.println("== Please Choose An Option ==");
            System.out.println("=============================");
            System.out.println("==== 1 : Check Balance ======");
            System.out.println("==== 2 : Deposit Amount =====");
            System.out.println("==== 3 : Withdraw Amount ====");
            System.out.println("======= 4 : Close App =======");
            System.out.println("=============================");
            //user Input
            int userChoice = userInput.nextInt();

            if(userChoice == 1){
                System.out.println(accountBalance);
            }else if(userChoice == 2){
                System.out.println("===================================");
                System.out.println("== Please enter amount to Deposit =");
                System.out.println("===================================");
                double depositAmount = userInput.nextDouble();
                accountDeposit(depositAmount);
                System.out.println("Your new account balance is " + accountBalance);
            }else if(userChoice == 3){
                System.out.println("===================================");
                System.out.println("= Please enter amount to Withdraw =");
                System.out.println("===================================");
                double withdrawAmount = userInput.nextDouble();
                accountWithdraw(withdrawAmount);
                System.out.println("Your new account balance is " + accountBalance);
            }else if(userChoice == 4) {
                running = false;
            }else{
                    System.out.println("Invalid input. Your balance is " + accountBalance);
            }
        }
    }
}