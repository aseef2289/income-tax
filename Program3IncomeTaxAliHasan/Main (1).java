/*
* File Name: Main.java
* Author: Aseef Ali Hasan
* Date: August 5, 2021
* Description:
* This is a program that calculates how much income tax the user owes to the government
* Displays tax owed in dollars ($)
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //declare variables and constants
    Scanner typedInput = new Scanner(System.in);//scanner object used for keyboard input
    double userSalary; //stores user's salary
    double taxRate; //stores user's tax rate
    double baseAmount; //stores user's base amount
    double incomeTax; //stores value income tax that is calculated
    double baseTax; //stores value of base owed that is calculated
    double totalTax; //stores total value of tax that is owed
    String finalStatement; //final statement that will be displayed to user

    //data input
    System.out.print("What is your salary in dollars? "); //asks user's salary
    userSalary = typedInput.nextDouble(); //gets user's salary
    /*
    *Lines 27 to 33 give the user information about tax rates
    *The user uses this information to determine their tax rate given their income
    */
    System.out.println("If your income is $49,020 and under your tax rate is 15%");
    System.out.println("If your income is between $49,020 and $98,040 your tax rate is 20.5%");
    System.out.println("If your income is between $98,040 and $151,978 your tax rate is 26%");
    System.out.println("If your income is between $151,978 and $216,511 your tax rate is 29%");
    System.out.println("If your income is between over $216,511 your tax rate is 33%");
    System.out.print("Based on the information provided, what is the tax rate for your salary as a decimal? "); //asks for user's tax rate 
    taxRate = typedInput.nextDouble(); //gets user's tax rate
    /*
    *Lines 42 to 47 give the user information base values
    *The user uses this information to determine the base value for their income
    */
    System.out.println("If your income is $49,020 and under your base amount is -0");
    System.out.println("If your income is between $49,020 and $98,040 your tax rate is −49,020.00");
    System.out.println("If your income is between $98,040 and $151,978 your tax rate is −98,040.00");
    System.out.println("If your income is between $151,978 and $216,511 your tax rate is −151,978.00");
    System.out.println("If your income is between over $216,511 your tax rate is −216,511.00");
    System.out.print("Based on the information provided, what is your base amount for your salary? "); //asks for user's base amount
    baseAmount = typedInput.nextDouble(); //gets user's base amount

    //data processing
    incomeTax = (userSalary - baseAmount) * taxRate; //calculates the amount of income tax
    baseTax = baseAmount * taxRate; //calculates the amount of base tax
    totalTax = incomeTax + baseTax; //calculates the total amount of tax owed to the government

    finalStatement = "The total amount of income tax you owe is $" + totalTax; //+ concentrates the text and double value
    System.out.println(finalStatement); //displays final statement to user
    typedInput.close(); //closes scanner object

  }
}