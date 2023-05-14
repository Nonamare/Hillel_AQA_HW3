import ua.ithillel.homework3.*;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

// Homework #3
public class Main {
    public static void main(String[] args) {

        /* Task 1
        Task1 task1 = new Task1();
        Task1.checkOddEven();
        System.out.println("BYE");
         */

        /* Task 2
        out.print("Enter a month number: ");

        Scanner reader = new Scanner(in);
        int monthNumber;
        try {
            monthNumber = reader.nextInt();
        } catch (InputMismatchException e) {
            out.println("The program is not smart enough - please enter a number");
            return;
        }
        out.println("Output by If statement: " + Task2.numberToMonthIf(monthNumber));
        out.println("Output by Switch statement: " + Task2.numberToMonthSwitch(monthNumber));
        out.println("Output by Array analysis statement: " + Task2.numberToMonthArray(monthNumber));
        */

        /* Task 3
        out.print("Enter two numbers: ");

        Scanner reader = new Scanner(in);
        int first;
        int second;
        try {
            first = reader.nextInt();
        } catch (InputMismatchException e) {
            out.println("The program is not smart enough - please enter a number");
            return;
        }
        try {
            second = reader.nextInt();
        } catch (InputMismatchException e) {
            out.println("The program is not smart enough - please enter a number");
            return;
        }
        Task3.compareTwoNumbers(first, second);
        */

        // Task 4
        // Task4.isTriangleSquare();

        // Task 5
        Task5.getMiddle();

    }
}