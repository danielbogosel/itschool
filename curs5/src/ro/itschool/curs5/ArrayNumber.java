package ro.itschool.curs5;

public class ArrayNumber {
    public int arrayNumbers(int n, int k) {
        int[] array = new int[100];
        for (int i = 0; i < n; i++) {
            if (i % k == 0) {
                array[i] = i;
                return array[i];
            }

        }


    }
}
