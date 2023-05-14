package ua.ithillel.homework3;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.*;

// Написати програму, яка визначає, чи є трикутник рівнобедреним. Значення сторін трикутника задавати самостійно
public class Task4 {

    private static int getSide() {
        out.print("Enter triangle side: ");

        Scanner reader = new Scanner(in);
        int sideSize = 0;
        try {
            sideSize = reader.nextInt();
        } catch (InputMismatchException e) {
            out.println("The program is not smart enough - please enter a number");
            exit(-1);
            //throw new RuntimeException("Only numbers are welcome");
        }

        return sideSize;
    }

    public static void isTriangleSquare() {
        int side1, side2, side3;
        side1 = getSide();
        side2 = getSide();
        side3 = getSide();

        // Checking if sides are entered correctly
        if ((side1 <= 0) || (side2 <= 0) || (side3 <= 0)) {
            out.println("Sides cannot be equal or less than 0");
        }

        // Complex calculations are almost here
        if ((side1 == side2) && (side2 == side3)) {
            out.println("The triangle is isosceles");
            return;
        }

        out.println("The triangle is NOT isosceles");
    }
}
