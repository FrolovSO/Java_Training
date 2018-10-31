public class Main {

    public static void main(String[] args) {
        //Task 3. Write a Java program to print the following grid
        String[][] grid = {
                {"_","_","_","_","_","_","_","_","_","_"},
                {"_","_","_","_","_","_","_","_","_","_"},
                {"_","_","_","_","_","_","_","_","_","_"},
                {"_","_","_","_","_","_","_","_","_","_"}
        };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }


    }
}
