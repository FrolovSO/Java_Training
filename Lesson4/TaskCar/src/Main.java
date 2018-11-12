import test1.Car;
import test1.Golf;
import test1.Jetta;
import test1.JettaMax;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Jetta();
        myCar.print();
        myCar.printCost();
        myCar.complectation();

        JettaMax maxJetta = new JettaMax();
        System.out.println(maxJetta.toString());
        maxJetta.printCost();
        maxJetta.complectation();
        maxJetta.changeEngine();
        maxJetta.printCost();

        Golf golf = new Golf();
        golf.print();
        golf.printCost();
        golf.complectation();
        golf.changeTank();
        golf.printCost();
    }
}
