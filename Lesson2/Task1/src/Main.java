public class Main {

    public static void main(String[] args) {
        //Task 1. Write a Java program to sort a numeric array and a string array.
        int[] arrayForSorting;
        arrayForSorting = new int[10];
        for (int i = 0; i < arrayForSorting.length; i++) {
            arrayForSorting[i] = (int)(Math.random()*10);
            System.out.println(arrayForSorting[i]);
        }
        for(int d = arrayForSorting.length-1 ; d > 0 ; d--){
            for(int j = 0 ; j < d ; j++){
            if( arrayForSorting[j] > arrayForSorting[j+1] ){
                int tmp = arrayForSorting[j];
                arrayForSorting[j] = arrayForSorting[j+1];
                arrayForSorting[j+1] = tmp;
            }
        }

    }
        for(int k = 0; k <  arrayForSorting.length; k++) {
            System.out.print(arrayForSorting[k] + "  ");
        }

    }
}
