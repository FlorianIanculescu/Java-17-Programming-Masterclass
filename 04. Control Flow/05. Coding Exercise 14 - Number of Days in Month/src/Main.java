public class Main {
    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println();

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));

    }

    public static boolean isLeapYear (int year) {

        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 400 == 0) {
            return true;
        }

        return false;
    }

    public static int getDaysInMonth (int month, int year) {

        if(month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        boolean isLeap = isLeapYear(year);

        int numberOfDays = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> {
                if (isLeap) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            case 4, 6, 9, 11 -> 30;
            default -> -1;
        };
        return numberOfDays;
    }
}