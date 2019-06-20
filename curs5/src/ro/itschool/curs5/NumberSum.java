package ro.itschool.curs5;

public class NumberSum {
    public int calaculate(int number) {
        int sum = 0;
        do {
            if (number % 2 == 0) {
                sum = sum + number % 10;
                number = number / 10;
            } else
                number = number / 10;

        } while (number != 0);

        return sum;
    }
}
