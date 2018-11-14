package Trening5;

public class CityCar extends Car {
    public CityCar(){
        this.madel = "Yaris";
        this.brend = "Toyota";
        this.type = "Cit";
        this.tank = 40;
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
