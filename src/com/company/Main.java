package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[20];
        int i ,j, Max = 0, Min = 0, MaxNum = -11, MinNum = 11;


        for (i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 20) - 10);
            System.out.println(array[i]);
        }

        for (i = 0; i < 20; ++i)
            if (array[i] > MaxNum) {
                MaxNum = array[i];
        }

        for (j = 0; j < 20; ++j)
            if (array[j] < MinNum) {
                Min = j;
                MinNum = array[j];
            }

        System.out.println("number Max " + array[Max]+ " number Min " + array[Min]);


    }
}