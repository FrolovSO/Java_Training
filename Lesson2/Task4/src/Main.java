public class Main {

    public static void main(String[] args) {
        //Task 4.  Write a Java program to calculate the average value of array elements.
        int[] numbers = {5, 8, 12, 68, -57, 84, -35, 47, 37};

        double average = 0;
        if (numbers.length > 0)
        {
            double sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                sum += numbers[j];
            }
            average = sum / numbers.length;
        }
        System.out.println(average);

    }
}
