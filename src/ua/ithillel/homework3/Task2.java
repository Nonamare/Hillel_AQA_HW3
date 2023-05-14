package ua.ithillel.homework3;

//2.Написати програму "PrintMonthInWord" яка друкує "JAN", "FEB" ... "DEC"
// якщо значення int змінної дорівнює 1, 2, 3 ... 12.
// Або повинна вивести "Not a valid month". Розв'язати завдвння 2 способами:
// 1) за допомогою операторів if-else
// 2) за допомогою оператора switch
public class Task2 {

    static String[] months;

    static {
        months = new String[]{"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
    }

    public static String numberToMonthIf(int monthNumber) {

        // Checking if monthNumber is valid month number
        if ((monthNumber > 12) || (monthNumber < 1)) return "Not a valid month";

        // Transformation
        if (1 == monthNumber) return months[0];
        if (2 == monthNumber) return months[1];
        if (3 == monthNumber) return months[2];
        if (4 == monthNumber) return months[3];
        if (5 == monthNumber) return months[4];
        if (6 == monthNumber) return months[5];
        if (7 == monthNumber) return months[6];
        if (8 == monthNumber) return months[7];
        if (9 == monthNumber) return months[8];
        if (10 == monthNumber) return months[9];
        if (11 == monthNumber) return months[10];

        return months[11];
    }

    public static String numberToMonthSwitch(int monthNumber) {

        // Transformation
        switch (monthNumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return months[monthNumber - 1];
            default:
                return "Not a valid month";
        }
    }

    public static String numberToMonthArray(int monthNumber) {
        try {
            return months[monthNumber - 1];
        } catch (Exception e) {
            return "Not a valid month";
        }
    }
}
