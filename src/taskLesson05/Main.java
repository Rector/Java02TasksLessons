package taskLesson05;

import java.util.Arrays;

public class Main {

//  1) Создают одномерный длинный массив, например:
//     static final int size = 10000000;
//     static final int h = size / 2;
//     float[] arr = new float[size];
//
//  2) Заполняют этот массив единицами;
//  3) Засекают время выполнения: long a = System.currentTimeMillis();
//  4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
//     arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5)
//     * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
//  5) Проверяется время окончания метода System.currentTimeMillis();
//  6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a);
//
//    Отличие первого метода от второго:
//    Первый просто бежит по массиву и вычисляет значения.
//    Второй разбивает массив на два массива, в двух потоках высчитывает новые значения
//    и потом склеивает эти массивы обратно в один.
//
//    Пример деления одного массива на два:
//    System.arraycopy(arr, 0, a1, 0, h);
//    System.arraycopy(arr, h, a2, 0, h);
//
//    Пример обратной склейки:
//    System.arraycopy(a1, 0, arr, 0, h);
//    System.arraycopy(a2, 0, arr, h, h);
//
//    Примечание:
//    System.arraycopy() – копирует данные из одного массива в другой:
//    System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника,
//    массив-назначение, откуда начинаем записывать данные в массив-назначение, сколько ячеек копируем)
//    По замерам времени:
//
//    Для первого метода надо считать время только на цикл расчета:
//    for (int i = 0; i < size; i++) {
//        arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5)
//        * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
//    }
//
//    Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и склейки.

    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;


    private static void operationWithArrayInTwoThreads() {
        float[] array = new float[SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1F;
        }

        float[] halfArray1 = new float[HALF];
        float[] halfArray2 = new float[HALF];

        long mainTime = System.currentTimeMillis();
        long time = System.currentTimeMillis();
        System.arraycopy(array, 0, halfArray1, 0, HALF);
        System.arraycopy(array, HALF, halfArray2, 0, HALF);

        System.currentTimeMillis();
        System.out.println("Array breakdown time by two: " + (System.currentTimeMillis() - time));

        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < halfArray1.length; i++) {
                    halfArray1[i] = (float) (array[i] * Math.sin(0.2F + i / 5)
                            * Math.cos(0.2F + i / 5) * Math.cos(0.4F + i / 2));
                }
            }
        }, "Thread two");

        time = System.currentTimeMillis();
        threadTwo.start();

        System.currentTimeMillis();
        System.out.println("Calculation time for the first array: " + (System.currentTimeMillis() - time));

        Thread threadThree = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < halfArray2.length; i++) {
                    halfArray2[i] = (float) (array[i] * Math.sin(0.2F + i / 5)
                            * Math.cos(0.2F + i / 5) * Math.cos(0.4F + i / 2));
                }
            }
        }, "Thread three");

        time = System.currentTimeMillis();
        threadThree.start();

        System.currentTimeMillis();
        System.out.println("Calculation time for the second array: " + (System.currentTimeMillis() - time));

        try {
            threadTwo.join();
            threadThree.join();
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        time = System.currentTimeMillis();
        System.arraycopy(halfArray1, 0, array, 0, HALF);
        System.arraycopy(halfArray2, 0, array, HALF, HALF);
        System.currentTimeMillis();
        System.out.println("Bonding time of two arrays into one: " + (System.currentTimeMillis() - time));

        System.currentTimeMillis();
        System.out.println("Task execution time in two threads: " + (System.currentTimeMillis() - mainTime));
    }

    public static void main(String[] args) {

        SampleThread t1 = new SampleThread("Thread one");

        t1.operationWithArrayInOneThread();

        operationWithArrayInTwoThreads();

    }

}
