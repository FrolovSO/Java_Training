package Trening5;

public class OffroadCar extends Car {
    public OffroadCar(){
        this.madel = "Patriot";
        this.brend = "UAZ";
        this.type = "Offroad";
        this.tank = 80;
    }
    @Override
    public String printName(){
        return brend + madel;
    }
    @Override
    public String printType(){
        return type;
    }

    @Override
    public int printFillCar() {
        return tank *2;
    }
}
