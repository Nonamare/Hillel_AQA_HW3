package ua.ithillel.homework3;

import java.util.Scanner;

import static java.lang.System.*;

// Дано рядки різної довжини (довжина - парне число), необхідно повернути її два середні знаки.
// Наприклад, якщо даний рядок "Hillel" результат буде "ll", для рядка "Java" результат "av",
// для "Hometask" результат "et".
public class Task5 {

    private static char
    getCharFromString(String str, int index) {
        return str.charAt(index);
    }

    public static String getMiddle() {
        out.print("Enter a string: ");

        Scanner reader = new Scanner(in);
        String theString;
        theString = reader.next();

        if (theString.length() < 2) {
            out.println("The entered string length cannot be less than 2 char");
            return "The entered string length cannot be less than 2 char";
        }

        if (theString.length() % 2 != 0) {
            out.println("The entered string length should be even");
            return "The entered string length should be even";
        }

        int middle = Math.round(theString.length() / 2);
        char char1 = getCharFromString(theString, middle - 1);
        char char2 = getCharFromString(theString, middle);
        String result = Character.toString(char1) + Character.toString(char2);

        out.println("The string >" + theString + "< has characters >" + result + "< in the middle");
        return new String(result);
    }
}
