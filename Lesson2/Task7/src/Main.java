import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Task 7.  Write a Java program to remove a specific element from an array.
        int[] arrayForValue;
        arrayForValue = new int[20];
        for (int i = 0; i < arrayForValue.length; i++) {
            arrayForValue[i] = (int)(Math.random()*10);
            System.out.print(" " +arrayForValue[i]);
        }
        System.out.println(" ");
        int specificValue = 1;
        for (int j = 0; j < arrayForValue.length; j++){
            if (arrayForValue[j] == specificValue) continue;
                System.out.print(" " + arrayForValue[j]);


        }

    }
}
