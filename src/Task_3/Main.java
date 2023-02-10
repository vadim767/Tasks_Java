package Task_3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = fillArray();
        float average = getAverage(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println("Average: " + average);
    }

    public static float getAverage(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i];
        }

        return (float)sum / arr.length;
    }

    public static int[] fillArray() {
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; ++i) {
            arr[i] = i + 1;
        }

        return arr;
    }
}
