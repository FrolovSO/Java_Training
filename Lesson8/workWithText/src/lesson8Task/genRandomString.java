package lesson8Task;
import java.util.Random;

public class genRandomString {
    // generate a length of 100 characters
    // Find the last occurrence of the letter Z in this line and display its id
    // Find the xx pattern in this line and replace with large letters QQ
    public static void main(String[] args) {
        Random ran = new Random();
        int top = 99;
        char data = ' ';
        String dat = "";

        for (int i=0; i<=top; i++) {
            data = (char)(ran.nextInt(23)+100);
            dat = data + dat;
        }
        System.out.println(dat);
        System.out.println(dat.replaceAll("xx","QQ"));
        System.out.println(dat.indexOf("z"));
    }
}
