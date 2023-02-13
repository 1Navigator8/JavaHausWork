package org.example._14_02_23;

import java.util.Arrays;
//Описание занятия: Написать метод который
// проходится по массиву Int[]
//умножает каждое четное число на 3 а не четное на 5,
// далее надо отфильтровать  числа которые больше 25
// и посчитать их сумму и вывести на экран.
public class HW1801 {

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 7, 8};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] *= 3;
            } else {
                array[i] *= 5;
            }

            if (array[i] > 25) {
                sum += array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(sum);


    }
}