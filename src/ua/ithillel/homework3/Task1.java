package ua.ithillel.homework3;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.*;

// 1.Написати програму "CheckOddEven" яка друкує "Odd number", якщо змінна непарна,
// або "Even number", якщо парна. Перед завершенням роботи програма має друкувати "BYE".
// Значення змінної можна задати вручну через Scanner або присвоїти початкове значення в коді
public class Task1 {
    public static void checkOddEven() {
        out.print("Enter a number: ");

        Scanner reader = new Scanner(in);
        int num;
        try {
            num = reader.nextInt();
        } catch (InputMismatchException e) {
            out.println("The program is not smart enough - please enter a number");
            return;
        }
        if (num % 2 == 0) {
            out.println("Even number");
        } else {
            out.println("Odd number");
        }
    }
}