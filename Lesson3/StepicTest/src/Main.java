public class Main {

    public static void main(String[] args) {

        System.out.println((int)2016/100);
    }


    public static int leapYearCount(int year) {
        int yearh = 0;
        int yearh4 = 0;
        if(year % 100 == 0) {
            yearh = year / 100;
        }
        if(year % 400 == 0) {
            yearh4 = year / 400;
        }
        return year/4 - yearh + yearh4;
    }

}
