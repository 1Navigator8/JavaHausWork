package org.example6;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {1, 0, 2, 8, 6, 5, 4, 7};
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int expectedSum = (max * (max + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int missingNumber = expectedSum - sum;
        System.out.println("Missing number is " + missingNumber);
    }
}


