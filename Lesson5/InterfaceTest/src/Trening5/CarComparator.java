package Trening5;

import java.util.Comparator;

public class CarComparator implements Comparator<TankSizs> {

    @Override
    public int compare(TankSizs o1, TankSizs o2) {
        return o1.printFillCar() > o2.printFillCar() ? -1 : 1;
    }
}
