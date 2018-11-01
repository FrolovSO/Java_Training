import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Task 7.  Write a Java program to remove a specific element from an array.

        Scanner  s = new  Scanner(System.in);

        ArrayList<Integer> arrayremove = new ArrayList<Integer>();

        for(int i=0;i<10;i++) {
            arrayremove.add(i);
            System.out.print(arrayremove.get(i)+" ");
        }
        arrayremove.remove(5);

        System.out.println();
        for(int i=0;i<arrayremove.size();i++) {

            System.out.print(arrayremove.get(i)+" ");
        }

    }
}
