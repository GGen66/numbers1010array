package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[20];                                  //создали  массив
        int i, j, l, Max = 0, Min = 0, MaxNum = -11, MinNum = 11;     //обьявили переменные


        for (l = 0; l < 20; l++) {
            array[l] = ((int) (Math.random() * 20) - 10);      // Цикл наполнение массива от -10 до 10 числами "рандом"
            System.out.println(array[l]);                   // вывели что для наглядности в консоль
        }

        for (i = 0; i < 20; i++)
            if (array[i] > MaxNum) {
                Max = i;                                //Нашли максимальное значение
                MaxNum = array[i];
            }

        for (j = 0; j < 20; ++j)
            if (array[j] < MinNum) {
                Min = j;                                //Нашли минимальное значение
                MinNum = array[j];
            }

        System.out.println("number Max " + array[Max] + " number Min " + array[Min]);    // вывели что для наглядности в консоль
        
            int temp = array[Min];
            array[Min] = array[Max];                   //поменяли местами значение мин и макс, первые попавшиеся
            array[Max] = temp;

   for (l = 0; l < 20; l++) {
                                                        //вывели что для наглядности в консоль
            System.out.println(array[l]);}
            }
}