public class Main {

    public static void main(String[] args) {
        //Task 10. Write a Java program to find the maximum and minimum value of an array.
        int[] array = new int[] {1, 2, 3, 4, 5, 4, 3, 2, 1, 2 };
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        System.out.println("Наибольший элемент: " + max);
        System.out.println();
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < max) min = array[i];
        }
        System.out.println("Наименьший элемент: " + min);

    }
}
