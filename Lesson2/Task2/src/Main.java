public class Main {

    public static void main(String[] args) {
        //Task 2. Write a Java program to sum values of an array.
        int sumarr[] = new int[10];
        for(int i = 0; i < sumarr.length; i++) {
            sumarr[i] = (int)(Math.random() * 10);
            System.out.print(sumarr[i] + "  ");
        }
        int sum = 0;
        for (int j = 0; j < sumarr.length; ++j){
            sum += sumarr[j];
        }
        System.out.println("sum values of an array " + sum);

    }
}
