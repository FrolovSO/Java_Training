package test1;

import java.util.Date;

public class Train {
    //Пункт назначения, Номер поезда, Время отправления, Число мест (общих, купе, плацкарт, люкс).
    protected String navigateTo;
    protected int namberTrain;
    protected Integer hours;
    protected Integer min;
    protected int numberCoupe;
    protected int numberCommon;
    protected int numberReserved;
    protected int numberLuxury;


    public Train(String navigateTo, int namberTrain, Integer hours, Integer min, int numberCoupe, int numberReserved, int numberCommon, int numberLuxury) {
        System.out.println("Train constructor");
        this.navigateTo = navigateTo;
        this.namberTrain = namberTrain;
        this.hours = hours;
        this.min = min;
        this.numberCoupe = numberCoupe;
        this.numberReserved = numberReserved;
        this.numberCommon = numberCommon;
        this.numberLuxury = numberLuxury;
    }


    public void print() {
        System.out.print("Train " + namberTrain + " ");
        System.out.print("Navigate " + navigateTo + " ");
        System.out.println("Time " + "h " + hours + "m " + min);

    }

    public void print2() {
        System.out.print("Train " + namberTrain + " ");
        System.out.print("Navigate " + navigateTo + " ");
        System.out.print("Time " + "h " + hours + "m " + min);
        System.out.println("having common places " + numberCommon);

    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public String getNavigateTo() {
        return navigateTo;
    }

    public void setNavigateTo(String navigateTo) {
        this.navigateTo = navigateTo;
    }

    public int getNumberCommon() {
        return numberCommon;
    }

    public void setNumberCommon(int numberCommon) {
        this.numberCommon = numberCommon;
    }
}
