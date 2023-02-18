package org.example6;

public class HausWork {


    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 7, 7, 8, 8};

        int uniqueVal = 0;
        for (int i = 0; i < arr.length; i++) {
            uniqueVal = uniqueVal ^ arr[i];
        }
        System.out.println("Unique number is " + uniqueVal);


    }

}
