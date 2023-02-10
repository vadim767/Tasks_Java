package Task_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = fillArray(20);

        sort(arr);

        System.out.println(Arrays.toString(arr));

    }


    public static int[] fillArray(int count) {
        int[] arr = new int[count];

        for (int i = 0; i < arr.length; ++i) {
            arr[i] = (int)(Math.random() * 1001);
        }

        return arr;
    }

    public static void sort(int[] sortArr) {
        int j;
        for (int i = 1; i < sortArr.length; i++) {
            //сохраняем ссылку на индекс предыдущего элемента
            int swap = sortArr[i];
            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
    }


}
