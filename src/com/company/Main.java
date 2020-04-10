package com.company;

/*
 * Created by: Maria Temu
 * Created on: 3-April-2020
 * Created for: ICS4U
 * Day #26 (Factorial )
 * This program calculates the factorial
 * (using recursion rather than a loop)
 */

import java.util.Scanner;

public class Main {

    public static void main(String args[])
    {
        int i, factorial = 1;

        System.out.println("Please enter a number: ");
        Scanner read = new Scanner(System.in) ;
        int number = read.nextInt();
        //int number = 0;

        factorial = fact(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    static int fact(int n) {
        if (n == 0)
            return 1;
        else
            return (n * fact(n - 1));
    }
}

