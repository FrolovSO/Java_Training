package test1;

public abstract class Car {
    protected String brend;
    protected String model;



    protected String body;
    protected String engine;
    protected String box;
    protected String wheels = "Wheels";
    protected String audio;

    protected double priseBody;
    protected double priseEngine;
    protected double priseBox;
    protected double priseWheels;
    protected double priseAudio;


    public Car() {
        System.out.println("Car constructor");
        this.priseWheels = 500;
    }

    public void print() {
        System.out.println("Car brend "  + brend + " Model " + model);
    }
    public void printCost(){
        double allPrise = priseWheels + priseAudio + priseEngine + priseBox + priseBody;
        System.out.println("totlCost " + allPrise);

    }
    public void complectation(){
        System.out.println("Your complectation: body:" + " " + body + " = " + priseBody + " engine :" + engine + " " + priseEngine + "  box: "+ box + " " + priseBox +
                " wheels :" + wheels + " " + priseWheels + "  audio:"+ audio + " " +priseAudio);
    }

    public abstract void changeEngine();

    public String getEngine() {
        return engine;
    }
}
