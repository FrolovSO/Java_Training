public class Main {

    public static void main(String[] args) {
//        1. Напишите программу, которая вычисляет ваш вес на Луне с учетом того, что сила тяжести равна 16% от силы тяжести на Земле.
        int weight = 76;
        double OnTheMoon = 0.16;
        double weightOnTheMoon = weight * OnTheMoon;

        System.out.println(weightOnTheMoon);
//        2. Напишите метод, который будет увеличивать каждый элемент массива на 10%.
        int[] cats = {10, 20, 40, 80, 120};

        for (int i = 0; i < cats.length; i++) {
            cats[i] = (int) (cats[i] * 1.1);
            System.out.print(cats[i]);
        }
//        3. Напишите метод, который будет проверять является ли число палиндромом (одинаково читающееся в обоих направлениях).
        int[] a = {1,2,3,4,3,2,1};
        boolean t = true;
        for(int i=0; i<(a.length+1)/2 && t; i++)
            t = a[i] == a[a.length-i-1];
        System.out.println(t? "Это полиндром":"Это не полиндром");
//         4. Вывести на экран все четные цифры от 1 до 100 (используйте остаток от деления)
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0) {
                System.out.print(i);
            }
        }
//        5. Вывести на  экран все нечетные цифры от 1 до 15 (используйте остаток от деления)
        int whileOperator = 1;
        while (whileOperator <= 15){
            if (whileOperator % 2 != 0) {
                System.out.println(whileOperator);
            }
            whileOperator++;
        }
//        6. Вывести на  экран все четные цифры от 1 до 100 не используя остаток от деления (используя только цикл for)
        for (int i = 1; i <= 100; i++){
            if ((i & 1) == 0) {
                System.out.print(i);
            }
        }
        System.out.println();

//        7. Посчитать сумму цифр от 20 до 200 и результат вывести на экран (используя цикл for)
        int sum = 0;
        for (int i=20; i<=200; i++){
            sum += i;
        }
        System.out.print("Summa ot 20 do 200 " + sum);
        System.out.println();
//        8. Пройти циклом по числам от 1 до 12 и вывести название месяца, соответствующее каждому числу (используя цикл и оператор if else)
        for (int i = 0; i < 13; i++){
            if (i == 1){
                System.out.print(i + "Jan ");
            }
            if (i == 2){
                System.out.print(i + "Feb ");
            }
            if (i == 3){
                System.out.print(i + "Mar ");
            }
            if (i == 4){
                System.out.print(i + "Apr ");
            }
            if (i == 5){
                System.out.print(i + "May ");
            }
            if (i == 6){
                System.out.print(i + "Jun ");
            }
            if (i == 7){
                System.out.print(i + "Jul ");
            }
            if (i == 8){
                System.out.print(i + "Aug ");
            }
            if (i == 9){
                System.out.print(i + "Sep ");
            }
            if (i == 10){
                System.out.print(i + "Oct ");
            }
            if (i == 11){
                System.out.print(i + "Nov ");
            }
            if (i == 12){
                System.out.print(i + "Dec ");
            }
        }
        System.out.println();
//        9 Объявить 2 переменных целого типа. Необходимо поменять значения переменных так, чтобы значение первой оказалось во второй, а второй - в первой.
        int one = 2;
        int two = 5;
        int temp = one;
        one = two;
        two = temp;

        System.out.println(one + " " + two);

//        10. Напишите программу с тремя переменными целого типа, первым двум присвойте значения, а третьей переменной присвойте их сумму. Выведете значение третей переменной на экран.
        int first = 8;
        int second = 3;
        int thoad = first + second;
        System.out.println(thoad);
//        11. Напишите программу с тремя переменными целого типа. Определить какое из них наибольшее.
        int z = 2;
        int x = 8;
        int v = 5;

        if (z > x){
            if (z > v){
                System.out.println(z);
            }
            else {
                System.out.println(v);
            }

        }
        else {
            if (x > v){
                System.out.println(x);
            }
            else {
                System.out.println(v);
            }
        }

//        12. Напишите программу, в которой используются две переменные логического типа (boolean), присвойте им значения и выведете для каждой переменной на экран строку "истина", если переменная имеет значение true и "ложь", если переменная имеет значение false.
        boolean boolFirst = true;
        boolean boolSecond = false;
        System.out.print("boolFirst|boolSecond " + (boolFirst|boolSecond));
        System.out.println(" boolFirst&boolSecond " + (boolFirst&boolSecond));
//        13. Напишите программу, где двум строковым переменным присваиваются значения, третей же строковой переменных присвойте объединение (конкатенацию) двух предыдущих строк. Затем напечатайте значение третьей строковой переменной.
        String rowOne = "rowOne";
        String rowSecond = "rowSecond";
        System.out.println( " конкатенация " + rowOne + rowSecond);
//        14. Создайте программу с двумя переменными целого типа, присвойте им значения, если первая переменная больше второй,
// то увеличьте её значение на 3, иначе увеличьте значение второй переменной на 8. В конце программы выведите значения обоих чисел на экран.
        int p = 32;
        int o = 56;
        if (p > o){
            p = p + 3;
        } else o = o +8;
        System.out.print(" " + p);
        System.out.println(" " + o);
//        15. Выведете на экран все числа от 1 до 100 с помощью цикла (можно все три варианта в одной программе):
//        for
//        while
//        do while
        for (int i = 0; i <= 100; i++) {
                System.out.print(", " + i);
            }
        System.out.println();

        int whileOp = 0;
        while (whileOp < 100) {
                System.out.print(", " + whileOp);
            whileOp++;
        }
        System.out.println();

        int doWhileOp = 0;
        do {
            System.out.print(", " + doWhileOp);
            doWhileOp++;
        } while (doWhileOp < 100);
        System.out.println();

//        16. Вывести на экран ряд натуральных чисел от минимума до максимума с шагом. Например, если минимум 10, максимум 35,
// шаг 5, то вывод должен быть таким: 10 15 20 25 30 35. Минимум, максимум и шаг указываются пользователем (можно захардкодить).

        for (int i = 10; i <= 35; i = i + 5) {
            System.out.print(", " + i);

        }
        System.out.println();
//        17. Все элементы массива поделить на значение наибольшего элемента этого массива.
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
        for (int i = 1; i < array.length; i++){
            System.out.print(", " + i / max);
        }
        System.out.println();
//        18. Напишите метод переводящий рубли в доллары по заданному курсу. В качестве аргументов укажите кол-во рублей и курс.
        double kollRubls = 10 ;
        double kurs = 2.1;
        double baks = kollRubls*kurs;
        System.out.println(kollRubls + "в  доллары по заданному курсу " + "= " + baks);
    }

}
