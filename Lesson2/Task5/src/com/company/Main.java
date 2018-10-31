package com.company;
public class Main {

    public static void main(String[] args) {
        //Task 5.  Write a Java program to test if an array contains a specific value.
        int[] arrayForValue;
        arrayForValue = new int[20];
        for (int i = 0; i < arrayForValue.length; i++) {
            arrayForValue[i] = (int)(Math.random()*100);
            System.out.print(" " +arrayForValue[i]);
        }
        int specificValue = 99;
        for (int j = 0; j < arrayForValue.length; j++){
            if (arrayForValue[j] == specificValue){
                System.out.println(" array contain a specific value " + arrayForValue[j]);
            }

        }
    }
}
