public class Main {

    public static void main(String[] args) {
        //Task 9.  Write a Java program to insert an element (specific position) into an array.
        int[] before = {12, 85, 66, 12, 44, 0, 0, 0, 0, 0};
        int pos = 3;
        int elem = 25;

        int[] after = new int[before.length + 1];
        System.arraycopy(before,0,after,0,pos);
        after[pos-1] = elem;
        System.arraycopy(before,pos,after, pos,before.length-pos);

        System.out.println("Первый массив: ");
        printArray(before);
        System.out.println("Изменненый: ");
        printArray(after);
    }

    static void printArray(int[] array){
        for(int i : array)
            System.out.printf("%3d",i);
        System.out.println();
    }
}
