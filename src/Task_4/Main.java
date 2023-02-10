package Task_4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = fillArray();

        System.out.println(Arrays.toString(arr));
        showSumEvenAndOddElements(arr);
    }

    public static int[] fillArray() {
        int[] arr = new int[30];

        for (int i = 0; i < arr.length; ++i) {
            arr[i] = i + 1;
        }

        return arr;
    }

    public static void showSumEvenAndOddElements(int[] arr) {
        int sumEven = 0;
        int sumOdd = 0;

        for (int j : arr) {
            if (j % 2 == 0) {
                sumEven += j;
            } else {
                sumOdd += j;
            }
        }

        System.out.println("Even: " + sumEven);
        System.out.println("Odd: " + sumOdd);
    }
}
