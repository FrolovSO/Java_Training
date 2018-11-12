import lesson4.A;
import lesson4.AbstractClass;
import lesson4.Lesson4;

public class Main {

    public static void main(String[] args) {
        Lesson4 testVar = new A();
        A aVar = new A();
        testVar.finalTest(2);
        aVar.finalTest(2);
        new A();

        System.out.println(testVar.getClass());
        System.out.println(aVar.getClass());

        System.out.println(testVar instanceof Lesson4);
        System.out.println(aVar instanceof A);
    }
}
