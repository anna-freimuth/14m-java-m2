package HW07modul2;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 3, 1, 4};
        System.out.println(Arrays.toString(fix34(arr1)));// → [1, 3, 4, 1]
        int[] arr2 = new int[]{1, 3, 1, 4, 4, 3, 1};
        System.out.println(Arrays.toString(fix34(arr2)));// → [1, 3, 4, 1, 1, 3, 4]
        int[] arr3 = new int[]{3, 2, 2, 4};
        System.out.println(Arrays.toString(fix34(arr3)));//  → [3, 4, 2, 2]
        int[] arr4 = new int[]{3, 2, 4, 8, 3, 5, 4};
        System.out.println(Arrays.toString(fix34(arr4)));//  → [3, 4, 2, 8, 3, 4, 5]
    }

    private static int[] fix34(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3 && arr[i + 1] != 4) {
                for (int j = 2; j < arr.length; j++) {
                    if (arr[j] == 4 && arr[j - 1] != 3) {
                        arr[j] = arr[i + 1];
                        arr[i + 1] = 4;
                        break;
                    }
                }
            }
        }
        return arr;
    }
}

