package ua.ithillel.homework3;

import static java.lang.Math.*;
import static java.lang.System.*;

// 3.Написати програму, яка буде порівнювати абсолютні значення двох чисел.
// Наприклад, для чисел 3 та -9 прогама повинна надрукувати, що -9 має більше абсолютне значення.
// Для визначення абсолютного значення можна скористатися методом зі стандратної бібліотеки Math.abs()
public class Task3 {
    public static void compareTwoNumbers(int first, int second) {
        if (abs(first) == abs(second)) {
            out.println("Числа равны по абсолютным значениям");
            return;
        }

        if (abs(first) > abs(second)) {
            out.println("Число " + first + " больше числа " + second + " по абсолютному значению");
        } else {
            out.println("Число " + second + " больше числа " + first + " по абсолютному значению");
        }
    }
}
