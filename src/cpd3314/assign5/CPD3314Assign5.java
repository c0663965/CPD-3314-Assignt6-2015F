/* 
 * Copyright 2014 Len Payne <len.payne@lambtoncollege.ca>. 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 */

/* The following exercises are adapted from: 
 * Gaddis, T. (2013). Starting Out with Java: From Control Structures through  
 * Objects. (5th ed.). Upper Saddle River, NJ: Pearson Education. 
 * ISBN: 978-0-13-285583-9 
 */
package cpd3314.assign5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author <Kihoon, Lee>
 */
public class CPD3314Assign5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO: This is a sandbox. 

        /* Modify it and use it to call whatever methods below you want to run.
         * 
         * To be clear: Your task is to create methods. All of the automated
         * tests in CPD3314Assign5Test.java are based on the methods described
         * below. So for example, in Ex#2, you must build the calculateRetail
         * method. The automated tests will tell you if you built it correctly.
         *
         */
        System.out.println("-------------------- Problem1 --------------------");
        doExercise1();   //Retail price 
        
        System.out.println("-------------------- Problem2 --------------------");
        doExercise2();   //Temperature converter
        
        System.out.println("-------------------- Problem3 --------------------");
        doExercise3();   //Distance
        
        System.out.println("-------------------- Problem4 --------------------");
        doExercise4();   //Prime Number
        
        System.out.println("-------------------- Problem5 --------------------");
        doExercise5();   //Even/Odd Number
        
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    /*
     * Exercise #1 - Retail Price Calculator
     * 
     * Write a program that asks the user to enter an item's wholesale cost and 
     * its markup percentage. It should then display the item's retail price. 
     * For example:
     *   - If an item's wholesale cost is 5.00 and its markup percentage is 100 
     *       percent, then the item's retail price is 10.00.
     *   - If an item's wholesale cost is 5.00 and its markup percentage is 50 
     *       percent, then the item's retail price is 7.50.
     * The program should reference a method named calculateRetail that receives 
     * the wholesale cost and the markup percentage as arguments, and returns 
     * the retail price of the item.
     * - Gaddis pg. 316
     */
    // TODO: Build the calculateRetail method here
    public static void doExercise1() {

        double retailPrice, wholeSalePrice, markupPercentage;

        Scanner kb = new Scanner(System.in);

        System.out.print("Input a wholesale price  : ");
        wholeSalePrice = kb.nextDouble();

        System.out.print("Input a markup percentage  : ");
        markupPercentage = kb.nextDouble();

        retailPrice = calculateRetail(wholeSalePrice, markupPercentage);
        System.out.printf("\nThe retail price is %.2f \n \n",retailPrice);
    }

    public static double calculateRetail(double whole, double markup) // The method of Problem1
    {
        return whole * (1 + markup / 100);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Exercise #2 - Celsius Temperature Table
     *
     * The formula for converting a temperature from Fahrenheit to Celsius is C
     * = (5.0/9.0) * (F - 32) Where F is the Fahrenheit temperature and C is the
     * Celsius temperature. Write a method named celsius that accepts a
     * Fahrenheit temperature as an argument. The method should return the
     * temperature, converted to Celsius. Demonstrate the method by calling it
     * in a loop that displays a table of the Fahrenheit temperatures 0 through
     * 20 and their Celsius equivalents.
     */
    // TODO: Build the celsius method here
    public static void doExercise2() {
        
        System.out.println("  F\t  C" + "\n" + "----------------");

        for (double F = 0; F <= 20; F++)
            System.out.printf("%.1f\t%3.1f \n", F, celsius(F));
        System.out.println();
    }

    public static double celsius(double F) //The method of Problem2
    {
        return (5.0 / 9.0) * (F - 32);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////      
    /*
     * Exercise #3 - Distance Traveled Modification
     * 
     * The distance a vehicle travels can be calculated as follows:
     *   Distance = Speed * Time
     * Write a method named distance that accepts a vehicle's speed and time as 
     * arguments, and returns the distance the vehicle has traveled. Modify the 
     * "Distance Traveled" program you wrote in Assignment #4 to use this 
     * method.
     * - Gaddis pg. 319
     */
    // TODO: Build the distance method here
    public static void doExercise3() throws IOException {

        Scanner input = new Scanner(System.in);
        
        double speed, time;

        System.out.print("Input your speed : ");
        
        do {
            speed = input.nextDouble();

            if (speed < 0) {
                System.out.println("\n" + "Your speed is negative!");
                System.out.print("Input your speed again with a postive value : ");
            }
        } while (speed < 0);

        System.out.print("Input your time : ");
        
        do {
            time = input.nextDouble();

            if (time < 1) {
                System.out.println("\n" + "Your time traveled is less than an hour!");
                System.out.print("Input your time again with a value more than or equal to 1 : ");
            }
        } while (time < 1);

        String fname = "ex3_distance.txt";
        FileWriter file = new FileWriter(fname);
        PrintWriter out = new PrintWriter(file);

        out.println("\n" + "Hour" + "\t" + "Distance" + " \n" + "---------------------------");

        for (int hours = 1; hours <= time; hours++) {
            out.printf("%d\t%.2f", hours, distance(hours, speed)); // Using a method calculating a distance traveled
        }
        
        System.out.println("You can check the result at " + fname + ".\n");
        
        out.close();
    }

    public static double distance(int hours, double speed) //The method of Problem3
    {
        return (double) hours * speed;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    /*
     * Exercise #4 - isPrime Method
     * 
     * A prime number is a number that is evenly divisible only by itself and 1. 
     * For example, the number 5 is prime because it can be evenly divided only 
     * by 1 and 5. The number 6, however, is not prime because it can be divided 
     * evenly by 1, 2, 3, and 6.
     * Write a method named isPrime, which takes an integer as an argument and 
     * returns true if the argument is a prime number, or false otherwise.
     * - Gaddis pg. 320
     */
    // TODO: Build the isPrime method here
    public static void doExercise4() {

        Scanner kb = new Scanner(System.in);
        System.out.print("Input your number : ");

        int number = kb.nextInt();
        System.out.print("Is the number a prime number? ");
        System.out.println(isPrime(number)+"\n");
    }

    public static boolean isPrime(int number) // A method for Problem4
    {
        boolean flag = true;  //When 2 is input, this flag will be automatically true (Prime number) by this initialization, not executing the bellow loop. 

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    /*
     * Exercise #5 - Even/Odd Counter
     * 
     * You can use the following logic to determine if a number is even or odd:
     *   if ((number % 2) == 0) {
     *     // The number is even
     *   }
     *   else {
     *     // The number is odd
     *   }
     * Write a program method named isEven that accepts an int argument. The 
     * method should return true if the argument is even, or false otherwise.
     */
    // TODO: Build the isEven method here
  
    public static void doExercise5() {

        int number1=13;
        int number2=111;
        
        System.out.println(number1+" is even? "+isEven(number1));  //True
        System.out.println(number2+" is even? "+isEven(number2) +"\n");  //False
    }

    public static boolean isEven(int number) { // A method for Problem5
        
        boolean flag;

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
