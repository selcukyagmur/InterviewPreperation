package top50JournalDev;

import java.util.Arrays;

public class Q10SortAnArray {

    public static void main(String[] args) {

        int [] arr={1,2,3,0,8,6,91,5};

        sortArray(arr);
    }

    private static void sortArray(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
