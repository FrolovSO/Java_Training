package test1;

import java.util.Date;

public class Train {
    //Пункт назначения, Номер поезда, Время отправления, Число мест (общих, купе, плацкарт, люкс).
    protected String navigateTo;
    protected int namberTrain;
    protected Integer hours;
    protected Integer min;
    protected int numberCoupe;
    protected int numberReserved;
    protected int numberSuite;
    private int freePlaces;

    public Train(String navigateTo, int namberTrain, Integer hours, Integer min) {
        System.out.println("Train constructor");
        this.navigateTo = navigateTo;
        this.namberTrain = namberTrain;
        this.hours = hours;
        this.min = min;
    }

    public void namberPlaces(){
        System.out.println("All plases " + numberCoupe + numberReserved + numberSuite);
    }

    public void showAll(){
        System.out.println("Train " + namberTrain);
        System.out.println("Namber " + namberTrain);
        System.out.println("Time " + hours + "" + min);

    }

    public void fromToX() {
        if ((this.navigateTo).equals("Minsk")) {
            System.out.println("TrainNamber" + namberTrain);
            System.out.println(" " + navigateTo);
            System.out.println(" " + hours + " " + min);
        }

    }

    public void setFreePlaces(int freePlaces) {
        this.freePlaces = freePlaces;
    }

    public int getFreePlaces() {
        return freePlaces;
    }
}
