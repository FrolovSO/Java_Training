package Trening5;

import java.util.Objects;

public abstract class Car implements TankSizs, SecondInterface {
    public String brend;
    public String madel;
    public String type;
    public int tank;



    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getMadel() {
        return madel;
    }

    public void setMadel(String madel) {
        this.madel = madel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTank() {
        return tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return tank == car.tank &&
                Objects.equals(brend, car.brend) &&
                Objects.equals(madel, car.madel) &&
                Objects.equals(type, car.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brend, madel, type, tank);
    }



}
