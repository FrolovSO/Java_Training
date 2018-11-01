public class Main {

    public static void main(String[] args) {
        //Task 8.  Write a Java program to copy an array by iterating the array.
        int[] arrayFrom = new int[20];
        for (int i = 0; i < arrayFrom.length; i++) {
            arrayFrom[i] = (int)(Math.random()*10);
            System.out.print(" " +arrayFrom[i]);
        }
        System.out.println(" ");
        int arrayTo [] = new int [20];
        System.arraycopy(arrayFrom, 0, arrayTo,0,20);
        for (int i = 0; i <arrayTo.length; i++) {
            System.out.print(" " + arrayTo[i]);
        }
    }
}
