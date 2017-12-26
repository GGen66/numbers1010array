package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[20];                                  //создали  массив
        int i, Max = 0, Min = 0, MaxNum = -11, MinNum = 11;     //обьявили переменные


        for (i = 0; i < 20; i++) {
            array[i] = ((int) (Math.random() * 20) - 10);      // Цикл наполнение массива от -10 до 10 числами "рандом"
            System.out.println("Mass[" + i+ "]= " + array[i]);                   // вывели что для наглядности в консоль

            if (array[i] > MaxNum) {
                Max = i;                                //Нашли максимальное значение
                MaxNum = array[i];
            }

            if (array[i] < MinNum) {
                Min = i;                                //Нашли минимальное значение
                MinNum = array[i];
            }
        }
        System.out.println("number Max " + array[Max] + " number Min " + array[Min]);    // вывели что для наглядности в консоль


        array[Min] = MaxNum;                   //поменяли местами значение мин и макс, первые попавшиеся
        array[Max] = MinNum;


        for (i = 0; i < 20; i++) {

            System.out.println("Mass[" + i + "]= " + array[i]);           //вывели что для наглядности в консоль
        }

    }
}

