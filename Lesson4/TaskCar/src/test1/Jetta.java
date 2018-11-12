package test1;

public class Jetta extends  VW {

    public Jetta() {
        System.out.println("Jetta constructor");
        this.model = "Jetta";
        this.body = "Sedan";
        this.priseBody = 3000;
        this.box = "Manual";
        this.priseBox = 700;
    }

    @Override
    public void changeEngine() {
        this.engine = this.engine + 1000;
    }

//    @Override
//    public void printCost() {
//
//
//    }



}
