public class Main {

    public static void main(String[] args) {
        //Task 11. Write a Java program to reverse an array of integer values.
        int[] arrayForValue;
        arrayForValue = new int[20];
        
        for (int i = 0; i < arrayForValue.length; i++) {
            arrayForValue[i] = (int)(Math.random()*100);
            System.out.print(" " +arrayForValue[i]);
        }
        System.out.println();
        System.out.println(" reverse an array of integer values ");
        for (int i = arrayForValue.length - 1; i >= 0; i--) {
            System.out.print(" " + arrayForValue[i]);
        }


    }
}
