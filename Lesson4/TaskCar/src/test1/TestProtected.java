package test1;

public class TestProtected {
    public static void main(String[] args) {
        Car myCar = new Jetta();
        myCar.print();
        myCar.printCost();
        myCar.complectation();

        JettaMax maxJetta = new JettaMax();
        maxJetta.print();
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
        //Класс машина
        //5 деталей
        //цена
        //название + марка
        //1. Вывести стоимость автобиля
        //2. Вывести название фирмы + название модели
        //3. Провести замену деталей(изменить цену)
        //4. Пересчитать сумму автомобиля

    }
}
