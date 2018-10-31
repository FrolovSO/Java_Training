package com.company;

public class Main {

    public static void main(String[] args) {
        //Task 6.  Write a Java program to find the index of an array element.
        int[] array;
        array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
            System.out.print(" " + array[i]);
        }
        int Max = 0;
        int Min = 0;
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > array[Max])
            {
                Max = i;
            }
            else if (array[i] < array[Min])
            {
                Min = i;
            }
        }
        System.out.println(" index Max value  " + "[" + Max + "]" + " " + "index Min value " + "[" + Min + "]");
    }
}
